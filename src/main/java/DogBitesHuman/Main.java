package DogBitesHuman;

import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dog Name");
        String dogName = sc.nextLine();
        Dog dog = new Dog();
        dog.setDogName(dogName);
        System.out.println("Enter Human name ");
        String humanName = sc.nextLine();
        Human.humanWithNormalStatus(humanName);
        System.out.println(dog.getDogName() + " Bites " + humanName);
        Human.humanWithInjuredStatus(humanName);
        System.out.println(humanName + " Takes treatment from doctor  " + Doctor.getDrName());
        Human.humanWithNormalStatus(humanName);
    }
}
