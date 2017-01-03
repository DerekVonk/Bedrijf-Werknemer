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
        this.submitTodo = this.submitTodo.bind(this);
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
                console.log('State: ', this.state)
        })
    }

    render() {
        const { inputValue } = this.state
        return(
            <View style={ styles.container }>
                <ScrollView style={ styles.content }>
                    <Heading />
                    <Input
                    inputValue={ inputValue }
                    inputChange={ (text) => this.inputChange(text) } />
                    <Button submitTodo={this.submitTodo}/>
                </ScrollView>
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
