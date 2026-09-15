package como_criar_variaveis;

public class Variables {
    // como declarar variaveis no java
    public static void main (String[] args) {
        // espaço na memória do computador, onde a gente pode armazenar valores

        // #1 forma de declarar variáveis no java
        // usando tipo + nome_da_variavel + valor
        // tipo nome_variavel = valor;
        int minhaIdade = 18; // número que não contém valores decimais, vírgulas

        minhaIdade = 19;

        String meuNome = "marcos";

        // meuNome = 5;
        // erro o java é fortemente tipado, declarei string, essa variável só aceitara string

        // tipo nomeVariavel = valor;

        // #2 forma de declarar variaveis no java

        // var nome_variavel = valor;
        // dessa forma o java já inferi o tipo dessa variável,
        // sem a necessidade de eu mesmo declarar o tipo

        // tipa automaticamente como string
         var nome_variavel = "marcos";

        // nome_variavel = 5;
        // erro, pois essa variavel é do tipo string, e o java é fortemente tipado

        System.out.println("minha idade:" + minhaIdade);
        System.out.println("meu nome:" + meuNome);
    }

}
