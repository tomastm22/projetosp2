// 1º Criei a Classe Escolha com os atributos texto e proximo.
// 2º Alterei o método construtor da Classe para receber como parâmetros
//    o texto da escolha e o capítulo para onde ela leva.
// Deixei todos os Atributos da Classe Privados

public class Escolha {
    
    private String texto;
    private Capitulo proximo;

    public Escolha(String texto,Capitulo proximo)
    {
        this.texto   = texto;
        this.proximo = proximo;
    };

    public String getTexto(){
        return this.texto;
    }

    public Capitulo getProximo(){
        return this.proximo;
    }
}
