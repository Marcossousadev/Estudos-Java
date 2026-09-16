package interfaces;

// uma interface é um contrato no qual a classe deve seguir
// apenas uma assinatura, nada de implementação
// definir metódos, comportamento da classe
// as interfaces são um tipo de contrato, que vão definir um comportamento comum para um tipo de objeto
public interface Jogador {
    void jogar(); // não falamos nadad que esse método faz, apenas assinamos
    void parar_de_jogar();
}
