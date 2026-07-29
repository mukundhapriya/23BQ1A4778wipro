package com.wipro.threads;

import java.util.Random;

public class ColourTask implements Runnable {

    String[] colours = {
        "white", "blue", "black", "green", "red", "yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println("Random Colour : " + colours[index]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}