package com.example.android.examplearraylist;

// a class for creating a custom Object with the number name and character
public class Number {
    private String sNumber_name;
    private String sNumberCharacter;

    // constructor of a Number object
    public Number(String number_name, String number_character) {
        sNumber_name = number_name;
        sNumberCharacter = number_character;
    }

    // getter for the name
    public String getsNumberName(){
        return sNumber_name;
    }

    // getter for the character
    public String getNumberCharacter() {
        return sNumberCharacter;
    }
}
