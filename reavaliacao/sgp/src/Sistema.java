import java.util.ArrayList;

public class Sistema
{

    //TELA PRINCIPAL
    public static void principal()
    {
        BancoDeInfo dadosSistema = new BancoDeInfo();
        boolean continua = true;
        do
        {
            System.out.println("---------- Sistema de Gerenciamento de Projetos ----------");
            System.out.println("1 - Crie uma conta");
            System.out.println("2 - Faça login");
            System.out.println("0 - Saia do programa");
            System.out.print("Digite sua escolha: ");
            int escolha = EntradaDeDados.recebaInteiro();
            switch (escolha)
            {
                case 1:
                    afastar();
                    dadosSistema.bancoUsuario.add(Sistema.criarConta(dadosSistema.bancoUsuario));
                    afastar();
                    break;
                case 2:
                    afastar();
                    FazerLogin(dadosSistema);
                    break;
                case 0:
                    continua = false;
                    System.out.println("\n\n\nSAINDO DO SGP\n");
                    System.out.println("TCHAU! FIM.");
                    afastar();
                    break;
                default:
                    System.out.println("Escolha inexistente. Digite uma 'escolha' possível!");
            }
        }while(continua);
    }


    public static Usuario criarConta(ArrayList<Usuario> copia)
    {
        System.out.println("\n\n---------- Sistema de Gerenciamento de Projetos ----------");
        System.out.println("\n                  => CRIANDO CONTA <=\n");
        Usuario a = new Usuario();
        String aux;
        do
        {
            System.out.print("Digite seu Nome: ");
            aux = EntradaDeDados.recebaString();
        }while(a.verificaNome(aux, copia));
        a.setNome(aux);
        do
        {
            System.out.print("Digite seu Login: ");
            aux = EntradaDeDados.recebaString();
        }while(a.verificaLogin(aux, copia));
        a.setLogin(aux);
        System.out.print("Digite sua Senha: ");
        a.setSenha(EntradaDeDados.recebaString());
        int x, y = 0;
        do
        {
            System.out.println("---------- DECLARANDO CARGO ----------");
            System.out.println("(1) - ALUNO DE GRADUAÇÃO");
            System.out.println("(2) - ALUNO DE MESTRADO");
            System.out.println("(3) - ALUNO DE DOUTORADO");
            System.out.println("(4) - PROFESSOR");
            System.out.println("(5) - PROFISSIONAL (DESENVOLVEDOR, TESTADOR E ANALISTA)");
            System.out.println("(6) - PESQUISADOR");
            System.out.println("(7) - TÉCNICO");
            System.out.print("\nDigite o número do seu cargo: ");
            x = EntradaDeDados.recebaInteiro();
            if(x == 5)
            {
                do
                {
                    System.out.println("Você disse que é um 'PROFISSIONAL'! Qual 'tipo de Profissional você é?'");
                    System.out.println("(1) - DESENVOLVEDOR");
                    System.out.println("(2) - TESTADOR");
                    System.out.println("(3) - ANALISTA");
                    System.out.print("Digite o tipo de profissional: ");
                    y = EntradaDeDados.recebaInteiro();
                    if(y >= 1 && y <= 3)
                    {
                        break;
                    }
                    else
                    {
                        System.out.print("\n\nESCOLHA INEXISTENTE! POR FAVOR DIGITE 1, 2 OU 3.\n\n");
                    }
                }while(true);
            }
        }while(!(x >= 1 && x <= 7));
        y = y + 6;
        String cargos[] = {"ALUNO DE GRADUAÇÃO", "ALUNO DE MESTRADO", "ALUNO DE DOUTORADO", "PROFESSOR", "PROFISSIONAL", "PESQUISADOR", "TÉCNICO", "DESENVOLVEDOR", "TESTADOR", "ANALISTA"};
        if(x != 5)
        {
            a.setCargo(cargos[x-1]);
        }
        else
        {
            a.setCargo(cargos[x - 1] + " - " + cargos[y]);
        }
        
        return a;
    }

    public static void FazerLogin(BancoDeInfo a)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("========== FAZENDO LOGIN ==========\n");
            System.out.print("LOGIN: ");
            String login = EntradaDeDados.recebaString();
            System.out.print("SENHA: ");
            String senha = EntradaDeDados.recebaString();
            if(a.verificaLogando(login, senha) == true)
            {
                telaPrincipal(a, login, senha);
            }
            else
            {
                System.out.println("\n\nLOGIN E SENHA INCORRETOS. VOCÊ TEM " + (4 - i) +  " TENTATIVAS");
            }
        }
        System.out.println("\n\nVOLTANDO PARA O MENU INICIAR\n\n");
    }

    public static void telaPrincipal(BancoDeInfo database, String loginatual, String senhaatual)
    {
        informacaoUsuarioAtual(database.getUsuarioDadoLoginESenha(loginatual, senhaatual));
        
    }

    public static void informacaoUsuarioAtual(Usuario a)
    {
        System.out.println("NOME: " + a.nome + "        " + "CARGO: " + a.cargo + "\n\n==================================================================================================");
    }









    public static void afastar()
    {
        System.out.println("\n\n\n\n\n\n");
    }



}
