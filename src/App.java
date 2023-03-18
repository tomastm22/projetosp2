
/*Implementar depois...
 * // Variavel para entra o nome do usuario.

        //String nomeUsuario;
        //nomeUsuario = "";

        // Logo apos criar o Cap.INI. eu mostro o Cap. e chamo e Escaner para pegar o nome do usuario.
                                            //---------------------------------------------------------------
        Capitulo INICIO = new Capitulo(
                                "-----------------------INICIO-----------------------",
                                      new String[]
                                     {"| Olá estrangeiro. Bem-vindo As Terras de Ascalom. |"
                                     ,"| Como você se chama? [Digite seu nome abaixo.]    |",
                                      "----------------------------------------------------"},
                                      null,
                                      0,
                                      escaneador);
        
        //INICIO.mostrar();

        //nomeUsuario = escaneador.nextLine();

        Capitulo INTRODUCAO = new Capitulo(
                                     "-----------------------------CAPÍTULO INTRODUTORIO-----------------------------",
                              new String[]{"| Prazer! " /*  + nomeUsuario +*//*  + ". Vamos iniciar nossa aventura.                     |",  
                              "| Você terar duas opções de personagens para seguir: Lucas e Mia.             |",
                              "| Seu objetivo é chegar até o fim dessa aventura com seu personagem vivo,     |",
                              "| ou seja, não deixar que os pontos de energia do personagem chegem a 0(zero).|",
                              "| Boa Sorte.                                                                  |",
                              "-------------------------------------------------------------------------------"},
                           null,
                           0,
                           escaneador);

//INTRODUCAO.mostrar();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */










