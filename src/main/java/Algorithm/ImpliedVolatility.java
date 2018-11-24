package Algorithm;

import javax.swing.*;

/**
 * @author Gonçalo Fonseca (1150503@isep.ipp.pt)
 */
public class ImpliedVolatility {

    private double valueToSpend; // value that you wish to spend
    private double iv; // implied volatility

    public ImpliedVolatility(double valueToSpend, double iv) {
        this.valueToSpend = valueToSpend;
        this.iv = iv;
    }

    public void operationCall() {
      operation();
    }

    private void operation() {
        if (iv > 100) {
            JOptionPane.showMessageDialog(null, "IV above 100. Just spend the ammount you want to spend");
        } else {
            double multiply = (100/iv);
            double finalValue = Math.round(valueToSpend * multiply);
            JOptionPane.showMessageDialog(null, "Value to risk in total is " +finalValue+ "$");
        }

    }
}
