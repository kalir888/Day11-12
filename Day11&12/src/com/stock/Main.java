package com.stock;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Stock stock1 = new Stock("Tata",5,15000);
        Stock stock2 = new Stock("Reliance",8,50000);
        Stock stock3 = new Stock("Adhani Enterprises",5,25000);
        Stock stock4 = new Stock("Swiggy",10,15000);

        StockPortFolio stockPortFolio = new StockPortFolio();
        stockPortFolio.addStock(stock1);
        stockPortFolio.addStock(stock2);
        stockPortFolio.addStock(stock3);
        stockPortFolio.addStock(stock4);

        List<Stock> stockList = new ArrayList<>();
        stockList = stockPortFolio.getStockList();

        UserInterface userInterface = new UserInterface();
        userInterface.printTotalReport(stockList);
    }
}
