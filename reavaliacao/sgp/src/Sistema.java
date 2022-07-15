import java.util.ArrayList;


public class Sistema
{

    //                                                  TELA INICIAL
    public static void principal()
    {
        BancoDeInfo dadosSistema = new BancoDeInfo();
        boolean continua = true;
        do
        {
            System.out.println("---------- Sistema de Gerenciamento de Projetos ----------");
            System.out.println("1 - Crie uma conta");
            System.out.println("2 - Faça login");
            System.out.println("3 - Seção Administrador SGP (login: admin | senha: admin)");
            System.out.println("0 - Saia do programa");
            System.out.print("Digite sua escolha: ");
            int escolha = EntradaDeDados.recebaInteiro();
            if( (dadosSistema.bancoUniversidade.isEmpty()) && (escolha >= 1 && escolha <= 2))
            {
                System.out.println("\n\nDesculpe essa escolha está indisponível no momento, em virtude de não haver 'Universidades' dentro do 'Sistema'.\nPor favor contate o seu 'Administrador de SGP' para que ele adicione a sua 'Univerisade' no 'Sistema'.\n\n");
                continue;
            }
            switch (escolha)
            {
                case 1:
                    afastar();
                    dadosSistema.bancoUsuario.add(Sistema.criarConta(dadosSistema.bancoUsuario, dadosSistema.bancoUniversidade));
                    afastar();
                    break;
                case 2:
                    afastar();
                    FazerLogin(dadosSistema);
                    break;
                case 3:
                    afastar();
                    System.out.println("===== ADMINISTRADOR SGP =====");
                    String login, senha;
                    System.out.print("Digite o Login: ");
                    login = EntradaDeDados.recebaString();
                    System.out.print("Digite o Senha: ");
                    senha = EntradaDeDados.recebaString();
                    if( (login.equals("admin")) && (senha.equals("admin")) )
                    {
                        Administrador.telaDoAdmin(dadosSistema);
                    }
                    afastar();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Escolha inexistente. Digite uma 'escolha' possível!");
            }
        }while(continua);
    }


    //                                   CRIANDO CONTA DE USUÁRIO
    public static Usuario criarConta(ArrayList<Usuario> copia, ArrayList<Universidade> listaUniversidade)
    {
        System.out.println("\n\n---------- Sistema de Gerenciamento de Projetos ----------");
        System.out.println("\n                  => CRIANDO CONTA <=\n");
        Usuario a = new Usuario();
        String aux;
        do
        {
            System.out.print("Digite seu Nome: ");
            aux = EntradaDeDados.recebaString();
            if(a.verificaNome(aux, copia))
            {
                System.out.println("\nEsse \"nome\" já existe dentro do Sistema! Por favor digite outro.\n");
            }
            else
            {
                break;
            }
        }while(true);
        a.setNome(aux);
        do
        {
            System.out.print("Digite seu Login: ");
            aux = EntradaDeDados.recebaString();
            if(a.verificaLogin(aux, copia))
            {
                System.out.println("\nEsse \"login\" já existe dentro do Sistema! Por favor digite outro.\n");
            }
            else
            {
                break;
            }
        }while(true);
        a.setLogin(aux);
        System.out.print("Digite sua Senha: ");
        a.setSenha(EntradaDeDados.recebaString());
        int x, y = 0;
        do
        {
            System.out.println("\n=>DECLARANDO CARGO");
            System.out.println("(1) - ALUNO DE GRADUAÇÃO");
            System.out.println("(2) - ALUNO DE MESTRADO");
            System.out.println("(3) - ALUNO DE DOUTORADO");
            System.out.println("(4) - PROFESSOR");
            System.out.println("(5) - PROFISSIONAL (DESENVOLVEDOR, TESTADOR E ANALISTA)");
            System.out.println("(6) - PESQUISADOR");
            System.out.println("(7) - TÉCNICO");
            System.out.print("\nDigite o número do seu cargo: ");
            x = EntradaDeDados.recebaInteiro();
            if(x == 4 || x == 6)
            {
                a.sethabilitadoParaCoordenador(true);
            }
            else
            {
                a.sethabilitadoParaCoordenador(false);
            }
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
        System.out.println("\n=>DECLARANDO UNIVERSIDADE");
        int escolha;
        do
        {
            for (Universidade mostrando : listaUniversidade)
            {
                int i = 0;
                System.out.print("(" + (i + 1) + ") " + mostrando.getSigla() + " - " + mostrando.getNome());
                i++;
            }
            System.out.print("\nDigite o número da sua Universidade: ");
            escolha = EntradaDeDados.recebaInteiro();
        }while(!(escolha < listaUniversidade.size()));
        a.setUniversidade(listaUniversidade.get(escolha - 1).getSigla());
        listaUniversidade.get(escolha - 1).getUsuariosPertencentes().add(a);
        return a;
    }


    //      FAZENDO LOGIN DE USUARIO
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
                afastar();
                telaPrincipal(a, login, senha);
                break;
            }
            else
            {
                System.out.println("\n\nLOGIN E SENHA INCORRETOS. VOCÊ TEM " + (4 - i) +  " TENTATIVAS");
            }
        }
    }


    // TELA APÓS O LOGIN SER BEM SUCEDIDO
    public static void telaPrincipal(BancoDeInfo database, String loginatual, String senhaatual)
    {
        afastar();
        Usuario atual = database.getUsuarioDadoLoginESenha(loginatual, senhaatual);
        informacaoUsuarioAtual(atual);
        opcoesTelaPrincipal(atual);
        

        
    }

    public static void informacaoUsuarioAtual(Usuario a)
    {
        System.out.println("USUÁRIO ATUAL");
        System.out.println("NOME: " + a.getNome() + "\nCARGO: " + a.getCargo() + "\nUNIVERSIDADE: " + a.getUniversidade());
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void opcoesTelaPrincipal(Usuario atual)
    {
        if(atual.gethabilitadoParaCoordenador())
        {
            do
            {
                System.out.println("(1) CRIAR PROJETO");
                System.out.println("(0) DESLOGAR");
                int escolha = EntradaDeDados.recebaInteiro();
                switch(escolha)
                {
                    case 1:

                        break;
                    case 0:
                        break;
                    default:
                }
            }while(true);
        }
        else
        {

        }


    }

    public static void criarProjeto()
    {

    }







    public static void afastar()
    {
        System.out.println("\n\n\n\n\n\n");
    }



}
