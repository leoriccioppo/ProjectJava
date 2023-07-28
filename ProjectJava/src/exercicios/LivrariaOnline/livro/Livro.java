package exercicios.LivrariaOnline.livro;

public class Livro {
    private String title;
    private String author;
    private String isbn;
    private double price;

    //construtor com parametros
    public Livro(String title, String author, String isbn, double price){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;

    }

    //calcular preco total, incluindo frete

    public double calcularPrecoTotal(){
        return price;
    }


    //public double calcularPrecoTotal(Livro precoComFrete){

        //verifica se é um livro fisico e calcula frete
//        if(precoComFrete instanceof LivroFisico){
  //         LivroFisico livroFisico = (LivroFisico) precoComFrete;
    //        return livroFisico.getPrice() + livroFisico.getPrecoFrete();

      //  }else{

        //    return precoComFrete.getPrice();

        //}
    //}

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
