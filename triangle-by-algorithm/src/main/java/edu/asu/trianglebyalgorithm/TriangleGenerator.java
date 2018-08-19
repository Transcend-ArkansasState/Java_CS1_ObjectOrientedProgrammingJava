/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.trianglebyalgorithm;

import java.util.Arrays;

/**
 * @author Adam
 */
public class TriangleGenerator {
    public static void main(String[] args) {
        System.out.println("---- TRIANGLE GENERATOR V1.0 ----");

        System.out.println("ARGUMENTS: " + Arrays.asList(args) + "\n\n");
        int triangleHeight = 0;

        if (args.length == 0) {
            printHelpText();
        }
        if (args.length >= 1) {
            triangleHeight = getTriangleHeightFromArg(args[0]);
        }
        if (args.length >= 2) {
            getTriangleTypeFromArgs(args[1], triangleHeight);

        }


        /**
         *       **
         ****
         ******
         ********
         **********
         ************
         ******
         *****
         ****
         ***
         **
         *
         ******
         *****
         ****
         ***
         **
         *
         ************
         **********
         ********
         ******
         ****
         **
         */


    }

    private static void printBasicTriangle() {
        StringBuilder sb = new StringBuilder();
        sb.append("   *   \n");
        sb.append("  ***   \n");
        sb.append(" *****  \n");
        sb.append("******* \n");
        System.out.print(sb.toString());
    }

    private static void printLeftRightTriangle(int height) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());


    }

    private static void printRightRightTriangle(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i); j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());


    }

    private static void printHelpText() {
        StringBuilder sb = new StringBuilder();
        sb.append("  * First Argument should be an integer. \n");
        sb.append("  * Second Argument should be type of Triangle \n");
        sb.append("  *** RRT - Right Right Triangle \n");
        sb.append("  *** LRT - Left Right Triangle \n");
        sb.append(" \n\n\n");
        System.out.print(sb.toString());

        printBasicTriangle();

    }

    private static int getTriangleHeightFromArg(String arg) {
        int height = 10;
        try {
            height = Integer.valueOf(arg);
        } catch (Exception ex) {
            printHelpText();
            //ex.printStackTrace();
        }
        return height;
    }

    private static void getTriangleTypeFromArgs(String arg, int height) {
        // TODO: Print the Correct Triangle Of Given Height
        if (arg.equals("RRT")) {
            printRightRightTriangle(height);
        } else if (arg.equals("LRT")) {
            printLeftRightTriangle(height);
        } else {
            printHelpText();
        }
    }
}
