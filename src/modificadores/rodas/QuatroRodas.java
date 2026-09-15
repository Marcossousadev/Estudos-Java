package modificadores.rodas;

import modificadores.Carro;

public class QuatroRodas {
    public QuatroRodas() {
        Carro meuCarro = new Carro("Sandero");
        meuCarro.acelerar(); // consigo acessar, pois é um método público
        // meuCarro.buzinar(); não consigo acessar, pois não faz parte do mesmo pacote, é um sub-pacote, ela está definida como protected
    }

}
