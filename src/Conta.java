import org.w3c.dom.ranges.Range;

import java.util.Random;
0
public class Conta {
    String Nome;
    int Numero;
    double Saldo;

    public void gerarNumero(){
        Random rand = new Random();

    Numero = rand.nextInt(1000, 9999);
    }

    public void inicarConta(){
        Saldo = 0;
        gerarNumero();
    }

    public void adicionarSaldo(double valor){
        Saldo += valor;
    }

    public String subtrariSaldo(double valor){
        if (valor > Saldo){
            return "Valor Maior que Saldo";
        }
        Saldo -= valor;
        return "Saque feito com Sucesso";
    }

    public double verificarSaldo(){
        return Saldo;
    }
}
