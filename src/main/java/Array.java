import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int arrayOfValue[] = {1, 2, 3, 4, 5};

            System.out.println("Existing Array --> " + Arrays.toString(arrayOfValue));
            System.out.print("Specify the action todo on array to add type push to subtract type pop ");
            String action = sc.nextLine();
            if (action.equals("push")) {
                System.out.print("Enter a number to add in array ");
                int inputValue = sc.nextInt();
                System.out.println("Adding the " + Integer.toString(inputValue) + "into " + Arrays.toString(arrayOfValue));
                int newArray[] = new int[arrayOfValue.length + 1];
                int i = 0;
                while (i < arrayOfValue.length) {
                    newArray[i] = arrayOfValue[i];
                    i++;
                }

                newArray[arrayOfValue.length] = inputValue;

                System.out.println("Final array after adding " + inputValue + " is " + Arrays.toString(newArray));
            } else if (action.equals("pop")) {
                System.out.print("Enter the index of element to remove");
                int inputValue = sc.nextInt();
                System.out.println("Removing the element at index " + Integer.toString(inputValue) + "From " + Arrays.toString(arrayOfValue));
                int newArray[] = new int[arrayOfValue.length - 1];

                for (int i = 0, k = 0; i < arrayOfValue.length; i++) {
                    if (i != inputValue) {
                        newArray[k] = arrayOfValue[i];
                        k++;
                    }
                }
                System.out.println("Final array after removing element from index " + inputValue + " is " + Arrays.toString(newArray));

            } else {
                System.out.println("Please give correct input " + action + " is not a valid action. " + "To add type push to subtract type pop ");
            }

        } catch (Exception e) {
            System.out.println("Error-->" + e);
        }

    }
}
