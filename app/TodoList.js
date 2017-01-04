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
        const {todos, toggleComplete, deleteTodo} = this.props;
        // map over the todos
        // for each todo, pass the todo as a property to the Todo Component
        // specify a key index and pass the key to each Component
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
