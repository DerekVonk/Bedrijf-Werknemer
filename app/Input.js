import React, { Component } from 'react';

import {
    View,
    TextInput,
    StyleSheet
} from 'react-native';

export default class Input extends Component {
    constructor(props){
        super(props);
        console.log('these are the props in Input.js: ', props);
    }

    render() {
        // destructuring props
        const {inputValue, inputChange} = this.props;
        return(
            <View style={styles.inputContainer}>
                <TextInput
                    value={inputValue}
                    style={styles.input}
                    placeholder="What needs to be done?"
                    placeholderTextColor='#CACACA'
                    selectionColor='#666666'
                    onChangeText={inputChange}/>
            </View>
        )
    }
}

const styles = StyleSheet.create({
    inputContainer: {
        marginLeft: 20,
        marginRight: 20,
        shadowOpacity: 0.2,
        shadowRadius: 3,
        shadowColor: '#000000',
        shadowOffset: {
            width: 2,
            height: 2
        }
    },

    input: {
        height: 60,
        backgroundColor: '#ffffff',
        paddingLeft: 10,
        paddingRight: 10
    }
})
