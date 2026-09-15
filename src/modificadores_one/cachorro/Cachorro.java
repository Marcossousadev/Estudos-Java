package modificadores_one.cachorro;

import modificadores_one.Animal;

// se não passarmos o modificador de acessp public
// o java aplica o default para a classe
// ou seja, ela é package Private
// todo mundo que tiver dentro do pacote dessa classe, vai conseguir acessar essa classe, menos quem tá fora desse pacote

public class Cachorro {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Cachorro", false);
       // cachorro.comer();
    }
}
