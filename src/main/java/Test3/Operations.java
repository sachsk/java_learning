package Test3;

public class Operations {
    public static void arrayOperations(String op) {
        switch (op) {
            case "a":
                Data.addElement();
            case "rev":
                Data.printArrayReverse();
            case "r":
                Data.removeElement();
            default: break;
        }
    }
}
