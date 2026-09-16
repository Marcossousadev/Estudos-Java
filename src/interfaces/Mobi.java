package interfaces;

public class Mobi implements Carroo {

    @Override  // usa-se esse Override para sobescrever oq vem da minha interface
    public void acelerar(){
        System.out.println("Acelerando a 30km");
    }
    @Override
    public void freiar(){
        System.out.println("Freiando.");

    }
    @Override
    public void parar() {
        System.out.println("Parando.");
    }
}
