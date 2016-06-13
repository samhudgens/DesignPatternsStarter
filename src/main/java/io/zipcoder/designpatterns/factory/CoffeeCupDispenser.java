package io.zipcoder.designpatterns.factory;

/**
 * Created by samhudgens on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {


    public CoffeeCup dispense() {return new CoffeeCup();}
}
