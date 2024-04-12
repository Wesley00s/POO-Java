public class Moto {
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private int cilindradas;

    public Moto(String marca, String modelo, String ano, String cor, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.cilindradas = cilindradas;
    }

    public String descricao() {
        return "----- DESCRIÇAO DA MOTO -----\n" +
                "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n' +
                "Ano: " + ano + '\n' +
                "Cor: " + cor + '\n' +
                "Cilindradas: " + cilindradas + '\n';
    }
}
