package edu.transcend.objects;

import com.google.gson.Gson;

import java.util.Date;
import java.util.Random;

public class SerializeObjects {

    public static void main(String args[]) {
        Gson gson = new Gson();

        String jsonAuthor = gson.toJson(createAuthor());
        System.out.println("Serialized Author as JSON");
        System.out.println(jsonAuthor);
        String jsonBook = gson.toJson(createBook());
        System.out.println("Serialized Book as JSON");
        System.out.println(jsonBook);
        // TODO: add "read" and "write" args with filenames
        // TODO: Import GSON

        // TODO: Create GSON instance

        // TODO: Serialize and print Object to console (write to file)
        // TODO: Deserialize Object from file
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


}
