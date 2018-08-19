package edu.asu.transcend.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//http://www.vogella.com/tutorials/Logging/article.html
public class HttpScraper {
    /**
     * Watch your Styles...
     * <p>
     * Variables marked as "static final" are constants.
     * Static means No instance of the class owns the value, it's a static property of that type.
     * Final means the value cannot be changed.
     * It is a Java Convention that Constants are named in all caps, with underscores.
     * <p>
     * This convention is not always applied to Logger objects, but is always applied to
     * String constants.
     */
    private static final Logger LOGGER = Logger.getLogger(HttpScraper.class.getName());
    private static final String DEFUALT_URL = "http://www.astate.edu/a/chancellor/index.dot";

    public static void main(String[] args) {
        // ALL THE LOGS!
        LOGGER.setLevel(Level.FINEST);

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(DEFUALT_URL);
        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            LOGGER.log(Level.FINE, "httpGet:  " + response.toString());
            HttpEntity entity = response.getEntity();
            // We get an input Stream from the Response Entity.
            // We can use a Scanner to read that!
            InputStream is = entity.getContent();
            Scanner httpScanner = new Scanner(is);
            StringBuilder httpBodyBuilder = new StringBuilder();

            /**
             *
             * We use StringBuilder for large strings, or
             * strings that we're going to add to and slice up a lot.
             *
             * StringBuilder has features that make working with
             * large strings faster, and sometimes even easier to read in code
             *
             * The code will still work with String += String, but it won't be as
             * efficient. The trick is knowing that the StringBuilder is a thing that exists,
             * and knowing what it's used for.
             *
             * Programming is like learning the magic words and the ingredients to software.
             *
             *
             */
            while (httpScanner.hasNextLine()) {
                httpBodyBuilder.append(httpScanner.nextLine());
            }
            // At this point, we have the full WebPage HTML. Let's scan it for patterns.
            LOGGER.log(Level.FINE, httpBodyBuilder.toString());

            /**
             * Regular Expressions are a cross language way of describing patterns.
             *
             * RegEx, as it's commonly called, is used to detect patterns in
             * text, primarily for validating input on forms, and enforcing formats
             * on data entry. Regex can also be used to recognize data of certain types.
             *
             * Java uses it's own RegEx in the Pattern object.
             *
             * Here's a tutorial showing the code for validating North American phone numbers.
             * https://howtodoinjava.com/regex/java-regex-validate-and-format-north-american-phone-numbers/
             */
            /**
             * Oh, look! Stack Overflow has done this too
             *
             * - https://stackoverflow.com/a/18036919
             *
             */
            String phoneRegEx = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}"; // Thank you Stack Overflow!
            Pattern pattern = Pattern.compile(phoneRegEx);
            Matcher m = pattern.matcher(httpBodyBuilder.toString());
            while (m.find()) {
                LOGGER.log(Level.INFO, m.group());
                // Note: There is only one phone number on this page.
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }


    }
}
