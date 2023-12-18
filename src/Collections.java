import java.util.ArrayList;
//import java.util.*;
public class Collections {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> listOfStrings = new ArrayList<>();
        // Adding elements to the ArrayList
        listOfStrings.add("Apple");
        listOfStrings.add("Banana");
        listOfStrings.add("Orange");
        listOfStrings.add("Grapes");

        // Displaying the elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String fruit : listOfStrings) {
            System.out.println(fruit);
        }

        // Removing an element from the ArrayList
        listOfStrings.remove("Orange");

        // Displaying the updated elements of the ArrayList
        System.out.println("\nAfter removing 'Orange', elements in the ArrayList:");
        for (String fruit : listOfStrings) {
            System.out.println(fruit);
        }

        // Checking if the ArrayList contains a specific element
        String searchElement = "Banana";
        if (listOfStrings.contains(searchElement)) {
            System.out.println("\nThe ArrayList contains '" + searchElement + "'.");
        } else {
            System.out.println("\nThe ArrayList does not contain '" + searchElement + "'.");
        }

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + listOfStrings.size());
    }
}
