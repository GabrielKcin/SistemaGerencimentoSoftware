import java.util.ArrayList;

public class Usuario
{
    String nome;
    String login;
    String senha;
    String cargo;
    ArrayList<Projeto> projetosIncluidos;
    ArrayList<Atividade> atividadesIncluidos;

    public String getCargo()
    {
        return cargo;
    }

    public String getLogin()
    {
        return login;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSenha()
    {
        return senha;
    }

    public ArrayList<Atividade> getAtividadesIncluidos() {
        return atividadesIncluidos;
    }

    public ArrayList<Projeto> getProjetosIncluidos() {
        return projetosIncluidos;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean verificaNome(String unica, ArrayList<Usuario> copia) //VTRUE PARA JÁ EXISTE E FALSE PARA NAO EXISTE
    {
        for (Usuario usuario : copia)
        {
            if(usuario.nome.equals(unica) == true)
            {
                return true;
            }    
        }
        return false;
    }

    public boolean verificaLogin(String unica, ArrayList<Usuario> copia) //VTRUE PARA JÁ EXISTE E FALSE PARA NAO EXISTE
    {
        for (Usuario usuario : copia)
        {
            if(usuario.login.equals(unica) == true)
            {
                
            }    
        }
        return false;
    }

}
