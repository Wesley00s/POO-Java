public class Carro {
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private int numeroPortas;

    public Carro(String marca, String modelo, String ano, String cor, int numeroPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroPortas = numeroPortas;
    }

    public String descricao() {
        return "----- DESCRIÇAO DO CARRO -----\n" +
                "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n' +
                "Ano: " + ano + '\n' +
                "Cor: " + cor + '\n' +
                "Número de portas: " + numeroPortas + '\n';
    }
}
