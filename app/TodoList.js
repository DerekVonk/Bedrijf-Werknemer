import React, {Component} from 'react';
import {
    View
} from 'react-native';

import Todo from './Todo';

export default class TodoList extends Component{
    constructor(props) {
        super(props);
        console.log('todolist props: ', props);
    }

    render() {
        let {todos, toggleComplete, deleteTodo, type} = this.props;
        // map over the todos
        // for each todo, pass the todo as a property to the Todo Component
        // specify a key index and pass the key to each Component

        const getVisibleTodos = (todos, type) => {
          switch (type) {
            case 'All':
              return todos
            case 'Complete':
              return todos.filter((t) => t.complete)
            case 'Active':
              return todos.filter((t) => !t.complete)
          }
        }
        todos = getVisibleTodos(todos, type);
        console.log('TodoList31 ', todos);

        let todoList = todos.map((todo, i) => {
                return(
                    <Todo
                        key={i}
                        todo={todo}
                        toggleComplete={toggleComplete}
                        deleteTodo={deleteTodo}
                    />
                )
            });

        return(
            <View>
                {todoList}
            </View>
        )
    }
}
