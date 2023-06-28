package exercicios.Classes;
//criação da classe circulo com o atributo raio

public class Circulo {
	//raio é a medida do centro a extremidade
	private double raio;
	
	public Circulo(double raio) {
        this.raio = raio;
    }
	
	
	//método para calcular área e perimetro
	
	public double calcularArea() {
        return Math.PI * raio * raio;
    }
	
	
	public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
	
	//calcular diametro com raio de parametro
	
	public static double calcularDiametro(double raio) {
        return 2 * raio;
    }
	

	public static void main(String[] args) {
		//criação objeto 
        Circulo circulo = new Circulo(12.0);
        
        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();
        double diametro = Circulo.calcularDiametro(circulo.raio);
        
        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);
        System.out.println("Diâmetro do círculo: " + diametro);
		

	}

}
