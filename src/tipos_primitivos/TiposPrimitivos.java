package tipos_primitivos;

// quais os tipos primitivos no java
public class TiposPrimitivos {

    public static void main (String[] args){
       // numero inteiros = 100, 255, 20027, números que não possum vírgula, casa decimal, 1, 92394929
        // dentro do java existe várias formas de declarar um número inteiro
        // os mais usados são int e long
        // um exemplo, para um  id gigante usamos long
        // byte => 8 bits na memória => -128 ao 127
        // byte minhaVar = 255; erro, pq o byte só vai até 127
        // byte minhaVar2 = -129; erro, pois o byte só vai até -128
         byte minhaVar3 = -128;
         byte minhaVar4 = 127;

        // short => 16 bits na memória => -32.768 a 32.767
        // short meuSalario = 33744; erro, pois o short vai até 32.767
        // short meuSalario2 = -32769; // erro, pois o short vai até -32768
         short meuSalario3 = 32767;
         short meuSalario4 = -32768;

       //  it => 32 bits => - 2.147.483.648 a 2.147.483.647
       // dois bilhões, cento e quarenta e sete milhões, quatrocentos e oitenta e três mil, seiscentos e quarenta e oito.
        // - dois bilhões, cento e quarenta e sete milhões, quatrocentos e oitenta e três mil, seiscentos e quarenta e sete.
       //  int meusBilhoes = 2147483648; // erro, pois o int só vai até 2.147.483.647;
       //  int meuBilhoes2 = - 2147483649;  // erro, pois o int só vai até - 2.147.483.648;
        int meusBilhoes3 =  2147483647;
        int meusBilhoes4 =  - 2147483648;

        // long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // -9.223.372.036.854.775.808 → menos 9 quintilhões, 223 quatrilhões, 372 trilhões, 36 bilhões, 854 milhões, 775 mil e 808
        // 9.223.372.036.854.775.807 → 9 quintilhões, 223 quatrilhões, 372 trilhões, 36 bilhões, 854 milhões, 775 mil e 807
        long valor = -9223372036854775808L; // temos q atribuir um L ao final, para o java entender que é um long
        // pois se não, o java entende que é um inteiro, sendo um inteiro, esse valor ultrapassa a faixa


        // números decimais = 1.2, 3.4, 5.6, 7.8, 9.0
        // na maioria dos casos, usamos double, já que tem uma precisão maior de casas decimais
        // caso haja uma restrição de memória, usamos float
        // usamos float ou double
        // 5.50

       // float => 32 bits => precisão simples => 123.14, 39.23
        // o float nós fornece poucos números dps da vírgula
        float valor_numero = 39.23f; // temos que adicionar um f ao final, para o java entender que se trata
        // de um float
        float numero_1 = 134.99f;

        // se for um número decimal que usa mais de duas casas decimais, use double, pois ele é precisão dupla
        // double => 64 bits => precisão dupla
        double numero_2 = 134.9988;

        // dados textuais
        // para textos, usamos String, representar palavras e frases

        // char => representa um único caractere, exemplo o "a";
        // para usar char, devemos sempre usar aspas simples
        char primeira_letra_nome_usuario = 'a';
        char ultima_letra_nome_usuario = 's';
        // char letra = "b"; // erro, pois o valor sempre deve estar entre aspas simples
        // char meuChar = 'marcos'; erro, não consigo colocar uma frase no char, pois ele aceita apenas um caractere
        // length == 1;
        // é um adendo, a String no java é uma classe do java, não um tipo primitivo
        String minha_frase = "Eu amo minha namorada";
        String minha_vida = "Gisele";

        // diferença do char para String, o char é declarado o valor entre aspas simples, já a String
        // entre aspas duplas


        // tipo de dado lógico
        // boolean => true ou false, verdadeiro ou falso;
        boolean amo_minha_namorada = true;



    }
}