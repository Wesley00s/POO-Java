public class Livro {
    private String nome;
    private String descricao;
    private double preco;
    private String isbn;
    private Autor autor;

    public Livro(String nome, String descricao, double preco, String isbn, Autor autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String mostrarDetalhes() {
        return  "DETALHES DO LIVRO ------------------"
                + "\nNome: " + nome
                + "\nDescricao: " + descricao
                + "\nPreco: " + preco
                + "\nISBN: " + isbn
                + "\nDETALHES DO AUTOR ------------------"
                + "\nNome do autor: " + autor.getNome()
                + "\nEmail do autor: " + autor.getEmail()
                + "\nCPF do autor: " + autor.getCpf();
    }
}
