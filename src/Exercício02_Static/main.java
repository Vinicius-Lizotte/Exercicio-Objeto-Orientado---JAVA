package Exercício02_Static;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String No;

        System.out.printf("Nome Paciente1: ");
        SenhaAtendimento S1 = new SenhaAtendimento(sc.next());

        System.out.printf("Nome Paciente2: ");
        SenhaAtendimento S2 = new SenhaAtendimento(sc.next());

        System.out.println(S1.getDados());
        System.out.println(S2.getDados());

    }
}
