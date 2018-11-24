package MainClasses;

import Algorithm.ImpliedVolatility;
import Stocks.StockQueries;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        double valueToRisk = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you want to risk ?"));
        double iv = Double.parseDouble(JOptionPane.showInputDialog(null, "How much is the implied volatility ?"));

        ImpliedVolatility impliedVolatility = new ImpliedVolatility(valueToRisk, iv);
        impliedVolatility.operationCall();

//        String name = JOptionPane.showInputDialog(null, "Ticker of the Stock you want");
//        StockQueries stockQueries = new StockQueries(name);
//        JOptionPane.showMessageDialog(null,"Current stock price " +stockQueries.StockPriceQuery().toPlainString());
//        JOptionPane.showMessageDialog(null,"Stock day change " +stockQueries.StockChange());
//        JOptionPane.showMessageDialog(null,"Stock day bid " +stockQueries.StockBid());
//        JOptionPane.showMessageDialog(null,"Stock day ask " +stockQueries.StockAsk());
        }
}
