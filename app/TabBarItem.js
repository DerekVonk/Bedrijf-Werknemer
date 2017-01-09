import React, { Component } from 'react';
import {
  Text,
  TouchableHighlight,
  StyleSheet
} from 'react-native';

export default class TabBarItem extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    const {border, title, selected, setType, type} = this.props;
    return (
      <TouchableHighlight
        underlayColor='#efefef'
        onPress={setType}
        style={[
          styles.item,
          selected ? styles.selected : null,
          border ? styles.border : null,
          type === title ? styles.selected : null ]}>

        <Text style={[
          styles.itemText,
          type === title ? styles.bolded : null ]}>
            {title}
        </Text>
      </TouchableHighlight>
    );
  }
}

const styles = StyleSheet.create({
  item: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  },

  itemText: {
    color: '#777777',
    fontSize: 16
  },

  selected: {
    backgroundColor: '#ffffff'
  },

  bolded: {
    fontWeight: 'bold'
  },

  border: {
    borderLeftWidth: 1,
    borderLeftColor: '#dddddd'
  }
});
