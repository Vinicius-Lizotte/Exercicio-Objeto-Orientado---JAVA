package Exercicio03_Static;

import java.util.Random;

public class BilheteUnico {
    int Numero;
    private String Nome;
    private double Saldo;
    private final static int TarifaBase = 5;
    private String TipoTarifa;

    Random rd = new Random();

    public BilheteUnico(String Nome, String TipoTarifa){
        this.Numero = rd.nextInt(100, 9999);
        this.Nome = Nome;
        this.Saldo = 0;
        this.TipoTarifa = TipoTarifa;
    }

    public void carregar(double valor){
        Saldo += valor;
    }

    public void subtrair(double valor){
        Saldo -= valor;
    }

    public double getSaldo(){
        return Saldo;
    }

    public void catraca(){
        if (TipoTarifa == "Aluno" || TipoTarifa == "Professor"){
            subtrair((TarifaBase * 0.5));
        } else {
            subtrair(TarifaBase);
        }
    }
}
