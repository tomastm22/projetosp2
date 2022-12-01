import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Olá estrangeiro, me chamo Kairos, serei seu guia nessa jornada pelas terras de Ascalom. Como você se chama?");
        
        Scanner read = new Scanner(System.in);
        String nome = read.nextLine();

        System.out.println("É um praser te conhecer "+nome+". Vamos iniciar nossa aventura!");

        System.out.println("Temos agora a nossa frente dois caminhos possiveis. Pela direita A Floresta dos Susurros. Pela esquerda O Vale das Emboscadas.");
        System.out.println("Para qual direção você deseja seguir? (direita ou esquerda)");

        String dir_certa = "direita";

        Scanner read1 = new Scanner(System.in);
        String direcao = read1.nextLine();

        if (dir_certa.equals(direcao) == true) 
        {
            System.out.println("Entrando na floresta....");
            System.out.println("Kairos: Nossa! Que lugar sombrio! Vamos andar o mais rápido possivel "+nome+".");
            System.out.println("Kairos: Parabéns "+nome+". Você conseguiu sobreviver Á Floresta do Sussuro(e eu também kkk (: )!).");
            System.out.println("Agora vamos para a proxíma etapa...");
            
            System.out.println("Kairos: A sua frente temos dois caminhos, a direita, O Monte Ascalom, e a esquerda, A Torre da Subida Eterna. Para qual direção você vai?(direita ou esquerda) "); 
            
            Scanner read2 = new Scanner(System.in);
            String direcao1 = read2.nextLine();

            String dir_certa1 = "esquerda";

            if (dir_certa1.equals(direcao1) == true)
            {
                System.out.println("Kairos: Nossa! Que monte alto e ingrime né "+nome+". Mas nós vamos conseguir!");
                System.out.println("PARABÉNS! Você e Kairos conseguiram subir o monte e lá em cima encomtraram o portal que leva devolta ao mmundo real.");
                System.out.println("Kairos: Foi um prazer ter você "+nome+" nas terras de Ascalom. Até a proxima aventura!");
                System.out.println("FIM DA HISTÓRIA");
            }

            else
            {
                System.out.println("Kairos: Nossa, que torre alta! Mas, nada de medo, kkk,, vamos subir!!!");
                System.out.println("Você e Kairos estão subindo a torre quando de repente...");
                System.out.println("Kairos e você: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Vocês cairam em uma das armadilhas escondidas na torre, um burado de profundezas incalculaveis! Vocês cairam Eternamente.....");
                System.out.println("FIM DA HISTÓRIA");
            }

        }

        else
        {
            System.out.println("Entrando no Vale....");
            System.out.println("Kairos: Nossa! Que vale deserto! Mas, pelo menos, não tem nada de assustador kkkkk");
            System.out.println("Kairos: Essa não! Olha "+nome+". São povos Barbaros! Se nos pegarem eles vão acabar conosco! CORRE!!!!!");
            System.out.println("Infelismente você e Kairos não conseguiram escapar dos povos Barbaros. Ironicamente vocês cairam numa Emboscada.");
            System.out.println("FIM DA HISTÓRIA");
        }

    }
}
