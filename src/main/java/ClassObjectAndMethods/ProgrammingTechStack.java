package ClassObjectAndMethods;

import java.util.Arrays;

public class ProgrammingTechStack {
    String[] frontEnd = new String[]{"ReactJS", "AngularJs", "Angular", "Wordpress"};
    String[] backEnd = new String[]{"SpringBoot", "PHP", "NodeJs"};

    static void printData(String data) {
        System.out.println("FrontEnd Techs are " + data);
    }

    public void getTechStack(String value) {
        switch (value) {
            case "f":
                printData(Arrays.toString(frontEnd));
                break;
            case "b":
                printData(Arrays.toString(backEnd));
                break;
            default:
                System.out.println("Not found");
        }
    }
}
