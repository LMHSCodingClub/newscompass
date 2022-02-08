package com.lmhscodingclub.newscompass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import java.io.*;
import java.net.*;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=lWfWKkSRD6wWl9PvgxjkZ5bs2KYtLBMF");
        URLConnection url_open = url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(url_open.getInputStream()));

        String link;
        while ((link = br.readLine()) != null) {
            System.out.println(link);
        }
        br.close();

        System.out.println("Done");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
