package com.wipro.threads;

public class ThreadDemo2 {

    public static void main(String[] args) {

        ColourTask task = new ColourTask();

        Thread t = new Thread(task);

        t.start();
    }
}