package com.lmhscodingclub.newscompass;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class NewsRequest {
    public NewsRequest(String urlStr) {
        try {
            URL url = new URL(urlStr);
            URLConnection url_open = url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(url_open.getInputStream()));

            String link;
            String totalLink = "";
            ArrayList<String> links = new ArrayList<>();
            while ((link = br.readLine()) != null) {
                // System.out.println(link);
                totalLink += link;
            }
            int pos;
            int i = 0;
            while (i < totalLink.length() - 10) {
                if (totalLink.substring(i, i + 5).equals(".html")) {
                    pos = i;
                    while (!(totalLink.substring(pos - 5, pos).equals("https"))) {
                        if (pos <= 5) {
                            break;
                        }
                        pos--;
                    }
                    links.add(totalLink.substring(pos - 5, i + 5));
                }
                i++;
            }

            System.out.println("Done");
            for (String temp : links) {
                System.out.println("Link: " + temp);
            }
            /*
             * for (int j = 0; j < links.size(); j++) {
             * URL url_story = new URL(links.get(j));
             * //URLConnection story_open = url_story.openConnection();
             *
             * BufferedReader br_story = new BufferedReader(new
             * InputStreamReader(url_story.openStream()));
             *
             * String link_story;
             * while((link_story = br_story.readLine()) != null) {
             * System.out.println(link_story);
             * }
             * System.out.println("\n\n");
             * }
             */

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
