public class Personagem {
    
    //Atributos dos persornagens(Personages)

    String nome;
    int energia;

    //Método que mostra o nome e a quantidade de pontos atual do personagem. 
    //Se a quantidade de pontos de energia for igual a 0, mostra que o personagem morreu.
    
    void status() {

        System.out.println("[Personagem: " + this.nome + "]");
        System.out.println("[Pontos de Energia Atual: " + this.energia + "]");
        
        if(this.energia == 0)
        {
            System.out.println(this.nome + " MORREU!");
        }

    }

    //Construtor da classe Personagem com os parametros nome e energia.

    Personagem(String nome, int energia)
    {
        this.nome = nome;
        this.energia = energia;
    }

    //Construtor sem parametros

    Personagem()
    {

    }

    // Método ferimento: subitrai da "quantidade de pontos de energia atua" a "quantidade de pontos que o personagem perdeu".

    void ferimento(int qt_pontos)
    {

        this.energia = this.energia - qt_pontos;

        System.out.println("[" + this.nome + " perdeu " + qt_pontos + " pontos de energia!]");

    }

}
