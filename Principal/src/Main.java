import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        double resultado = calc.calcular(Double.parseDouble(input1), operacao, Double.parseDouble(input2));

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}