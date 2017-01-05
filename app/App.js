import React, { Component } from 'react';

import {
    AppRegistry,
    View,
    ScrollView,
    StyleSheet
} from 'react-native';

import Heading from './Heading';
import Input from './Input';
import Button from './Button';
import TodoList from './TodoList';
import TabBar from './TabBar';

// add index on todos in the scope of App.js
let todoIndex = 0;

export default class App extends Component {
    constructor() {
        super()
        this.state = {
            //array of todo's
            todos: [],
            // inputValue (string type) to add to todo's array
            inputValue: '',
            // todo type
            type: 'All'
        }
        // bind method to constructor. because we are using classes
        // , functions will not be autobound to the class
        // can also do this when using it in the render method to keep the
        // constructor cleaner
        this.submitTodo = this.submitTodo.bind(this);
        this.toggleComplete = this.toggleComplete.bind(this);
        this.deleteTodo = this.deleteTodo.bind(this);
        this.setType = this.setType.bind(this);
    }

    // Here the inputChange method is created, which takes inputValue as an argument.
    // this takes changes from the Input value and stores it in the state
    inputChange(inputValue) {
        // Log out the inputValuevalue to make sure the method is working
        console.log('Input value: ', inputValue);
        // set the state with the new value (same as this.setState({ inputValue: inputValue }) )
        this.setState({ inputValue });
    }

    // add submitTodo function to handle added todo from submit button
    submitTodo() {
        // if inputValue is empty return and do nothing
        if (this.state.inputValue.match(/^\s*$/)) {
            return
        }

        // create todo variable
        let todo = {
            // give this todo object a title, index and complete boolean
            title: this.state.inputValue,
            todoIndex: todoIndex,
            complete: false
        }
        todoIndex++
        this.state.todos.push(todo)

        this.setState(
            {todos: this.state.todos, inputValue: ''},
            // using an optional callback fucntion on setState to log to console
            () => {
                console.log('App.js state: ', this.state)
        })
    }

    // toggleComplete method takes the index to toggle and
    // loops over all todos currently in the state and finds
    // the todo item that coincides with the passed index
    toggleComplete(todoIndex) {
        let {todos} = this.state
        todos.forEach((todo) => {
            if (todo.todoIndex === todoIndex) {
                todo.complete = !todo.complete
            }
        })
        this.setState({todos});
    }

    // deleteTodo method takes the index of the selected todo
    // and filters out this from the todos array
    deleteTodo(todoIndex) {
        let {todos} = this.state
        todos = this.state.todos.filter((todo) => {
            return todo.todoIndex !== todoIndex
        });
        this.setState({todos});
    }

    // set the type of todo for the tapbar
    setType(type) {
        this.setState({type});
    }

    render() {
        const {inputValue, todos, type} = this.state;
        return(
            <View style={styles.container}>
                <ScrollView style={styles.content}>
                    <Heading />
                    <Input
                      inputValue={inputValue}
                      inputChange={(text) => this.inputChange(text)} />
                    <TodoList
                      type={type}
                      toggleComplete={this.toggleComplete}
                      deleteTodo={this.deleteTodo}
                      todos={todos}/>
                    <Button submitTodo={this.submitTodo}/>
                </ScrollView>
                <TabBar
                  type={type}
                  setType={this.setType}/>
            </View>
        )
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#f5f5f5'
    },
    content: {
        flex: 1,
        paddingTop: 60
    }
})

AppRegistry.registerComponent('TodoApp', () => App);
