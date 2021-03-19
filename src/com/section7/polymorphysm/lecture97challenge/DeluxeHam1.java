package com.section7.polymorphysm.lecture97challenge;

public class DeluxeHam1 extends Hamburger1 {
    private static double additionalPrice = 3;
    private String chips;
    private String drinks;

    private static double maxDeluxPrice = getMaxHamPrice() + additionalPrice;

    public DeluxeHam1(String breadType, String meat, String chips, String drinks) {
        super(breadType, meat);
        this.chips = chips;
        this.drinks = drinks;

    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + additionalPrice;
    }

    @Override
    public String burgerInclude() {
        return "Your perfect Deluxe Hamburger : " +
                "breadType='" + getBreadType() + '\'' +
                ", meat='" + getMeat() + '\'' +
                ", cheese=" + getCheese() +
                ", lettuce=" + getLettuce() +
                ", tomato=" + getTomato() +
                ", carrot=" + getCarrot() +

                ", chips='" + chips + '\'' +
                ", drinks='" + drinks + '\'';

    }


    public static void burgerOptions() {

        System.out.println("You can choose: " +
                "breadType" +
                ", meat" + " only for " + getStandartPrice() + "$ " +
                "or add chips and drink:" +

                " and  it's all just for " + maxDeluxPrice + "$ ");
    }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.