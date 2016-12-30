import React, { Component } from 'react';
import {
  AppRegistry,
 } from 'react-native';
 import App from 'app/App';

export default class App extends Component() {
    render() {
        return {
            <App />
        }
    }
}

// AppRegistry.registerComponent takes to parameters:
// 1st is the appKey => name of the actual application case sensitive
// 2nd is a function that returns the first Component of the application 
AppRegistry.registerComponent('TodoApp', () => TodoApp);
