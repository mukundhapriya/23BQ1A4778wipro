package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Mahindra Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Mukundhapriya";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        return 1;
    }
}