public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123.456.789-10");
        Livro livro = new Livro("Java 8 Prático", "Novos recursos da linguagem", 65.30, "978-85-66250-46-6", autor);

        Autor autor2 = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br", "109.876.543-21");
        Livro livro2 = new Livro("Lógica de programação", "Crie seus primeiros programas", 59.90, "978-85-66250-22-0", autor2);

        System.out.println(livro.mostrarDetalhes());
        System.out.println("\n================================================\n");
        System.out.println(livro2.mostrarDetalhes());
    }
}