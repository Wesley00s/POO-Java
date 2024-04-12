public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Mustang", "2020", "Azul", 4);
        Moto moto = new Moto("Honda", "Titan 150", "2015", "Vermelha", 150);

        String descricaoCarro =  carro.descricao();
        String descricaoMoto =  moto.descricao();

        System.out.println(descricaoCarro);
        System.out.println(descricaoMoto);
    }
}