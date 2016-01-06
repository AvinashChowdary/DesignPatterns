package com.designpatternsdemo.facadepattern.model;

/**
 * Created by Avinash
 */
public class Iphone implements Phones {
    @Override
    public String price() {
        return ("iPhone Price : Rs 65000.00 ");
    }
}
