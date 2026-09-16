package classes_abstratas;
// uma classe abstrata não pode ser instânciada
// A diferença de uma classe abstrata para uma interface, é que na interface não podemos implementar, já na classe abstrata sim
public abstract class SerVivo {
    public String nome;

    public SerVivo(String nome){
        this.nome = nome;
    }
    public abstract void respirar();  // método sem implementação
// para criar um método sem implementação dentro de uma classe abstrata, definimos a ele abstract ex: public abstract pular();

    // posso definir métodos que tem implementação
    public void dormir() {
        System.out.println("dormindo...");
    }
}
