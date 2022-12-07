public class Avatar {
    
    String nome;
    int energia;

    void status() {

        System.out.println("Avatar: " + this.nome);
        System.out.println("Pontos de Energia: " + this.energia);
        
        if(this.energia == 0)
        {
            System.out.println("LUCAS MORREU!");
        }

    }

    Avatar(String nome, int energia)
    {
        this.nome = nome;
        this.energia = energia;
    }

    Avatar()
    {

    }

    void ferimento(int qt_pontos)
    {

        this.energia = this.energia - qt_pontos;

        System.out.println(this.nome + " perdeu " + qt_pontos + " pontos de energia!");

    }

}
