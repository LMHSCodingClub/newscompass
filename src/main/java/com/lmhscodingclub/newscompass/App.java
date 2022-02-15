package com.lmhscodingclub.newscompass;

import javax.swing.JFrame;

/**
 * Hello world!
 */
public final class App extends JFrame {
    private App() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("NewsCompass");
    }

    public static void main(String[] args) {
        NewsRequest r = new NewsRequest("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=lWfWKkSRD6wWl9PvgxjkZ5bs2KYtLBMF");
        NewsSource s = new NewsSource(PoliticalBias.LEFT, "The New York Times");
        NewsArticle a = new NewsArticle("The New York Times", "https://www.nytimes.com/2019/04/10/us/politics/trump-kim-north-korea-summit.html", s);
        System.out.println(a.title());

    }
}
