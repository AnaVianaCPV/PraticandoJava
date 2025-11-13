package Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 01");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 02");
    }


    public Pessoa(String nome) {
        this.nome = nome;
    }

    {
        System.out.println("Dentro do construtor pessoa");
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco();
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
