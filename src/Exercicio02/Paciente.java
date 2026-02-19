package Exercicio02;

public class Paciente {
    String Nome;
    int Idade;

    public int frequencia_max(){
        return 220 - Idade;
    }

    public double[] frequencia_alvo(){
        double alvo[] = new double[2];
        int freq = frequencia_max();
        alvo[0] = freq * 0.5;
        alvo[1] = freq * 0.85;

        return alvo;
    }
}
