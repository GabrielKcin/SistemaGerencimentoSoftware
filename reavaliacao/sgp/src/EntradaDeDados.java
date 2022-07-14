import java.util.*;

public class EntradaDeDados
{
    public static int recebaInteiro()
    {
        int a = 0;
        boolean c;
        do
        {
            try
            {
                c = true;
                Scanner teclado = new Scanner(System.in);
                a = Integer.parseInt(teclado.nextLine());
            }
            catch(NoSuchElementException e)
            {
                c = false;
                System.out.println("Entrou aqui (inteiro)");
            }
            catch(NumberFormatException e)
            {
                c = false;
                System.out.println("Isso que foi digitado não é um número inteiro. Por favor digite um número inteiro");
                System.out.println("Digite a escolha: ");
            }
        }while(!c);
        return a;
    }

    public static String recebaString()
    {
        boolean condicao;
        String a = "erroX9A234";
        do
        {

            try
            {
                condicao = true;
                Scanner teclado = new Scanner(System.in);
                a = teclado.nextLine();
            }
            catch(NoSuchElementException e)
            {
                condicao = false;
                System.out.println("Entrou aqui (string)");
            }

        }while(!condicao);
        return a;
    }
}