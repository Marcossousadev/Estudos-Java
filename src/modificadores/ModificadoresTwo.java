package modificadores;
// os pacotes sãu usados para organizar nossas classes e interfaces em name spaces
// name spaces específicos para evitar conflitos no nome desses pacotes
// os pacotes fazem um agrupamento lógico, dizendo que elas pertencem ao mesmo grupinho

// os modificadores de acesso impactam como essa classe e os métodos dentro dela são vistos
// pelas outras classes que pertencem ao mesmo grupo que ela
// ou ao mesmo pacote
// nomeamos package no inicio do nosso arquivo java para declara de qual pacote aquela classe é

// public -> acessível de todo lugar
// default -> quando eu não defino, ele se torna default
// private -> acessível apenas dentro da classe
// protected -> acessível dentro do package (pacote = mesma pasta) e no mesmo arquivo
public class ModificadoresTwo {

    public static void main(String[] args) {
        Carro carro = new Carro("Bmw");

        String result = carro.acelerar();
        carro.buzinar(); // consigo acesar esse método, pois estou dentro do mesmo pacote, esse método é protected
        System.out.println(result);

    }
}
