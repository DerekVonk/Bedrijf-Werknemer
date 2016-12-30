import React, { Component } from 'react';

import {
    AppRegistry,
    View,
    ScrollView,
    StyleSheet
} from 'react-native';

import Heading from './Heading';

export default class App extends Component {
    constructor() {
        super()
        this.state = {
            todos: [],
            inputValue: '',
            type: 'All'
        }
    }
    render() {
        return(
            <View style={ styles.container }>
                <ScrollView style={ styles.content }>
                    <Heading />
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
