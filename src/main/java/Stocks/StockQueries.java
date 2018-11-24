package Stocks;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class StockQueries {

    private Stock stock;

    public StockQueries(String stockTicker) throws IOException {
        stock = YahooFinance.get(stockTicker);
    }

    public BigDecimal StockPriceQuery() throws IOException {
        return stock.getQuote(true).getPrice();
    }

    public BigDecimal StockBid() throws IOException {
        return stock.getQuote(true).getBid();
    }
    public BigDecimal StockAsk() throws IOException {
        return stock.getQuote(true).getAsk();
    }

    public BigDecimal StockChange() throws IOException {
        return stock.getQuote(true).getChange();
    }
}
