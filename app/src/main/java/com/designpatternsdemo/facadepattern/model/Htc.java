package com.designpatternsdemo.facadepattern.model;

/**
 * Created by Avinash
 */
public class Htc implements Phones {

    @Override
    public String price() {
        return ("HTC Price : Rs 45000.00 ");
    }
}
