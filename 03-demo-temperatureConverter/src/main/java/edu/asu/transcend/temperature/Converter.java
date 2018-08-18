package edu.asu.transcend.temperature;

import java.util.Scanner;

public class Converter {
    // TODO: Comment
    public static void main(String[] args) {
        System.out.println("Censius to Farhenheit Converter. ");
        System.out.println("Input a Temperature in Celsius to Convert to Fahrenheit");
        double cTemp = getDoubleFromUser();
        double fTemp = celsiusToFahrenheit(cTemp);
        System.out.println("Converted Temperature is : " + fTemp + " degrees Fahrenheit");

    }


    private static double getDoubleFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a decimal number and press enter");
        double valueFromUser = 0.0;
        try {
            valueFromUser = scanner.nextDouble();
        } catch (Exception ex) {
            System.out.println("Error occurred. Try again.");
            return getDoubleFromUser();
        }
        return valueFromUser;
    }


    private static double celsiusToFahrenheit(double cTemp) {
        double fTemp = (cTemp * (9.0 / 5.0)) + 32;
        return fTemp;
    }

    private static double fahrenheitToCelsius(double fTemp) {
        double cTemp = (fTemp - 32) * (5.0 / 9.0);
        return cTemp;
    }
}
