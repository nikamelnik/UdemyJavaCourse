package com.section7.encapsulation.ex38;

public class PrinterMine {
    private int tonerLevel;
    private int numberOfPrintedPages;
    private boolean isDuplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public PrinterMine(int tonerLevel, boolean isDuplex) {
      if (tonerLevel > -1 && tonerLevel <=100) {
        this.tonerLevel = tonerLevel; }
      else {
          this.tonerLevel = -1;
      }
        this.numberOfPrintedPages = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            System.out.println("Filling up the toner --->");
            System.out.println( "Current toner level: " + this.tonerLevel + "%");
            return this.tonerLevel;
        } else {
            return -1;
        }



    }
    public int printPages (int pages) {


        if (tonerLevel > 1) {
            int pagesToPring = pages;
            if (this.isDuplex){
                pagesToPring= (int) Math.ceil( (double) pagesToPring/2);
                System.out.println( "Printing in Duplex mode ");
            }
            this.numberOfPrintedPages+=pagesToPring;
            System.out.println("Printing " + pages + " pages");
            System.out.println("Total printed pages: " + this.numberOfPrintedPages);
            return pagesToPring;
        }
        else {
            System.out.println(" Toner is not enough. Please fill up the toner");
            return -1;
        }


    }

}


// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).

// Decide on the scope, whether to use constructors, and anything else you think is needed.