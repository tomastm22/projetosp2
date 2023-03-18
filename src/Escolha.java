// 1º Criei a Classe Escolha com os atributos texto e proximo.
// 2º Alterei o método construtor da Classe para receber como parâmetros
//    o texto da escolha e o capítulo para onde ela leva.

public class Escolha {
    
    String texto;
    Capitulo proximo;

    Escolha(String texto,Capitulo proximo)
    {
        this.texto   = texto;
        this.proximo = proximo;
    };
}
