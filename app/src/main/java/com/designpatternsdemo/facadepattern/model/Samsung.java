package com.designpatternsdemo.facadepattern.model;

/**
 * Created by Avinash
 */
public class Samsung implements Phones {
    @Override
    public String price() {
        return ("Samsung Price : Rs 35000.00 ");
    }
}
