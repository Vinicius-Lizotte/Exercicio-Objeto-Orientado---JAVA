package Exercicio03_Static;

import java.util.Random;

public class BilheteUnico {
    int Numero;
    private double Saldo;
    private final static int TarifaBase = 5;
    Usuario usuario;

    Random rd = new Random();

    public BilheteUnico(Usuario usuario){
        this.Numero = rd.nextInt(100, 9999);
        this.Saldo = 0;
        this.usuario = usuario;
    }

    public void carregar(double valor){
        Saldo += valor;
    }

    public boolean subtrair(double valor){
        if (valor < Saldo){
            Saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return Saldo;
    }

    public boolean catraca(){
        if (usuario.tipoTarifa == "Aluno" || usuario.tipoTarifa == "Professor"){
            return subtrair((TarifaBase * 0.5));
        } else {
            return subtrair(TarifaBase);
        }
    }
}
