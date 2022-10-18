package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

import static ArrayLists.ArrayLists.addElement;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayLists.pushElement("Dog");
        ArrayLists.pushElement("Cat");
        System.out.println("Current list " + ArrayLists.getArrayListOfElement());
        System.out.println("For add element in ArrayList type \"a\" to remove type \"r\"  ");
        String userInput = sc.nextLine();

        switch (userInput) {
            case "a":
                ArrayLists.addElement();
            case "r":
                ArrayLists.popElement();
                break;
        }
    }


}
