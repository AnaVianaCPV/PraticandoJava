package Gassociacao.domain;

public class Seminario {
    private String seminario;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String seminario, Local local) {
        this.seminario = seminario;
        this.local = local;
    }

    public Seminario(String seminario, Aluno[] alunos, Local local) {
        this.seminario = seminario;
        this.alunos = alunos;
        this.local = local;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }
}
