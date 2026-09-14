

public class Casting {
    // aprendendo oq é casting
    // transformando valores em outro tipo de dado
    // conversão de um tipo de dado para outro tipo
    public static void main ( String[] args ) {
      // "20, 40, 60, 23"

        // transformando um número decimal em um inteiro
        double resultado = 0.0;
        // casting explicito
        int resultadoInt = (int) resultado;

        int resultado_2 = 14;
        // casting implicito
        double resultadoDoub = resultado_2; // (double) não é preciso colocar, pois o java pro si proprio já entende que deve expandir ele mesmo

        System.out.println("Casting Int: " + resultadoInt);
        System.out.println("Casting Double: " + resultadoDoub);


        // como transformar uma string em um inteiro
        // vamos usar uma classe do Java

        String minhaString = "10";
        int meuInt2 = Integer.parseInt(minhaString);

        String minha = String.valueOf(meuInt2);

        // como fazer casting de um valor decimal para inteiro
        double meuDec = 10.99;
        int meuInt = (int) meuDec;
        System.out.println(meuInt);
        // tenho uma variavel em decimal e quero que ela vire inteiro, sem arrendodar
        // casting explícito tipo transoformada = (tipo) variavel_velha;
        double minhaDecc = 10.9;
        int meuIntt = (int) meuDec;
        // o java automaticamente rmove as casas decimais

        // como fazer o casting de um valor inteiro para decimal
        int valor_inteiro = 19;
        double valor_decimal = valor_inteiro; // 19.0
        // automaticamente o java adiciona casas decimais, sem a necessidade de um casting explicito, por isso é um casting implícito

        // algo a mais
        // arrendondar valor
        long meuArr = Math.round(meuDec);
        System.out.println(meuArr);

        // transformar uma string em valor inteiro
        String minha_numero_string = "29";
        // É preciso transformar ela para inteiro para realizar um cálculo
        // um exemplo esse número vem do banco de dados em string
        // como eu transformo?
        // Nõs devemos usar a classe utilitária Integer
        int meu_numero_inteiro = Integer.parseInt(minha_numero_string);
        System.out.println("Tranformando String em inteiro com o Integer.parseInt: " + meu_numero_inteiro);

        // outro caso
        // preciso tranformar um inteiro em string para salvar no banco de dados
        // devo usar a classe utilitária e o método String.valueOf
        int minha_idade = 18;
        // è necessário salvar a idade no banco de dados como String
        String minha_idade_banco_de_dados  = String.valueOf(minha_idade);
        System.out.println("Transformando minha idade inteiro em String com String.valueOf: " + minha_idade_banco_de_dados);
        // transformando decimal em inteiro
        float decimal_para_inteiro = 10.7f;
        int inteiro_novo = (int) decimal_para_inteiro;

        System.out.println("Transformando decimal em inteiro: " + inteiro_novo);

        int meu_inteirooo = 10;
        float meu_decimal = meu_inteirooo;

        System.out.println("Transformando inteiro em decimal: " + meu_decimal);

    }
}
