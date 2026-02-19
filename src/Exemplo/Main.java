package Exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Conta ct = new Conta();

        System.out.printf("Nome do Correntista: ");
        ct.Nome = sc.next();

        ct.inicarConta();

        System.out.println("Conta Iniciada");
    }
}
