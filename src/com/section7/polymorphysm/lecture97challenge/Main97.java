package com.section7.polymorphysm.lecture97challenge;

public class Main97 {
    public static void main(String[] args) {
        Hamburger1.burgerOptions();
        Hamburger1 hamburger1 = new Hamburger1("dark roll", "pork");
        Hamburger1 fullHamburger1 = new Hamburger1("white roll","beef",1,1,1,1);
        System.out.println(hamburger1.burgerInclude());
        System.out.println("Total price: "  + hamburger1.getTotalPrice());

        System.out.println(fullHamburger1.burgerInclude());
        System.out.println("Total price: " + fullHamburger1.getTotalPrice());


        HealthyBurger1.burgerOptions();
        Hamburger1 healthyBurger = new HealthyBurger1("chiken",1,1,1,1,1,1);
        System.out.println(healthyBurger.burgerInclude());
        System.out.println("Total price: " + healthyBurger.getTotalPrice());


        DeluxeHam1.burgerOptions();
        Hamburger1 deluxe = new DeluxeHam1("dark roll", "pork","chips", "coke");
        System.out.println(deluxe.burgerInclude());
        System.out.println("Total price: " + deluxe.getTotalPrice());
    }
}


// Also create two extra varieties of Hamburgers (subclasses) to cater for

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)


// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.