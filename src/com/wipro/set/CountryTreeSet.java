package com.wipro.set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String country) {

        countries.add(country);
        return countries;
    }

    public String getCountry(String country) {

        if (countries.contains(country))
            return country;

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}