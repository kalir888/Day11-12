package com.stock;

import java.util.List;

public class UserInterface {
    public void printTotalReport(List<Stock> stockList) {
        long totalStockValue = 0;
        for (Stock stock: stockList) {
            stock.calculateStockValue();
            stock.printStockReport();
            totalStockValue += stock.stockValue;
        }
        System.out.println("The Total Stock Value of your Stock PortFolio is " + totalStockValue);
    }
}
