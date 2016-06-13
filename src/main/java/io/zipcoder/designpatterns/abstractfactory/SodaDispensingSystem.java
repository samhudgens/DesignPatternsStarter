package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaMachine;

/**
 * Created by samhudgens on 6/13/16.
 */
public class SodaDispensingSystem {
    public SodaMachine drinkDispenser(){return new SodaMachine();}

    public SodaCupDispenser cupDispenser(){return new SodaCupDispenser();}
}
