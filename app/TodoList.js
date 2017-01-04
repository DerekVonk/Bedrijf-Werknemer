import React, {Component} from 'react';
import {
    View
} from 'react-native';

import Todo from './Todo';

export default class TodoList extends Component{
    constructor(props) {
        super(props);
    }

    render() {
        // destructuring props
        const {todos} = this.props;
        // map over the todos
        // for each todo, pass the todo as a property to the Todo Component
        // specify a key index and pass the key to each Component
        todos = todos.map((todo, i) => {
            return(
                <Todo key={i} todo={todo} />
            )
        }
        return(
            <View>
                {todos}
            </View>
        )
    }
}
