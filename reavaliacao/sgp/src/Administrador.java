public class Administrador
{
    public static void telaDoAdmin(BancoDeInfo dados)
    {
        Sistema.afastar();
        boolean continua = true;
        do
        {
            System.out.println("===== MENU DO ADMIN =====\n\n");
            System.out.println("(1) CRIAR ENTIDADE UNIVERSIDADE");
            System.out.println("(0) DESLOGAR");
            System.out.print("\nDigite sua opcao: ");
            int escolha = EntradaDeDados.recebaInteiro();
            switch(escolha)
            {
                case 1:
                    Universidade aux = criarUniversidade();
                    dados.bancoUniversidade.add(aux);
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("\nOpção não identificada! Digite uma opção existente.\n");
            }
        }while(continua);
    }

    private static Universidade criarUniversidade()
    {
        Sistema.afastar();
        System.out.println("===== CRIANDO ENTIDADE UNIVERSIDADE =====");
        System.out.print("Digite a 'sigla da Univerisade': ");
        String sigla = EntradaDeDados.recebaString();
        System.out.print("Digite o 'nome da Univerisade': ");
        String nome = EntradaDeDados.recebaString();
        Universidade a =  new Universidade(nome, sigla);
        return a;
    }

}
