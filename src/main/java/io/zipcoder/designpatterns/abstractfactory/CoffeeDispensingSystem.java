package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.DrinkDispenser;


class CoffeeDispensingSystem{
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }

    /* Uncomment after part 1 is done
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }
    */
}
