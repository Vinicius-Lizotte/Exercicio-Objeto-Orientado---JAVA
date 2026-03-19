package Exercicio03_Static;

public class Usuario {
    private String nome;
    private long cpf;
    public String tipoTarifa;

    public Usuario(String nome, long CPF, String tipoTarifa) {
        this.nome = nome;
        this.cpf = CPF;
        this.tipoTarifa = tipoTarifa;
    }

    public long getCPF(){
        return cpf;
    }
}
