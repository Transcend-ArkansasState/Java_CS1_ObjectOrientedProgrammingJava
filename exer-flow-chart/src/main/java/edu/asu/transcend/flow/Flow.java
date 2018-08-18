package edu.asu.transcend.flow;

import java.util.Scanner;

public class Flow {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("START");

        System.out.println("Is this flowchart full of traps?");
        String input = scanner.next();

        if (input.equalsIgnoreCase("YES")) {

            System.out.println("TWEET!!");
            Flow.whatWillYouDo();


        } else if (input.equalsIgnoreCase("NO")) {

            System.out.println("Is there a horse in block 5?");
            input = scanner.next();
            if (input.equalsIgnoreCase("YES")) {
                System.out.println("TWEET");
                System.out.println("[HORSE]");
            } else if (input.equalsIgnoreCase("NO")) {
                Flow.whatWillYouDo();
            }

        }


    }

    public static void whatWillYouDo() {
        System.out.println("What will you do now?");
        System.out.println("Jump out a window / fall in a trap");
        String input = scanner.next();

        //DEBUG
        System.out.println("DEBUG: " + input);

        if (input.equalsIgnoreCase("JUMP")) {
            System.out.println("You will not go to space today");
        } else if (input.equalsIgnoreCase("FALL")) {
            int counter = 10;
            while (counter >= 0) {
                //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                System.out.println("You are in a trap!");
                counter--;
            }
        }
    }
}
