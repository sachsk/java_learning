package Test3;

import java.util.Scanner;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please type string that you want to add in Array ");
        String input1 = sc.nextLine();
        System.out.println("Element is added and current Array is " + Data.pushElement(input1));

        getUserInput();
    }

    public static void getUserInput() {
        System.out.println("Select operation on Array \n To add type a \n to remove type r \n to print revers type rev");
        String operation = sc.nextLine();
        Operations.arrayOperations(operation);
    }
}
