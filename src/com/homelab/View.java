package com.homelab;

public class View {
    // Text's constants
    public static final String INPUT_STRING_FIRST = "Hello";
    public static final String INPUT_STRING_SECOND = "world!";

    public void printInputMessage(String input){
        System.out.printf("Please input \"%s\" string: ", input);
    }

    public void printWrongInputMessage(String input){
        System.out.printf("Wrong Input! Please repeat! Input \"%s\" string: ", input);
    }

    public void printTwoStrings(String first, String second){
        System.out.println(first + " " + second);
    }

}
