package Exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Professor pf = new Professor();
        Scanner   sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("-----------------------");
        System.out.printf("Nome Professor: ");
        pf.Nome = sc.next();

        System.out.printf("Aulas Semanais: ");
        pf.Aulas = sc.nextInt();

        System.out.printf("Valor a Auala: ");
        pf.valor_hora = sc.nextDouble();

        System.out.println("--------------------------");
        System.out.println("Salário Bruto: " + df.format(pf.SalarioBruto()));
        System.out.println("Salário Base: " + df.format(pf.SalarioBase()));
        System.out.println("Salário atividade: " + df.format(pf.Adicional()));
        System.out.println("Salário semanal: " + df.format(pf.Descanso()));
    }
}
