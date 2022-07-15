import java.util.ArrayList;

public class Universidade
{
    private ArrayList<Usuario> usuariosPertencentes;
    private String nome;
    private String sigla;
    private ArrayList<Projeto> projetoPertencentes;
    private ArrayList<Atividade> atividadePertencentes;

    public Universidade(String nome, String sigla)
    {
        this.usuariosPertencentes = new ArrayList<Usuario>();
        this.nome = nome;
        this.sigla = sigla;
        this.projetoPertencentes = new ArrayList<Projeto>();
        this.atividadePertencentes = new ArrayList<Atividade>();
    }

    public String getSigla() {
        return sigla;
    }

    public ArrayList<Atividade> getAtividadePertencentes() {
        return this.atividadePertencentes;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Projeto> getProjetoPertencentes() {
        return this.projetoPertencentes;
    }

    public ArrayList<Usuario> getUsuariosPertencentes() {
        return this.usuariosPertencentes;
    }

}
