package estudo_java;


// se não passarmos o modificador de acessp public
// o java aplica o default para a classe
// ou seja, ela é package Private
// todo mundo que tiver dentro do pacote dessa classe, vai conseguir acessar essa classe, menos quem tá fora desse pacote

public class Animal {
    // o que é um constructor?
    // é um método especial de uma classe, pois ele será chamado toda vez quando um objeto dessa classe for criado
    String name;
    Boolean comer;
    public Animal(String name, Boolean comer) {
        this.name = name; // o this é pq eu estou acessando a instância dessa classe
        this.comer = comer;
    }
    // método que não retorna nada, usamos void
    protected void comer() {  // todo método precisa ter () para indicar que é um método
        System.out.println("Comerrr");
    }
    // protected, visivel dentro da propria classe e da propria subclasses do mesmo arquivo, e dentro das classes que tão dentro do mesmo pacote!
    protected void ele_pode_comer() {
        if(this.comer) {
            comer();
        }
        else {
            System.out.println("Ele não pode comer");
        }
    }

    public String som() {
        return "Depende do animal o som!";
    }
}