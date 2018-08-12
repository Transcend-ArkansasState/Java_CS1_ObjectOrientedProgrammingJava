package edu.asu.transcend.http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpScraper {
    private static final String DEFUALT_URL = "http://www.astate.edu/a/chancellor/index.dot";

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(DEFUALT_URL);
        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            System.out.println("httpGet:  " + response.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
