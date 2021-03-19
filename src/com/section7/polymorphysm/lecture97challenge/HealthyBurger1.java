package com.section7.polymorphysm.lecture97challenge;

public class HealthyBurger1 extends Hamburger1 {
    private int cucumber;
    private int avocado;
    private static double additionalPrice = 1;
    private static double priceCucumber = 0.5;
    private static double priceAvocado = 1;
    private double totalPrice = additionalPrice;

    private static double maxPrice = getMaxHamPrice() + additionalPrice + priceAvocado + priceCucumber;

    public HealthyBurger1(String meat, int cheese, int lettuce, int tomato, int carrot, int cucumber, int avocado) {
        super("brown rye bread roll", meat, cheese, lettuce, tomato, carrot);
        this.cucumber = cucumber;
        this.avocado = avocado;

        if (cucumber > 0) {
            this.totalPrice += cucumber * priceCucumber;
        }
        if (avocado > 0) {
            this.totalPrice += avocado * priceAvocado;
        }

    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + this.totalPrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public static double getPriceCucumber() {
        return priceCucumber;
    }

    public static double getPriceAvocado() {
        return priceAvocado;
    }

    @Override
    public String burgerInclude() {
        return "Your perfect Healthy Burger: " +
                "breadType='" + getBreadType() + '\'' +
                ", meat='" + getMeat() + '\'' +
                ", cheese=" + getCheese() +
                ", lettuce=" + getLettuce() +
                ", tomato=" + getTomato() +
                ", carrot=" + getCarrot() +
                ", cucumber=" + cucumber +
                ", avocado=" + avocado;
    }


    public static void burgerOptions() {
        System.out.println("You can choose healthy burger (on a brown rye bread roll) " +
                ", meat" + " only for " + getStandartPrice() + "$ " +
                "and add some options:" +
                " cheese: " + getPriceCheese() + "$ " +
                ", lettuce: " + getPriceLettuce() + "$ " +
                ", tomato: " + getPriceTomato() + "$ " +
                ", carrot: " + getPriceCarrot() + "$ " +
                ", cucumber: " + getPriceCarrot() + "$ " +
                ", avocado: " + getPriceCarrot() + "$ " +
                " and  it's all just for " + maxPrice + "$ ");


    }
}

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).