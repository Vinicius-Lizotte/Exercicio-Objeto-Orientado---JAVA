package Exercício02_Static;

public class SenhaAtendimento {
    private static int Controle = 1;
    private int Senha;
    private String  Nome;

    public SenhaAtendimento(String Nome){
        this.Nome = Nome;
        this.Senha = Controle;
        Controle++;
    }

    public String getDados(){
        return "Paciente: " + Nome + "| " + "Senha: " + Senha;
    }

}
