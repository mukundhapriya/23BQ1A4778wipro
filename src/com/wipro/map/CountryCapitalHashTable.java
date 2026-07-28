package com.wipro.map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryCapitalHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capital))
                return entry.getKey();
        }

        return null;
    }

    public Hashtable<String, String> swapKeyValue() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryCapitalHashTable obj = new CountryCapitalHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKeyValue());
        System.out.println(obj.toArrayList());
    }
}