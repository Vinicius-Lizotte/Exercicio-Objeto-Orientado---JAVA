package Exercicio03_Static;

import java.util.Random;

public class BilheteUnico {
    private int Numero;
    private double Saldo;
    private final static double TarifaBase = 5;
    private Usuario usuario;

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
        if (valor <= Saldo){
            Saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return Saldo;
    }

    public double getTarifa(){
        double valor = TarifaBase / 2;

        if (usuario.tipoTarifa.equalsIgnoreCase("comum")){
            valor = TarifaBase;
        }
        return valor;
    }

    public boolean catraca(){
        double valor = getTarifa();
            return subtrair(valor);
    }
}
