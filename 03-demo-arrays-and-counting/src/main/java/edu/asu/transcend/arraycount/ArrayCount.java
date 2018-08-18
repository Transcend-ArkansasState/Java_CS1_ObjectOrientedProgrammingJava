package edu.asu.transcend.arraycount;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCount {
    public static void main(String[] args) {
        //TODO:
        System.out.println("Arrays and Counting...");

        // Create a Primitive Array of String, that holds 2 values
        String[] strings = new String[2];
        // Put an element in the 0 index
        strings[0] = "ZERO";
        strings[1] = "ONE";

        // This is equivalent code
        String moreStrings[] = new String[2];
        moreStrings[0] = "ZERO";
        moreStrings[1] = "ONE";

        // Print out the Arrays so we can see them on the console
        // Note that 'regular' arrays don't print to the console the way you'd expect
        System.out.println("strings : " + strings);
        System.out.println("moreStrings : " + moreStrings);
        // To "pretty print" these, we gotta wrap them in another function from the Arrays Utility Class
        // Java "List" objects print very easily (as we'll see later in the code) so we can convert the Array to a List by using java.util.Arrays.asList()
        System.out.println("strings : " + Arrays.asList(strings));
        System.out.println("moreStrings : " + Arrays.asList(moreStrings));


        // An ArrayList can be used instead, but we have to use Objects (not int, long... etc; instead Integer, Long... etc)
        // Import ArrayList from java.util.
        ArrayList<String> stringsList = new ArrayList<>();

        stringsList.add("First String");
        stringsList.add("Second String");
        System.out.println("stringsList : " + stringsList);
        stringsList.add(0, "ZERO");
        System.out.println("stringsList : " + stringsList);
        boolean doesContain = stringsList.contains("First String");
        // Lists have a .contains method for searching for values
        System.out.println("Contains : " + doesContain);

    }
}
