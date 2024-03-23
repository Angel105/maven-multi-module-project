package com.makeitup.airportcore.model;

public class PlaneDTO {
    private String name;
    private int enginesCount;

    public PlaneDTO(String name, int enginesCount) {
        this.name = name;
        this.enginesCount = enginesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnginesCount() {
        return enginesCount;
    }

    public void setEnginesCount(int enginesCount) {
        this.enginesCount = enginesCount;
    }
}
