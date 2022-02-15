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

    }
}
