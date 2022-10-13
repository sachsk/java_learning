import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word");
        String newWord = sc.nextLine();
        System.out.println("New Word :" + newWord);
        String a = "Java";
        String b = "Script";
        System.out.println("The concatenate of string " + a + " and " + b + " is " + a + b);
        /*       take value1 and value2 from user and using arithmetic operator
               print sum,sub,multiplication and modulus */
        System.out.print("Enter value1 : ");
        int value1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter value2 : ");
        int value2 = Integer.parseInt(sc.nextLine());
        // Printing the values
        System.out.println("The sum of " + value1 + " and " + value2 + " is " + (value1 + value2));
        System.out.println("The Subtraction of " + value1 + " and " + value2 + " is " + (value1 - value2));
        System.out.println("The Division of " + value1 + " and " + value2 + " is " + (value1 / value2));
        System.out.println("The Modulus of " + value1 + " and " + value2 + " is " + (value1 % value2));
    }
}
