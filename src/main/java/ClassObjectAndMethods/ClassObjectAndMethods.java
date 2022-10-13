package ClassObjectAndMethods;

import java.util.Scanner;

public class ClassObjectAndMethods {
    public static void main(String[] args) {
        ProgrammingTechStack programmingTechStack = new ProgrammingTechStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Which tech stack you want to see for Backend type b for Frontend type f ");
        String inputString = sc.nextLine();
        programmingTechStack.getTechStack(inputString);
    }
}
