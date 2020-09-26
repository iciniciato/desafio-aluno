import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';

class StudentList extends Component {

    constructor(props) {
        super(props);
        this.state = {students: [], isLoading: true};
        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('/students')
            .then(response => response.json())
            .then(data => this.setState({students: data, isLoading: false}));
    }

    async remove(id) {
        await fetch(`/students/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedStudentss = [...this.state.students].filter(i => i.id !== id);
            this.setState({students: updatedStudentss});
        });
    }

    render() {
        const {students, isLoading} = this.state;

        if (isLoading) {
            return <p>Loading...</p>;
        }

        const studentList = students.map(student => {
            return <tr key={student.id}>
                <td style={{whiteSpace: 'nowrap'}}>{student.id}</td>
                <td style={{whiteSpace: 'nowrap'}}>{student.name}</td>
                <td style={{whiteSpace: 'nowrap'}}>{student.age}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/students/" + student.id}>Alterar</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(student.id)}>Remover</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });

        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/students/new">Adicionar Estudante</Button>
                    </div>
                    <h3>Estudantes</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="20%">id</th>
                            <th width="20%">nome</th>
                            <th width="10%">idade</th>
                        </tr>
                        </thead>
                        <tbody>
                        {studentList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default StudentList;