import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Avatar Lucas = new Avatar("Lucas",100);
        Avatar Mia = new Avatar("Mia",100);
        
        

        // Inicio da História e Recebe o nome do Usuário

        System.out.println("Olá estrangeiro. Bem-vindo As Terras de Ascalom. Como você se chama?");

        Scanner read = new Scanner(System.in);
        String nome = read.nextLine();

        // O nome do usuário vai está concatenado em alguns trechos da história.

        System.out.println("Prazer "+nome+". Vamos iniciar nossa aventura. Você terar duas opções de personagens para seguir: O Lucas e A Mia. Seu objetivo é chegar até o fim dessa aventura com seu personagem vivo, ou seja, não deixar que os pontos de energia do personagem chegem a 0(zero). Boa Sorte.");

        

        // Inicio da história. Usuário tem duas escolhas: direita ou esquerda
        // PARTE 1
        System.out.println("PARTE 1");
        System.out.println("A sua frente existem dois caminhos possiveis. Lucas vai pela Floresta dos Susurros. Mia vai pelo Vale das Emboscadas.");
        System.out.println("Qua personagem você deseja seguir? (Lucas ou Mia)");

        // Declaração de variavel "direção certa"; Recebe a escolha do Usu; Se "d_c" for verdadeiro a historia continua, se não chega ao primeiro fim

        String escolha_1 = "Lucas";

        Scanner read1 = new Scanner(System.in);
        String escolha_usu = read1.nextLine();

        if (escolha_1.equals(escolha_usu) == true) 
        {   
            // PARTE 2

            System.out.println("PARTE 2");
            System.out.println("Lucas esta entrando na floresta....");
            System.out.println("Lucas: Nossa! Que lugar sombrio! Vamos andar o mais rápido possivel "+nome+".");
            System.out.println("Lucas: Essa não! Um animal feroz deseja nos comer! CORRE!!!!!!!!!!");
            System.out.println("O animal feroz consegue alcançar Lucas e o ataca. Lucas, porém, consegue se livrar do animal. Entretanto, ele sofreu alguns ferimentos nessa luta, oque consumiu uma parte dos seus pontos de energia.");
           // System.out.println("Lucas perdeu 50 pontos de energia.");
            System.out.println("Lucas, mesmo com alguns ferimento, conseguiu atravessar A Floresta dos Susurros ");
            System.out.println("Vamos para a próxima parte...");

            Lucas.ferimento(50);
            Lucas.status();

            
            
            
            // Proxima escolha; Declarei dir_cer como esquerda; Se o usu digitar esquerda vai pra P4, se não, P5

            System.out.println("Lucas: A sua frente temos dois caminhos, a direita, O Monte Ascalom, e a esquerda, A Torre da Subida Eterna. Para qual direção você deseja seguir?(direita ou esquerda) "); 
            
            Scanner read2 = new Scanner(System.in);
            String direcao1 = read2.nextLine();

            String dir_certa1 = "esquerda";

            if (dir_certa1.equals(direcao1) == true)
            {   
                // PARTE 4
                //FINAL 3
                System.out.println("PARTE 4");
                System.out.println("Lucas: Nossa! Que monte alto e ingrime né "+nome+". Mas nós vamos conseguir!");
                System.out.println("Lucas escala o monte Ascalom. Porém, por ser muito ingrime sua mão escorrega e ele cai. Mas derepente Lucas saca seu gancho de escalada e consegue se empidurar no monte! Porém sofreu varios arranhoes e cortes nessa pequena queda!");
                System.out.println("Lucas: UFA! Foi por pouco.");
                //System.out.println("Lucas perdeu 20 pontos de energia.");
                
                Lucas.ferimento(20);
                Lucas.status();
                
                System.out.println("Porém, mesmo ferido, Lucas conseguiu subir o monte encontrando ali um portal que o teletransporta para um lugar distante finalizando a história");
                System.out.println("FIM DA HISTÓRIA");
                System.out.println("FINAL 3");
            }

            
            else
            {
                // PARTE 5
                //FINAL 2
                System.out.println("PARTE 5");
                System.out.println("Lucas: Nossa, que torre alta! Mas, nada de medo, kkk,, vamos subir!!!");
                System.out.println("Lucas está subindo a torre quando de repente...");
                System.out.println("Lucas: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Lucas caiu em uma das armadilhas escondidas na torre, um buraco de profundezas incalculaveis! Lucas cairá Eternamente.....");
               // System.out.println("Lucas perdeu 50 pontos de energia");
                
                Lucas.ferimento(50);
                Lucas.status();
                
                System.out.println("FIM DA HISTÓRIA");
                System.out.println("FINAL 2");
            }

        }

        
        else
        {
            // PARTE 3
            //FINAL 1
            
            System.out.println("PARTE 3");
            System.out.println("Entrando no Vale....");
            System.out.println("Kairos: Nossa! Que vale deserto! Mas, pelo menos, não tem nada de assustador kkkkk");
            System.out.println("Kairos: Essa não! Olha "+nome+". São povos Barbaros! Se nos pegarem eles vão acabar conosco! CORRE!!!!!");
            System.out.println("Infelismente você e Kairos não conseguiram escapar dos povos Barbaros. Ironicamente vocês cairam numa Emboscada.");
            System.out.println("FIM DA HISTÓRIA");
            System.out.println("FINAL 1");
        }

    }
}
