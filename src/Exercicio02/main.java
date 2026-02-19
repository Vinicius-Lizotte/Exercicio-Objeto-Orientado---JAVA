package Exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Paciente pc = new Paciente();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("Nome do Paciente: ");
        pc.Nome = sc.next();

        System.out.printf("Idade do Paciente: ");
        pc.Idade = sc.nextInt();

        System.out.println("----------------------");
        System.out.println("Batimento  Máximo: " + pc.frequencia_max());

        double[] freq_alvo = pc.frequencia_alvo();

        System.out.println("Batimento Alvo");
        System.out.println("Inicial: " + df.format(freq_alvo[0]));
        System.out.println("Final: " + df.format(freq_alvo[1]));
        System.out.println();
    }
}
