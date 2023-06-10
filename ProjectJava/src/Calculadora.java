public class Calculadora {
    private double numero1;
    private double numero2;
    private char operador;

    public double calcular() {
        switch (operador) {
            case '+':
                return numero1 + numero2;
            case '-':
                return numero1 - numero2;
            case '*':
                return numero1 * numero2;
            case '/':
                if (numero2 != 0) {
                    return numero1 / numero2;
                } else {
                    throw new ArithmeticException("Erro: divisão por zero!");
                }
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
}