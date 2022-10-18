package ArrayLists;

import java.util.ArrayList;

import static ArrayLists.Main.sc;

public class ArrayLists {
    private static ArrayList<String> arrayListOfElement = new ArrayList<String>();

    public static ArrayList<String> getArrayListOfElement() {
        return arrayListOfElement;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayListOfElement = arrayList;
    }
    public static  void pushElement(String element){
        arrayListOfElement.add(element);
    }

    public static void addElement() {
        System.out.println("Enter element to add ");
        String element = sc.nextLine();
        arrayListOfElement.add(element);
        System.out.println("Array After push " + arrayListOfElement);
    }

    public static void popElement() {
        System.out.println("Enter element to remove ");
        String element = sc.nextLine();
        try {
            arrayListOfElement.remove(element);
            System.out.println("Array After removing " + element + " " + arrayListOfElement);

        } catch (Exception e) {
            System.out.println("Error element not found  ->" + e);
        }

        arrayListOfElement.remove(element);
        System.out.println("Array After push " + arrayListOfElement);
    }


    public void clear() {
        arrayListOfElement.clear();
    }
}
