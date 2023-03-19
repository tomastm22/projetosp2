/////////////////////////////////////////////////////////////////////Classe Capitulo

// Importei a biblioteca java...

import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    
    // Atributos da Classe Capitulo
    // 3º O Array de escolhas foi transformado em um ArrayList de escolhas
    // Deixei todos os Atributos da Classe Privados

    private String nome;
    private String[] textos;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    // Metodo construtor da Classe
    // 4º Nesse mini-projeto o construtor da classe Capitulo não recebe mais as escolhas como parâmetros
    //    (Elas vão ser associadas aos capítos posteriormente.)


    public Capitulo(
        String nome,
        String[] textos,
        Personagem personagem,
        int    alteracaoEnergia,
        Scanner escaneador)
    {
        this.nome               = nome;
        this.textos             = textos;
        this.personagem         = personagem;
        this.alteracaoEnergia   = alteracaoEnergia;
        this.escaneador         = escaneador;
        this.escolhas           = new ArrayList<Escolha>(); //Inicializei o ArreyList
    }

    // Método para adicionar escolhas no ArrayList

    public void adicionarEscolha(Escolha escolha){
        this.escolhas.add(escolha);
    }

    // 5º Metodos para mostrar o conteudo dos capitulos

    private void mostrar()
    {
        //Mostra o nome do Cap.

        System.out.println(this.nome);

        //Mostra os textos do Cap.

        for (String texto : textos) 
        {
            System.out.println(texto);
        }

        //Mostra as escolhas do Cap.
        //Se o tamanho do ArreyList for diferente de 0 vão se mostradas as escolhas do cap.
        
        if (this.escolhas.size() != 0) 
        {
            for (Escolha escolha : escolhas)
            {
                System.out.println(" - " + escolha.getTexto());
            }
            System.out.println();
        } 
        
        //Se não aparecerar a seguinte mensagem para o usuario. 
        else 
        {
            System.out.println("[ Esse Capítulo não possui escolhas. ");
        } 

        //Mostra o personagem e sua alteração de energia no Cap.

        if (this.personagem != null) 
        {
            this.personagem.ferimento(alteracaoEnergia);        
            this.personagem.status();
        } 
        else 
        {
            System.out.println("[ Esse Capítulo não possui personagem. ");
        }
        System.out.println();
        
        /*6º Se o tamanho do ArreyList for diferente de 0 
          vai ser chamado o método escolher() e o retorno
          dele sera atribuido a variavel idEscolha.
          Após isso.. */

        if (this.escolhas.size() != 0) 
        {

            int idEscolha = escolher();
            this.escolhas.get(idEscolha).getProximo().mostrar();
        }
    }

    
    //Construtor sem parametros

    private Capitulo(){

    }
    
    // Metodo para pegar a escolha do usuario, o metodo fica em loop até receber uma escolha válida
    
    /*  7º Devido a alteração do Arrey para um ArreyList 
        de escolhas foram alterados o acesso ao tamanho e a posição do ArreyList.*/

    private int escolher()
    {

       int idEscolha = -1;
       String escolhaDigitada;

        
            if (this.escolhas != null)
            {
                while (idEscolha == -1) 
                {
             
                    System.out.println("[ Digite sua escolha: ]");
                    escolhaDigitada = escaneador.nextLine();

                    //escolhas.size(); - Acesso ao tamanho do ArreyList
                    for (int i = 0; i < escolhas.size(); i++) 
                    {
                        //escolhas.get(i).texto - Acesso a posição do ArreyList
                        if (escolhaDigitada.equals(escolhas.get(i).getTexto())) 
                        {
                            idEscolha = i;
                        }
                    }
                    
                    

                }
            }
        
        System.out.println();
        return idEscolha;

    }

    // 8º Método executar chama o método mostrar.
    public void executar(){
        mostrar();
    }
}
