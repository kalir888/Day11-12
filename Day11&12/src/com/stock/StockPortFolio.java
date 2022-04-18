package com.stock;


import java.util.ArrayList;
import java.util.List;

public class StockPortFolio {
    private List<Stock> stockList = new ArrayList<>();

    public void addStock(Stock stock) {
        stockList.add(stock);
    }

    public List<Stock> getStockList() {
        return stockList;
    }
}
