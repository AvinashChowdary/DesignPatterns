package com.designpatternsdemo.facadepattern.Helpers;

import com.designpatternsdemo.facadepattern.model.Htc;
import com.designpatternsdemo.facadepattern.model.Iphone;
import com.designpatternsdemo.facadepattern.model.OnePlus;
import com.designpatternsdemo.facadepattern.model.Phones;
import com.designpatternsdemo.facadepattern.model.Samsung;

/**
 * Created by Avinash
 */
public class Configurations {

    private Phones iPhone;
    private Phones samsung;
    private Phones htc;
    private Phones onePlus;

    public Configurations() {
        iPhone = new Iphone();
        htc = new Htc();
        samsung = new Samsung();
        onePlus = new OnePlus();
    }

    public String iphonePrice(){
        return iPhone.price();
    }

    public String samsungPrice(){
        return samsung.price();
    }

    public String htcPrice(){
        return htc.price();
    }

    public String onePlusPrice(){
        return onePlus.price();
    }
}
