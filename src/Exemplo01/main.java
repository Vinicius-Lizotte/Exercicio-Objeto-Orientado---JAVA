package Exemplo01;

public class main {
    public static void main(String[] args) {
        Produto pr = new Produto(5, "arroz", 25);

        pr.mudarValor(7);
        System.out.println(pr.getDados());
    }
}
