package Test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import static Test3.Exercise3.getUserInput;
import static Test3.Exercise3.sc;

public class Data {
    private static ArrayList<String> list = new ArrayList<String>();

    public ArrayList<String> getList() {
        return list;
    }

    public static ArrayList<String> pushElement(String element) {
        list.add(element);
        return list;
    }

    public static ArrayList<String> popElement(String element) {
        list.remove(element);
        return list;
    }

    public static void addElement() {
        System.out.println("Enter element to add ");
        String element = sc.nextLine();
        System.out.println("Element " + element + " is added " + " \n new array is " + pushElement(element));
        getUserInput();
    }

    public static void removeElement() {
        System.out.println("Enter element to remove ");
        String element = sc.nextLine();
        if (list.contains(element)) {
            System.out.println("Element " + element + " is added " + " \n new array is " + popElement(element));
            getUserInput();
        }
        System.out.println("The " + element + " is not present in the Array");
        getUserInput();
    }


    public static void printArrayReverse() {
        System.out.println("Element in reverse order \n");
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.exit(0);
    }

}
