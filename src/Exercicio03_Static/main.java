package Exercicio03_Static;

public class main {
    public static void main(String[] args) {
        BilheteUnico b1 = new BilheteUnico("Miguel", "Aluno");
        BilheteUnico b2 = new BilheteUnico("Selmini", "Professor");
        BilheteUnico b3 = new BilheteUnico("Caio", "Normal");

        b1.carregar(100);
        b2.carregar(100);
        b3.carregar(100);

        b1.catraca();
        b2.catraca();
        b3.catraca();

        System.out.println(b1.getSaldo());
        System.out.println(b2.getSaldo());
        System.out.println(b3.getSaldo());
    }
}
