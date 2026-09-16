package tratamento_de_exceções;

import modificadores.Carro;

// oq é tratamento de exceções
// quando falamos em exceções, estamos falando sobre um evento que acontece durante a execução do nosso programa
// que vai interromper o fluxo normal de execução do nosso programa
// normalmente essa execeção é relacionada a um erro, seja um erro de manipulação ou operações que a gente realizou
// ou de bibliotecas externas que a gente pode tá utlizando
// no java temos um mecanismo de como tratar essas exceções, pra gente capturar elas e conseguir dar um tratamento
// adequado para aquele erro
// essas exceções podem ser causadas por vários motivos
// um exemplo mais comum
// uma divisão por 0, não é algo permitido no java, algo que não tem suporte, 1/0 ou 100/0
// outro exemplo de erro bem comum
// Null Pointer Exception, quando tentamos manipular objetos que tá null, objeto ou atributo nulo
// quando vamos tentar ler um arquivo da nossa máquina e não encontramos esse arquivo ou arquivo tá corrompido
// outro exemplo de uma exceção, quando a gente tenta acessar um index de um array q tá fora dos limites do Array
// exemplo: int[] valores = { 1, 2 ,3 };
// valores[3]; vai dar erro, pois nosso limite é apenas 0, 1, 2 indexs, pois é maior q o número do array
// Array index out of bouns
public class TratamentoExcecoes {
    public static void main(String[] args ) {
        Carro meuCarroFurrado = null;
      try {
          meuCarroFurrado.acelerar();
      }
      catch(NullPointerException exception) {
        System.out.println("Vender carro furado");
      }
    }
}
