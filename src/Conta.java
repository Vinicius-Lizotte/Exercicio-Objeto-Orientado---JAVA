import org.w3c.dom.ranges.Range;

import java.util.Random;

public class Conta {
    String Nome;
    int Numero;
    double Saldo;

    public void gerarNumero(){
        Random rand = new Random();

    Numero = rand.nextInt(1000);
    }

    public void inicarConta(){
        Saldo = 0;
        gerarNumero();
    }

    public void adicionarSaldo(double valor){
        Saldo += valor;
    }

    public void subtrariSaldo(double valor){
        Saldo -= valor;
    }

    public double verificarSaldo(){
        return Saldo;
    }
}
