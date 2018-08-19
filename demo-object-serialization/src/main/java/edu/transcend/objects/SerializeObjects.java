package edu.transcend.objects;

import com.google.gson.Gson;

import java.io.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SerializeObjects {

    public static void main(String args[]) {
        Gson gson = new Gson();

        if (args.length <= 0) {
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
        } else if (args[0].equalsIgnoreCase("createSaveBook")) {
            SampleBook book = createBookFromConsole();
            saveBookToJSONFile(args[1], book);
        } else if (args[0].equalsIgnoreCase("loadPrintBook")) {
            SampleBook book = loadBookFromJSONFile(args[1]);
            System.out.println(book);
        } else if (args[0].equalsIgnoreCase("createSaveAuthor")) {
            SampleAuthor author = createAuthorFromConsole();
            saveAuthorToJSONFile(args[1], author);
        } else if (args[0].equalsIgnoreCase("loadPrintAuthor")) {
            SampleAuthor author = loadAuthorFromJSONFile(args[1]);
            System.out.println(author);
        }
    }

    private static SampleAuthor createAuthor() {
        String[] firstNames = new String[]{"Mark", "Jane", "Ray", "Mary"};
        String[] lastNames = new String[]{"Twain", "Austen", "Bradburry", "Shelly"};
        SampleAuthor author = new SampleAuthor();

        author.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
        author.setLastName(lastNames[new Random().nextInt(lastNames.length)]);

        return author;
    }

    private static SampleBook createBook() {
        String[] titles = new String[]{"Tom Sawyer", "Pride and Prejudice", "451", "Frankenstein"};

        SampleBook book = new SampleBook();
        book.setTitle(titles[new Random().nextInt(titles.length)]);
        book.setAuthor(createAuthor());
        book.setRating(new Random().nextInt(5));
        book.setPublished(new Date());

        return book;

    }

    private static SampleBook createBookFromConsole() {
        return createBook();
        // TODO: Prompt for values to fill out a book.
    }

    private static SampleAuthor createAuthorFromConsole() {
        // TODO: Prompt for values to fill out an Author
        return createAuthor();
    }

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

    private static void saveBookToJSONFile(String filename, SampleBook book) {
        Gson gson = new Gson();
        String bookAsString = gson.toJson(book);
        saveStringToFile(filename, bookAsString);
    }


    private static void saveAuthorToJSONFile(String filename, SampleAuthor author) {
        Gson gson = new Gson();
        String authorAsString = gson.toJson(author);
        saveStringToFile(filename, authorAsString);
    }

    private static void saveStringToFile(String filename, String stringToWrite) {

        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(stringToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
