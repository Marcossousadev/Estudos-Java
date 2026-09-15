package estudo_java; // não podemos usar hífen "-", underline pode "_";
// se quero dizer q essa classe tá dentro de uma pasta utils, dentro de outra pasta enums e dentro da pasta redes
// package.utils.enums.redes; para acessar sub pastas de uma pasta usamos nome_pasta.nome_pasta;

public class ModificadoresDeAcesso {
    // os modificadores de acesso são quem vão controlar a visibilidade das nossas classes e métodos no java
    // usamos os modificadores de acesso por exemplo se queremos que o método de uma classe seja visível para outras classes
    // que não pertecem ao mesmo pacote
    // ou pelas classes que pertencem ao mesmo pacote

    // os pacotes no java são usados para organizar nossas classes, interfaces em namespaces distintos para evitar conflito nos nomes
    // desses pacotes
    // os pacotes vão fazer um agrupamento lógico, dizendo que elas pertencem ao mesmo grupinho
    // os modificadores de acesso impactam em como essa classe e métodos dentro dela, são vistos pelas outras classes quem pertence ao mesmo pacote que ela


    // public => modificador de acesso => basicamente ele diz que essa classe é pública, se tiver um método com esse carinha na frente
    // ele método se torna público
    // se uma classe for public, ela é acessível de qualquer lugar, mesmo que não esteja dentro do package definido
    // agora se essa classe for default, ela é privada, acessível apenas dentro do package, quando eu não defino, exemplo: class Casa
    // se um método de uma classe for public, ele é acessível a qualquer instância dessa classe
    // agora se esse método dessa classe for private, esse método é acessível apenas nessa classe, será um método interno
    // agora se esse método for protected, esse método será visível dentro da própria classe e das subclasses do mesmo arquivo,
    // e dentro de classes que estão dentro do mesmo pacote, acessível por todo mundo que está dentro do mesmo pacote

    public static void main(String[] args) {
        Animal animal1 = new Animal("Cachorro", false); // Animal também  é um tipo, só que não um tipo primitivo
        Animal animal2 = new Animal("Gato", true);
        animal1.comer();
        animal1.ele_pode_comer(); // se ele poder comer
        animal2.ele_pode_comer(); // se ele poder comer
        String som = animal2.som();
        System.out.println(som);
    }
}
