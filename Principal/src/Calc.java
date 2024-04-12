public class Calc {

    public double calcular(double num1, String operacao, double num2) {
        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                System.exit(1);
        }

        return resultado;
    }
}
