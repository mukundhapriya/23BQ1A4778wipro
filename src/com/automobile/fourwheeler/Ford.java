package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Mukundhapriya";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 22;
    }
}