package Exercicio03_Static;

import java.util.Scanner;

public class main {
    static BilheteUnico[] bilhete = new BilheteUnico[3];
    static Scanner sc = new Scanner(System.in);
    static int Index;
    
    public static void main(String[] args) {
        int opc;
        do {
            System.out.println("-----------------------------------");
            System.out.println("[1] Cadastrar Bilhete");
            System.out.println("[2] Carregar Bilhete");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[4] Passar na Catraca");
            System.out.println("[5] Finalizar");
            opc = sc.nextInt();


            System.out.println("-----------------------------------");
            switch (opc) {
                case 1  -> cadastrar();
                case 2  -> Carregar();
                case 3  -> Saldo();
                case 4  -> Catraca();
                case 5  -> System.out.println("Até Breve !");
                default -> System.out.println("Opção Inválida");
            }
            
        } while (opc != 5);
    
    }

    private static void Carregar() {
        double valor;
        BilheteUnico bilhete = pesquisar();
        if (bilhete != null) {
            System.out.println("Valor da recargar: ");
            valor = sc.nextDouble();
            bilhete.carregar(valor);
        }
    }

    private static void Saldo() {
        double valor;
        BilheteUnico bilhete = pesquisar();
        if (bilhete != null) {
            System.out.println("Saldo: " + bilhete.getSaldo());
        }
    }

    private static void Catraca(){
        BilheteUnico bilhete = pesquisar();
        if (bilhete != null) {
            if (bilhete.catraca()){
                System.out.println("Aceso Liberado");
            } else {
                System.out.println("Aceso Nao Liberado");
            }
            System.out.println("Saldo: " + bilhete.getSaldo());
        }
    }

    private static void cadastrar() {

        String Nome;
        long CPF;
        String tipoTarifa;

        if (Index < bilhete.length) {
            System.out.printf("Digite o nome : ");
            Nome = sc.next();

            System.out.printf("Digite o CPF : ");
            CPF = sc.nextLong();

            System.out.printf("Digite o tipo (Aluno, Professor, Comum): ");
            tipoTarifa = sc.next();

            bilhete[Index] = new BilheteUnico(new Usuario(Nome, CPF, tipoTarifa));
            Index++;
            System.out.println("Cadastrado com sucesso!");
        }
        else {
            System.out.println("Limite atingido!");
        }
    }

    private static BilheteUnico pesquisar(){
        long cpf;
        System.out.println("Digite CPF para pesquisar: ");
        cpf = sc.nextLong();

        for (int i = 0; i < Index; i++) {
            if (bilhete[i].usuario.getCPF() == cpf){
                return bilhete[i];
            }
        }
        System.out.println("Bilehte não encontrado!");
        return null;
    }
}
