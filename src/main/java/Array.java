import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int arrayOfValue[] = {1, 2, 3, 4, 5};

            System.out.println("Existing Array --> " + Arrays.toString(arrayOfValue));
            System.out.print("Enter a number to add in array ");
            int inputValue = sc.nextInt();
            System.out.println("Adding the " + Integer.toString(inputValue) + "into " + Arrays.toString(arrayOfValue));
            int newArray[] = new int[arrayOfValue.length + 1];
            for (int i = 0; i < arrayOfValue.length; i++) {
                newArray[i] = arrayOfValue[i];
            }
            newArray[arrayOfValue.length] = inputValue;

            System.out.println("Final array after adding " + inputValue + " is " + Arrays.toString(newArray));
        } catch (Exception e) {
            System.out.println("Error-->" + e);
        }

    }
}
