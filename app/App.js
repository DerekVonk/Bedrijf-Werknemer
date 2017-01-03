import React, { Component } from 'react';

import {
    AppRegistry,
    View,
    ScrollView,
    StyleSheet
} from 'react-native';

import Heading from './Heading';
import Input from './Input';

export default class App extends Component {
    constructor() {
        super()
        this.state = {
            todos: [],
            inputValue: '',
            type: 'All'
        }
    }
    // Here the inputChange method is created, which takes inputValue as an argument.
    // this takes changes from the Input value and stores it in the state
    inputChange(inputValue) {
        // Log out the inputValuevalue to make sure the method is working
        console.log('Input value: ', inputValue);
        // set the state with the new value (same as this.setState({ inputValue: inputValue }) )
        this.setState({ inputValue });
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
