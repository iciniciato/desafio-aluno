package desafio.aluno.insiders.repository;

import desafio.aluno.insiders.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}
