import java.util.ArrayList;

public class BancoDeInfo
{
    ArrayList<Projeto> bancoProjeto;
    ArrayList<Atividade> bancoAtividade;
    ArrayList<Usuario> bancoUsuario;

    public BancoDeInfo()
    {
        this.bancoProjeto = new ArrayList<Projeto>();
        this.bancoAtividade = new ArrayList<Atividade>();
        this.bancoUsuario = new ArrayList<Usuario>();
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
                if(usuario.login.equals(login) == true)
                {
                    if(usuario.senha.equals(senha) == true)
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
                if( (usuario.login.equals(login) == true) && (usuario.senha.equals(senha) == true) )
                {
                    return usuario;
                }
        }
        return null;
    }


}
