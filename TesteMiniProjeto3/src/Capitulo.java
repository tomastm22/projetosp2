// Importei a biblioteca java...

import java.util.Scanner;

public class Capitulo {
    
    // Atributos da Classe Capitulo

    String nome, texto, escolha1, escolha2;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    // Metodo construtor da Classe

    Capitulo(
        String nome,
        String texto,
        String escolha1,
        String escolha2,
        Personagem personagem,
        int    alteracaoEnergia,
        Scanner escaneador)
    {
        this.nome               = nome;
        this.texto              = texto;
        this.escolha1           = escolha1;
        this.escolha2           = escolha2;
        this.personagem         = personagem;
        this.alteracaoEnergia   = alteracaoEnergia;
        this.escaneador         = escaneador;
    }

    // Metodos para mostrar o conteudo dos capitulos

    void mostrar()
    {
        System.out.println(this.nome);            
        System.out.println(this.texto);           
        System.out.println("- "+this.escolha1);        
        System.out.println("- "+this.escolha2);
        this.personagem.ferimento(alteracaoEnergia);        
        this.personagem.status();
        System.out.println("O personagem perdeu "+this.alteracaoEnergia+" pontos de energia nessa parte.");
    }

    // Metodo mostrar para capitulos que só possuem Nome e Texto

    void mostrarNomeTexto()
    {
        System.out.println(this.nome);            
        System.out.println(this.texto);           
    }

    // Metodo mostrar para capitulos que só possuem Nome, Texto e Escolhas


    void mostrarNomeTextoEscolha()
    {
        System.out.println(this.nome);            
        System.out.println(this.texto);
        System.out.println("- "+this.escolha1);
        System.out.println("- "+this.escolha2);                
    }

    //Construtor sem parametros

    Capitulo(){

    }
    
    // Metodo para pegar a escolha do usuario, o metodo fica em loop até receber uma escolha válida

    int escolher()
    {

       int escolha = -1;
       String escolhaDigitada;

       System.out.println("Digite uma escolha válida duas veses seguidas: "+this.escolha1+" ou "+this.escolha2);
       System.out.println("Digite uma vez e tecle Enter e digite pela segunda vez e tecle enter.");

        
            
            while (escolha == -1) 
            {
             

            escolhaDigitada = escaneador.nextLine();

            
            if (escolhaDigitada.equals(escolha1)) 
            {
                escolha = 1;
            } 
            else if(escolhaDigitada.equals(escolha2))
            {
                escolha = 2;
            }
            
            }
        
        

        return escolha;

    }


}
