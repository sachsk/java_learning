package DogBitesHuman;

public class Human extends HandStatus {

    static void humanWithNormalStatus(String name) {
        System.out.println("The status of " + name + "'s hand is " + Human.isNormal());
    }

    public static void humanWithInjuredStatus(String humanName) {
        System.out.println("The status of " + humanName + "'s hand is " + Human.isInjured());
    }
}
