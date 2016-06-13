package io.zipcoder.designpatterns.factory;

/**
 * Created by samhudgens on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser {
    public BeerGlass dispense(){return new BeerGlass();}
}
