package interfaces;

public class Sandeiro implements Carroo {
    // o valor dessa variável nunca poderá ser modificado, por conta do final
    final int limiteDeVelocidade = 150;
    int velocidadeAtual = 0;
    @Override // usa esse Overrida para sobescrever o que vem da minha interface
    public void acelerar() {
        if(this.velocidadeAtual != limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando a: " + this.velocidadeAtual + " km/h");
        }
        else {
            System.out.println("Você antigiu o limite de velocidade");
        }
    }

    @Override
    public void freiar() {
        System.out.println("Freiando.");
    }

    @Override
    public void parar() {
        System.out.println("Parando.");
    }
}
