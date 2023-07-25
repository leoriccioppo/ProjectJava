package exercicios.LivrariaOnline;

public class Ebook extends Livro{
   
    private double tamanhoEmMb;

     public Ebook(String title, String author, String isbn, double price, double tamanhoEmMdb) {
        super(title, author, isbn, price);

        this.tamanhoEmMb = tamanhoEmMdb;
    }



    //getters and setters
    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }
    
}
