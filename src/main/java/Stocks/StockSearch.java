package Stocks;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author Gonçalo Fonseca (1150503@isep.ipp.pt)
 */
public class StockSearch {

    private String stockTicker;

    public StockSearch(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public void stockCaller() throws IOException {
        simpleSearchQuery();
    }

    private void simpleSearchQuery() throws IOException {
        Stock stock = YahooFinance.get(stockTicker);
        String name = stock.getName();
        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
    }
}
