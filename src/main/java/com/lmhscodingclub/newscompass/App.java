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

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new App();
    }
}
