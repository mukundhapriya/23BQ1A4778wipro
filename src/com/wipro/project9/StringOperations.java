package com.wipro.project9;

import java.util.ArrayList;

public class StringOperations {

    public ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace each occurrence of s2 with s2+s2
        list.add(s1.replace(s2, s2 + s2));

        // 2. Replace last occurrence with reverse of s2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String temp = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(temp);
        } else {
            list.add(s1);
        }

        // 3. Delete first occurrence if appears more than once
        if (first != last) {
            String temp = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(temp);
        } else {
            list.add(s1);
        }

        // 4. Split s2 and attach
        int mid;
        if (s2.length() % 2 == 0)
            mid = s2.length() / 2;
        else
            mid = (s2.length() / 2) + 1;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters in s1 that are present in s2 with *
        String result = "";

        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1)
                result += "*";
            else
                result += ch;
        }

        list.add(result);

        return list;
    }
}