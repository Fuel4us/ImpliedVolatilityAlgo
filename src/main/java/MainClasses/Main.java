package MainClasses;

import Algorithm.ImpliedVolatility;
import Stocks.StockSearch;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        double valueToRisk = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you want to risk ?"));
        double iv = Double.parseDouble(JOptionPane.showInputDialog(null, "How much is the implied volatility ?"));

        ImpliedVolatility impliedVolatility = new ImpliedVolatility(valueToRisk, iv);
        impliedVolatility.operationCall();

        /*StockSearch stockSearch = new StockSearch("ANET");
        stockSearch.stockCaller();*/

        }
}
