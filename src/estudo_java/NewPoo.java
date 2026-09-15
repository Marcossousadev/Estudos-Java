package estudo_java;// package util.enums.redes;
// é um paradigma que foi criado para aproximar o modo como lidamos com programas ao modo como interagimos com objetos do mundo real.
// a programação orientada a objeto é um paradigma que organiza o código de acordo com conceitos de objetos.
// na POO tudo gira em torno de classe e objeto
// onde um objeto é uma instância de uma classe, ou seja, ele herda características e comportamentos
// onde características são atributos de um objeto, exemplo a cor de um carro de um objeto Car
// já os comportamentos são métodos, por exemplo, o comportamento do carro de acelerar
// os atributos são por exemplo variáveis na programação funcional

public class NewPoo {
    public static void main( String[] args ) {
        Animal animal1 = new Animal("Cachorro", false); // Animal também  é um tipo, só que não um tipo primitivo
        Animal animal2 = new Animal("Gato", true);
        animal1.ele_pode_comer(); // chamando método comer
        animal2.ele_pode_comer(); // se ele pode comer
        String som = animal2.som();
        System.out.println(som);
    }
}


