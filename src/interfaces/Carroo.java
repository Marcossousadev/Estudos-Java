package interfaces;
// a interface define um contrato que a classe deve seguir
// quais atributos
// quais métodos essa classe vai ter
// escrevendo primeiro uma casquinha
// dps essa interface vai ser implementada pela classe
// essa classe vai ter que seguir o padrão estabelecido na interface
// interface não pode ter implementação, apenas assinatura

// as interfaces são é um contrato que define um comportamento comum para um tipo de objeto
// uma interface não pode ser instânciada, pq ela é algo oco, vazio, ela apenas defini o contrato, ela não tem implementação
public interface Carroo {
    void acelerar();  // fizemos a assinatura do método, em nenhum momento eu disse oq esse métodom faz, apenas assinei
    void freiar();    // não implementamos o método de fato
    void parar();
}

// uma interface ela defini um contrato no qual uma classe deve seguir