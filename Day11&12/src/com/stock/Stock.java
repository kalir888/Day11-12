package com.stock;

public class Stock {
    public String shareName;
    public int numberOfShare;
    public long sharePrice;
    public long stockValue;


    public Stock(String shareName, int numberOfShare, long sharePrice) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    public void calculateStockValue() {
        stockValue = numberOfShare * sharePrice;
    }

    public void printStockReport() {
        System.out.println("The Stock value of the " + shareName + " is = " + stockValue);
    }
}