////////////////////////////////////////////////////////////////////////////Codigo Principal




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

      // Criando os personagens.

        Personagem Lucas = new Personagem("Lucas",100);
        Personagem Mia = new Personagem("Mia",100);

      // Criando Escaner

        Scanner escaneador = new Scanner(System.in);


      // Criação os Capítulos.
      // Todos os capítulos forão criados sem informar as escolhas no primeiro momento.


        Capitulo PARTE_1 = new Capitulo(
                                  "--------------------------------------------PARTE 1--------------------------------------------",
                           new String[]{"| A sua frente existem dois caminhos possiveis.                                               |",
                                        "| Lucas vai pela Floresta dos Susurros. Mia vai pelo Vale das Emboscadas.                     |",
                                        "-----------------------------------------------------------------------------------------------",
                                        " ",
                                        " - Qua personagem você deseja seguir?                                                          "}, 
                                        null,
                                        0,
                                        escaneador);
        
        Capitulo PARTE_2 = new Capitulo(
                                  "--------------------------------------------PARTE 2--------------------------------------------",
                           new String[]{"| [Lucas esta entrando na floresta.... ]                                                      |", 
                                        "| Lucas: Nossa! Que lugar sombrio! Vamos andar o mais rápido possivel                         |", 
                                        "| Essa não! Um animal feroz deseja nos comer! CORRE!!!!!!!!!!                                 |",
                                        "| [O animal feroz consegue alcançar Lucas e o ataca.                                          |", 
                                        "| Lucas, porém, consegue se livrar do animal.                                                 |", 
                                        "| Entretanto, ele sofreu alguns ferimentos nessa luta,                                        |", 
                                        "| oque consumiu uma parte dos seus pontos de energia.]                                        |", 
                                        "| Lucas: A sua frente temos dois caminhos, a direita, O Monte Ascalom ,                       |", 
                                        "| e a esquerda, A Torre da Subida Eterna.                                                     |",
                                        "-----------------------------------------------------------------------------------------------",
                                        " ", 
                                        " - Para qual direção você deseja seguir?(direita ou esquerda)                                  "},
                                        Lucas,
                                        50,
                                        escaneador);
        
        Capitulo PARTE_3 = new Capitulo(
                                  "--------------------------------------------PARTE 3--------------------------------------------",
                           new String[]{"| Entrando no Vale....                                                                        |",
                                        "| Mia: Nossa! Que vale deserto! Mas, pelo menos, não tem nada de assustador!                  |",
                                        "| Essa não! Olha " /*  + nomeUsuario +*/ + ". São povos Barbaros!                                       |",
                                        "| Se nos pegarem eles vão acabar conosco! CORRE!!!!!                                          |",
                                        "| Mia conseguiu escapar dos povos Barbaros, porem, sofreu graves ferimentos!                  |",
                                        "| Proxima Etapa...                                                                            |",
                                        "| Escapando dos Povos Barbaros, Mia tem a sua frente dois possiveis caminhos:                 |",
                                        "| pela direita segue (O Rio das Lamentações),                                                 |",
                                        "| pela esquerda (A Cachoeira das Quedas.)                                                     |",
                                        "-----------------------------------------------------------------------------------------------",
                                        " - Qual caminho você deseja seguir? (direita ou esquerda)                                      "},
                                        Mia,
                                        50,
                                        escaneador);
        
        Capitulo PARTE_4 = new Capitulo(
                                  "--------------------------------------------PARTE 4--------------------------------------------",
                           new String[]{"| [Lucas: Nossa! Que monte alto e ingrime né " /*  + nomeUsuario +*/ + ". Mas nós vamos conseguir!]    |",
                                        "| Lucas escala o monte Ascalom. Porém, por ser muito ingrime sua mão escorrega e ele cai.    |",
                                        "| Mas derepente Lucas saca seu gancho de escalada e consegue se empidurar no monte!          |",
                                        "| Porém sofreu varios arranhoes e cortes nessa pequena queda!                                |",
                                        "| [Lucas: UFA! Foi por pouco.]                                                               |",
                                        "| Porém, mesmo ferido, Lucas conseguiu subir o monte encontrando ali um portal,              |", 
                                        "| que o teletransporta para um lugar distante finalizando a história                         |",
                                        "----------------------------------------FIM DA HISTÓRIA----------------------------------------",
                                        "--------------------------------------------FINAL 2--------------------------------------------"},
                                        Lucas,
                                        20,
                                        escaneador);
        
        Capitulo PARTE_5 = new Capitulo(
                                  "--------------------------------------------PARTE 5--------------------------------------------",
                           new String[]{"| [Lucas: Nossa, que torre alta! Mas, nada de medo, kkk,, vamos subir!!!]                    |",
                                        "| Lucas está subindo a torre quando de repente...                                            |",
                                        "| [Lucas: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]             |",
                                        "| Lucas caiu em uma das armadilhas escondidas na torre,                                      |",
                                        "| um buraco de profundezas incalculaveis! Lucas cairá Eternamente.....                       |",
                                        "----------------------------------------FIM DA HISTÓRIA----------------------------------------",
                                        "--------------------------------------------FINAL 1--------------------------------------------"},
                                        Lucas,
                                        50,
                                        escaneador);

        Capitulo PARTE_6 = new Capitulo(
                                  "--------------------------------------------PARTE 6--------------------------------------------",
                           new String[]{"| [Mia: Nossa! Que cachoeira alto e ingrime né " /*  + nomeUsuario +*/ + ". Mas nós vamos conseguir!]   |",
                                        "| Mia escala a Caichoeira. Porém, por suas rochas serem muito ingrimes e lisas,               |",
                                        "| suas maõs escorregam e ela cai, sofrendo graves ferimentos.                                 |",
                                        "----------------------------------------FIM DA HISTÓRIA----------------------------------------",
                                        "--------------------------------------------FINAL 3--------------------------------------------"},
                                        Mia,
                                        50,
                                        escaneador);

        Capitulo PARTE_7 = new Capitulo(
                                  "--------------------------------------------PARTE 7--------------------------------------------",
                           new String[]{"| Mia: Nossa, que rio longo, mas com certeza, ele vai nos levar até o nosso                   |",
                                        "| destino, vamos lá " /*  + nomeUsuario +*/ + " .                                                       |",
                                        "| Mia navega no Rio das Lamentações, sofre algumas turbulencias devido a                      |",
                                        "| algumas rochas de baixo d`água e algumas piranhas a atacam.                                 |",
                                        "| Porém Mia consegue passar pelo rio!                                                         |",
                                        "| Chegando em terra firme ela encontrando ali um portal que a teletransporta                  |",
                                        "| para um lugar distante finalizando a história                                               |",
                                        "----------------------------------------FIM DA HISTÓRIA----------------------------------------",
                                        "--------------------------------------------FINAL 4--------------------------------------------"},
                                        Mia,
                                        50,
                                        escaneador);
        

        
        // Logica do Código - Estrutura de Arvore.

        //Adicionando as escolhas aos Capítulos

        PARTE_1.escolhas.add(new Escolha("Lucas", PARTE_2));
        PARTE_1.escolhas.add(new Escolha("Mia", PARTE_3));
        PARTE_2.escolhas.add(new Escolha("direita", PARTE_5));
        PARTE_2.escolhas.add(new Escolha("esquerda", PARTE_4));
        PARTE_3.escolhas.add(new Escolha("esquerda", PARTE_6));
        PARTE_3.escolhas.add(new Escolha("direita", PARTE_7));

        //Referencio a PARTE_1 como raiz da Arvore
        Capitulo raiz = PARTE_1;
        

        //Chamo executar para o nó raiz
        raiz.executar();

        

    }
}
