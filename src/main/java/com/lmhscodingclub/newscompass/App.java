package com.lmhscodingclub.newscompass;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 */
public final class App extends JFrame {
    private App() {
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("NewsCompass");

        // JTextField textField = new JTextField("Search news");
        // textField.setBounds(10, 10, 100, 20);

        GridLayout storyGrid = new GridLayout(0, 3);
        JPanel storyUi = new JPanel(storyGrid);

        storyUi.setBorder(new EmptyBorder(10, 10, 10, 10));

        storyUi.add(politicalBiasLabel("Left"));
        storyUi.add(politicalBiasLabel("Center"));
        storyUi.add(politicalBiasLabel("Right"));


        add(storyUi);

        // add(textField);
    }

    private JLabel politicalBiasLabel(String bias) {
        JLabel label = new JLabel(bias);
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        return label;
    }

    public static void main(String[] args) {
        new App();
        NewsRequest r = new NewsRequest("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=lWfWKkSRD6wWl9PvgxjkZ5bs2KYtLBMF");
        NewsSource s = new NewsSource(PoliticalBias.LEFT, "The New York Times");
        NewsArticle a = new NewsArticle("The New York Times", "https://www.nytimes.com/2019/04/10/us/politics/trump-kim-north-korea-summit.html", s);
        System.out.println(a.title());

    }
}
