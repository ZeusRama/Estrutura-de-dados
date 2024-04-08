package ME1;

public class AlunoME {

    private String nome;

    public AlunoME(java.lang.String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }
}
