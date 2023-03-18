/////////////////////////////////////////////////////////////////////Classe Capitulo

// Importei a biblioteca java...

import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    
    // Atributos da Classe Capitulo

    String nome;
    String[] textos;
    ArrayList<Escolha> escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    // Metodo construtor da Classe

    Capitulo(
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
        this.escolhas           = new ArrayList<Escolha>();
    }

    // Metodos para mostrar o conteudo dos capitulos

    void mostrar()
    {
        System.out.println(this.nome);

        for (String texto : textos) 
        {
            System.out.println(texto);
        }

        if (this.escolhas.size() != 0) 
        {
            for (Escolha escolha : escolhas)
            {
                System.out.println(" - " + escolha.texto);
            }
            System.out.println();

            //int idEscolha = escolher();
            //this.escolhas.get(idEscolha).proximo.mostrar();

        } 
        else 
        {
            System.out.println("[ Esse Capítulo não possui escolhas. ");
        } 

        
        if (this.personagem != null) 
        {
            this.personagem.ferimento(alteracaoEnergia);        
            this.personagem.status();
            //System.out.println("[ O personagem perdeu "+this.alteracaoEnergia+" pontos de energia nessa parte. ");
        } 
        else 
        {
            System.out.println("[ Esse Capítulo não possui personagem. ");
        }
        System.out.println();

        if (this.escolhas.size() != 0) 
        {

            int idEscolha = escolher();
            this.escolhas.get(idEscolha).proximo.mostrar();
        }
    }

    
    //Construtor sem parametros

    Capitulo(){

    }
    
    // Metodo para pegar a escolha do usuario, o metodo fica em loop até receber uma escolha válida

    int escolher()
    {

       int idEscolha = -1;
       String escolhaDigitada;

        
            if (this.escolhas != null)
            {
                while (idEscolha == -1) 
                {
             
                    System.out.println("[ Digite sua escolha: ]");
                    escolhaDigitada = escaneador.nextLine();

                    for (int i = 0; i < escolhas.size(); i++) 
                    {
                        if (escolhaDigitada.equals(escolhas.get(i).texto)) 
                        {
                            idEscolha = i;
                        }
                    }
                    
                    

                }
            }
        
        System.out.println();
        return idEscolha;

    }


}
