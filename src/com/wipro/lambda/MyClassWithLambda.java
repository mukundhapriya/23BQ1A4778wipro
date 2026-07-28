package com.wipro.lambda;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String text = "Welcome to Wipro TalentNext Java Full Stack";

        System.out.println("String : " + text);
        System.out.println("Word Count : " + wc.count(text));
    }
}