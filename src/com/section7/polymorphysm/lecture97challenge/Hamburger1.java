package com.section7.polymorphysm.lecture97challenge;

public class Hamburger1 {
    private String breadType;
    private String meat;

    private int cheese;
    private int lettuce;
    private int tomato;
    private int carrot;

    private static double standartPrice = 5;
    private static double priceCheese = 1;
    private static double priceLettuce = 0.5;
    private static double priceTomato = 0.7;
    private static double priceCarrot = 0.5;

    private double totalPrice;
    private static double maxHamPrice = standartPrice + priceCarrot + priceTomato + priceCheese + priceLettuce;

    public Hamburger1(String breadType, String meat) {
        this(breadType, meat, 0, 0, 0, 0);
    }

    public Hamburger1(String breadType, String meat, int cheese, int lettuce, int tomato, int carrot) {
        this.breadType = breadType;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        totalPrice = standartPrice;
        if (cheese > 0) {
            totalPrice += cheese * priceCheese;
        }
        if (lettuce > 0) {
            totalPrice+= lettuce * priceLettuce;
        }
        if (tomato > 0) {
            totalPrice+= tomato * priceTomato;
        }
        if (carrot > 0) {
            totalPrice+= carrot * priceCarrot;
        }
    }

    public static double getStandartPrice() {
        return standartPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static double getPriceCheese() {
        return priceCheese;
    }

    public static double getPriceLettuce() {
        return priceLettuce;
    }

    public static double getPriceTomato() {
        return priceTomato;
    }

    public static double getPriceCarrot() {
        return priceCarrot;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public int getCheese() {
        return cheese;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public static double getMaxHamPrice() {
        return maxHamPrice;
    }

    public String burgerInclude() {
        return "Your perfect Hamburger: " +
                "breadType='" + breadType + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", carrot=" + carrot;

    }

    public static void burgerOptions() {
        System.out.println( "You can choose: " +
                "breadType" +
                ", meat"  + " only for " + getStandartPrice() + "$ "+
                "and add some options:" +
                " cheese: "  + getPriceCheese() + "$ "+
                ", lettuce: " +getPriceLettuce() + "$ "+
                ", tomato: " + getPriceTomato() + "$ "+
                ", carrot: " + getPriceCarrot() +"$ "+
                " and  it's all just for " + maxHamPrice + "$ ");
    }
}
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.