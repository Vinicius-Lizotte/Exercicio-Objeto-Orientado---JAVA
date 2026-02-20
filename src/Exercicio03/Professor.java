package Exercicio03;

public class Professor {
    String Nome;
    int Aulas;
    double valor_hora;

    public double SalarioBase(){
        return (Aulas * 4.5) * valor_hora;
    }

    public double Adicional(){
        return  SalarioBase() * 0.05;
    }

    public double Descanso(){
        return (SalarioBase() + Adicional()) / 6;
    }

    public double SalarioBruto(){
        return (SalarioBase() + Adicional() + Descanso());
    }

}
