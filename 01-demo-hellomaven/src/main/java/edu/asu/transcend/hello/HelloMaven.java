package edu.asu.transcend.hello;

/**
 * Classic Hello World example program. Simply prints "Hello World" to the console when executed
 *
 * Concepts Needed :
 *      What is the Command Line?
 *      What do you mean by "Arguments"?
 *      What is a String? Why is it capital?
 *
 *
 */
public class HelloMaven {
    /**
     * Standard Java Main Method. This is the method Java.exe looks for when running your program.
     *
     * "public" defines the scope for access to this method. Public means this method can be accessed from outside of the class
     * In order for us to run this method by calling the "java.exe" command, the method must be public.
     *
     * "static" indicates that this method is not an Instance method. More on this later in the course.
     *
     * "void" indicates that this method does not have a return type. More on this later
     *
     * "(String[] args)" or "(String args[])" is a default part of the "Main" method signature. A list of String arguments
     * (or "args") can be passed to your main method from the command line. These are read into the main method as
     * a primitive Array of strings. More on Arrays later
     *
     * use "args[0]" to get the first argument, or "args[1]" to get the second argument, and so on...
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * This statement sends a "print line" to System.out with the content of "Hello World"
         *
         * System.out is the output for the Console. "println" will print a line with the given String to the console
         *
         * Alternatively, you can use "print()" to just print to the console, without starting a new line.
         */
        System.out.println("Hello World");
    }
}
