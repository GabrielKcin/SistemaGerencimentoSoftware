import java.util.ArrayList;

public class BancoDeInfo
{

    ArrayList<Projeto> bancoProjeto;
    ArrayList<Atividade> bancoAtividade;
    ArrayList<Usuario> bancoUsuario;
    ArrayList<Universidade> bancoUniversidade;

    
    public BancoDeInfo()
    {
        this.bancoProjeto = new ArrayList<Projeto>();
        this.bancoAtividade = new ArrayList<Atividade>();
        this.bancoUsuario = new ArrayList<Usuario>();
        this.bancoUniversidade = new ArrayList<Universidade>();
    }

    public boolean verificaLogando(String login, String senha) //TRUE PARA JÁ EXISTE E FALSE PARA NAO EXISTE
    {
        if(this.bancoUsuario.isEmpty())
        {
            return false;
        }
        else
        {
            for (Usuario usuario : this.bancoUsuario)
            {
                if(usuario.getLogin().equals(login) == true)
                {
                    if(usuario.getSenha().equals(senha) == true)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }    
            }
        }
        return false;
    }

    public Usuario getUsuarioDadoLoginESenha(String login, String senha)
    {
        for(Usuario usuario : this.bancoUsuario)
        {
                if( (usuario.getLogin().equals(login) == true) && (usuario.getSenha().equals(senha) == true) )
                {
                    return usuario;
                }
        }
        return null;
    }


}
