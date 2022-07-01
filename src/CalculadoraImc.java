import javax.swing.*;
import java.text.DecimalFormat;

public class CalculadoraImc {
    public static void main(String args[]) {

        double peso, altura, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));

        imc = peso / (altura * altura);
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        JOptionPane.showMessageDialog(null, "seu IMC é ="+valorFormatado);
    }
}
