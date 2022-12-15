package com.kurgan.kursach.Visitor;

import com.kurgan.kursach.models.Parking;

public class Visitor {
    public Integer visit(Parking parking) {
        return parking.getPlaces() - parking.getCars().size();
    }
}