package com.core_java;

// A string variable contains a collection of characters surrounded by double quotes
public class String_1 {
    public static void main(String[] args) {


        String name = "I am Abir";
        //length
        System.out.println("Length " + name.length());

        // upperCase and lowerCase
        System.out.println("Upper case: " + name.toUpperCase());

// IndexOf
//        The indexOf() method returns the index (the position) of the first
//        occurrence of a specified text in a string (including whitespace):

        System.out.println("IndexOf: " + name.indexOf("am"));

// Concatenation
        String firstName = "Mim";
        String lastName = "Jim";

        System.out.println("First Name: " + firstName + " " + "Last Name: " + lastName);
        System.out.println(firstName.concat(" " + lastName));
        String text = "It's \n all";
        System.out.println(text);

    }

}
