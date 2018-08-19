package edu.transcend.objects;

import com.google.gson.Gson;

import java.io.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SerializeObjects {

    public static void main(String args[]) {
        // Create our gson object that parses JSON and Java Objects (POJOs)
        Gson gson = new Gson();
        // If no ARgs... this is just a default method, so we can kinda test everything out
        if (args.length <= 0) {
            // We do a lot here in sequence. This is just a procedural run through of what the program 'can' do
            String jsonAuthor = gson.toJson(createAuthor());
            System.out.println("Serialized Author as JSON");
            System.out.println(jsonAuthor);
            String jsonBook = gson.toJson(createBook());
            System.out.println("Serialized Book as JSON");
            System.out.println(jsonBook);
            System.out.println("Saving jsonBook");
            SampleBook bookToSave = createBook();
            System.out.println("BOOK TO SAVE: " + gson.toJson(bookToSave));
            saveBookToJSONFile("test.json", bookToSave);
            System.out.println("Saved JSON Book");
            System.out.println("Loading JSON Book");
            SampleBook newBook = loadBookFromJSONFile("test.json");
            System.out.println("Loaded JSON Book is: " + gson.toJson(newBook));
            // [Java Invocation Command] String[] args
            // java -jar JarName.jar args[0] args[1] args[2]...
            // java SerializeObjects.class args[0] args[1] args[2]...
        } else if (args[0].equalsIgnoreCase("createSaveBook")) { // java -jar object-serialization.jar createSaveBook myBook.json
            SampleBook book = createBookFromConsole();
            saveBookToJSONFile(args[1], book);
        } else if (args[0].equalsIgnoreCase("loadPrintBook")) { // java -jar object-serialization.jar loadPrintBook myBook.json
            SampleBook book = loadBookFromJSONFile(args[1]);
            System.out.println(book);
        } else if (args[0].equalsIgnoreCase("createSaveAuthor")) { // java -jar object-serialization.jar createSaveAuthor myAuthor.json
            SampleAuthor author = createAuthorFromConsole();
            saveAuthorToJSONFile(args[1], author);
        } else if (args[0].equalsIgnoreCase("loadPrintAuthor")) { //// java -jar object-serialization.jar loadPrintAuthor myAuthor.json
            SampleAuthor author = loadAuthorFromJSONFile(args[1]);
            System.out.println(author);
        }
    }

    /**
     * Creates a Random Author Object with a random selection of first and last names.
     *
     * @return
     */
    private static SampleAuthor createAuthor() {
        String[] firstNames = new String[]{"Mark", "Jane", "Ray", "Mary"};
        String[] lastNames = new String[]{"Twain", "Austen", "Bradburry", "Shelly"};
        SampleAuthor author = new SampleAuthor();

        author.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
        author.setLastName(lastNames[new Random().nextInt(lastNames.length)]);

        return author;
    }

    /**
     * Creates a random Book Object from a list of titles, and contains a random author object also.
     * @return
     */
    private static SampleBook createBook() {
        String[] titles = new String[]{"Tom Sawyer", "Pride and Prejudice", "451", "Frankenstein"};

        SampleBook book = new SampleBook();
        book.setTitle(titles[new Random().nextInt(titles.length)]);
        book.setAuthor(createAuthor());
        book.setRating(new Random().nextInt(5));
        book.setPublished(new Date());

        return book;

    }

    /**
     *
     * @return
     */
    private static SampleBook createBookFromConsole() {
        return createBook();
        // TODO: Prompt for values to fill out a book.
    }

    /**
     *
     * @return
     */
    private static SampleAuthor createAuthorFromConsole() {
        // TODO: Prompt for values to fill out an Author
        return createAuthor();
    }

    /**
     * Loads a SampleBook Object from a JSON File of given filename
     * @param filename name of the .json file
     * @return The Book Object serialized in the file
     */
    private static SampleBook loadBookFromJSONFile(String filename) {
        Gson gson = new Gson();
        File file = new File(filename);
        SampleBook book = null;
        String fileContents = "";
        try {
            Scanner fileScanner = new Scanner(new FileReader(file));
            while (fileScanner.hasNextLine()) {
                fileContents += fileScanner.nextLine();
            }
            System.out.println("FILE STRING IS: " + fileContents);
            book = gson.fromJson(fileContents, SampleBook.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return book;
    }

    /**
     * Loads a SampleAUthor object from a JSON file of given filename
     * @param filename name of the .json file
     * @return The Object serialized in the file
     */
    private static SampleAuthor loadAuthorFromJSONFile(String filename) {
        Gson gson = new Gson();
        File file = new File(filename);
        SampleAuthor author = null;
        String fileContents = "";
        try {
            Scanner fileScanner = new Scanner(new FileReader(file));
            while (fileScanner.hasNextLine()) {
                fileContents += fileScanner.nextLine();
            }
            author = gson.fromJson(fileContents, SampleAuthor.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return author;
    }

    /**
     * Converts the provided Object to a JSON String value and then saves to file
     * @param filename
     * @param book
     */
    private static void saveBookToJSONFile(String filename, SampleBook book) {
        Gson gson = new Gson();
        String bookAsString = gson.toJson(book);
        saveStringToFile(filename, bookAsString);
    }

    /**
     * Converts the provided Object to a JSON String value and then saves to file
     * @param filename
     * @param author
     */
    private static void saveAuthorToJSONFile(String filename, SampleAuthor author) {
        Gson gson = new Gson();
        String authorAsString = gson.toJson(author);
        saveStringToFile(filename, authorAsString);
    }

    /**
     * This method writes a string to a file. This is just to keep the other methods from repeating the same
     * FileWriter code and try/catch.
     * @param filename
     * @param stringToWrite
     */
    private static void saveStringToFile(String filename, String stringToWrite) {

        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(stringToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
