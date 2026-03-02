package Exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.printf("Nome do Correntista: ");
        c1.Nome = sc.next();


        c1.inicarConta();
        c1.adicionarSaldo(100);
        System.out.println("Conta Iniciada");

        System.out.printf("Nome do Correntista: ");
        c2.Nome = sc.next();


        c2.inicarConta();
        c2.adicionarSaldo(100);
        System.out.println("Conta Iniciada");

        c1.transferir(50, c2);

        System.out.println(c1.verificarSaldo());
        System.out.println(c2.verificarSaldo());

        System.out.println();
    }
}
