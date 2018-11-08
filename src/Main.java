import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double valueToRisk = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you want to risk ?"));
        double iv = Double.parseDouble(JOptionPane.showInputDialog(null, "How much is the implied volatility ?"));

        ImpliedVolatility impliedVolatility = new ImpliedVolatility(valueToRisk, iv);
        impliedVolatility.operation();
        }
}
