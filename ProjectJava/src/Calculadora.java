public class Calculadora {
	private double numero1, numero2;
	private char operador;

    public double calcular() {
        
    	double resultado = 0;
    	
        switch (operador) {
            case '+':
                resultado = somar(numero1,numero2);
                break;
            case '-':
            	resultado = subtracao(numero1,numero2);
                break;
            case '*':
            	resultado = multiplicacao(numero1,numero2);
                break;
            case '/':
                if (numero2 != 0) {
                	resultado = divisao(numero1,numero2);
                    break;
                } else {
                    throw new ArithmeticException("Erro: divisão por zero!");
                }
            default:
               throw new IllegalArgumentException("Operação inválida!");      
        }
        return resultado;
    }
    
    private double somar (double numero1, double numero2) {
    	return numero1 + numero2;
    };
    
    private double subtracao (double numero1, double numero2) {
    	return numero1 - numero2;
    };
    
    private double multiplicacao (double numero1, double numero2) {
    	return numero1 * numero2;
    };
    
    private double divisao (double numero1, double numero2) {
    	return numero1 / numero2;
    };

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    };

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    };

    public void setOperador(char operador) {
        this.operador = operador;
    };
}