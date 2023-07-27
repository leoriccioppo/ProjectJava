package exercicios.LivrariaOnline.livro;

public class LivroFisico extends Livro{
    
    private double peso;
    private double precoFrete;

    public LivroFisico(String title, String author, String isbn, double price, double peso, double precoFrete) {
        super(title, author, isbn, price);

        this.peso = peso;
        this.precoFrete = precoFrete;
    }

    //getters and setters
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecoFrete() {
        return precoFrete;
    }
    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
}
