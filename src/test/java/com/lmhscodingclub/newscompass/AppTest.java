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
        String totalLink = "";
        ArrayList<String> links = new ArrayList<>();
        while ((link = br.readLine()) != null) {
            //System.out.println(link);
            totalLink+=link;
        }
        int pos;
        int i = 0;
        while (i < totalLink.length()-10) {
            if (totalLink.substring(i, i + 5).equals(".html")) {
                pos = i;
                while (!(totalLink.substring(pos-5, pos).equals("https"))) {
                    if (pos <= 5) {
                        break;
                    }
                    pos--;
                }
                links.add(totalLink.substring(pos-5, i+5));
            }
            i++;
        }

        System.out.println("Done");
        for (String temp : links) {
            System.out.println("Link: " + temp);
        }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
