import React, { Component } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import StudentList from './StudentList';
import StudentEdit from "./StudentEdit";

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={StudentList}/>
            <Route path='/students/:id' component={StudentEdit}/>
          </Switch>
        </Router>
    )
  }
}

export default App;