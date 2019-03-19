package com.geekbrains.materialdesign.myapplication0603;

import java.io.Serializable;

public class Parcel implements Serializable {
    String town;
    boolean wind;
    boolean hymidity;
    boolean pressure;

    public Parcel(){}

    public Parcel(String town, boolean wind, boolean hymidity, boolean pressure){
        this.hymidity = hymidity;
        this.pressure = pressure;
        this.wind = wind;
        this.town = town;
    }

}
