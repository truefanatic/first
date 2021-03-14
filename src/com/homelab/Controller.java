package com.homelab;

import java.util.Scanner;

public class Controller {
    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }
    // The Work method
    public void readString(){
        Scanner sc = new Scanner(System.in);

        model.setFirstValue(inputStringValueWithScanner(sc, View.INPUT_STRING_FIRST));
        model.setSecondValue(inputStringValueWithScanner(sc, View.INPUT_STRING_SECOND));
        sc.close();
        view.printTwoStrings(model.getFirstValue(), model.getSecondValue());
    }

    // The Utility methods
    public String inputStringValueWithScanner(Scanner sc, String str) {
        view.printInputMessage(str);
        String input;
        while (true)  {
            input = sc.nextLine();
            if (!input.equals(str)) view.printWrongInputMessage(str);
            else return input;
        }
    }

}