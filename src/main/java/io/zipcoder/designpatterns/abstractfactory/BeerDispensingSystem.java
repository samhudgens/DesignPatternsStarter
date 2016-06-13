package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.BeerMachine;

/**
 * Created by samhudgens on 6/13/16.
 */
public class BeerDispensingSystem {
    public BeerMachine drinkDispenser(){return new BeerMachine();}

    public BeerGlassDispenser cupDispenser(){return new BeerGlassDispenser();}
}
