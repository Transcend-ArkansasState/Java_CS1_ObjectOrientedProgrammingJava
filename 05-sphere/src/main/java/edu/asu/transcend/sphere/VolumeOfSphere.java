package edu.asu.transcend.sphere;

import java.util.Scanner;

public class VolumeOfSphere {
    private static Scanner scanner = null;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("What's the Radius of your Circle?");
        System.out.println("Volume is : " + getSphereVolume(getInputFromUser()));

    }

    /**
     * This method will read the next Token as a float value. This should probably be a double, for the most precision,
     * but we're not worried about 7th and 8th decimal places.
     *
     * @return a double read as a float from the Console System.in
     */
    private static double getInputFromUser() {

        try {
            return scanner.nextDouble();
        } catch (Exception ex) {
            // #Recursion? - If we get an error, make the user try again. Usually means they typed a letter not a number
            return getInputFromUser();
        }

    }

    private static double getSphereVolume(double radius) {
        double volume = 0.0d;
        volume = Math.PI * (4.0 / 3.0) * Math.pow(radius, 3);
        return volume;
    }
}
