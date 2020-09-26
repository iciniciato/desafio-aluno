package desafio.aluno.insiders.controllers;

import desafio.aluno.insiders.entity.StudentEntity;
import desafio.aluno.insiders.repository.StudentRepository;
import desafio.aluno.insiders.request.StudentRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class Student {

    private final StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity allStudent() {

        Iterable<StudentEntity> studentEntity = studentRepository.findAll();

        return ResponseEntity.ok().body(studentEntity);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getStudent(@PathVariable(value = "id") final Long id) {

        Optional<StudentEntity> studentEntity = studentRepository.findById(id);

        if (studentEntity.isPresent()) {
            return ResponseEntity.ok().body(studentEntity.get());
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity postStudent(@RequestBody final StudentRequest studentRequest) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentRequest.getName());
        studentEntity.setAge(studentRequest.getAge());

        studentRepository.save(studentEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteStudent(@PathVariable(value = "id") final Long id) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(id);

        studentRepository.delete(studentEntity);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity putStudent(@PathVariable(value = "id") final Long id,
                                     @RequestBody final StudentRequest studentRequest) {

        Optional<StudentEntity> studentEntity = studentRepository.findById(id);

        if (studentEntity.isPresent()) {
            StudentEntity student = studentEntity.get();
            student.setName(studentRequest.getName());
            student.setAge(studentRequest.getAge());
            studentRepository.save(student);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}