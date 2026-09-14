public class ReviaoTipos {
    public static void main( String[] args ) {
        //revisão tipos primitivos
        // números inteiros
        // byte, short, int, long]
        // os mais usados são long e int
        // byte
        // 8 bits => -128 a 127
        byte valor = -128;
        byte valor2 = 127;

        // short
        // 16 bits => -32.768 a 32.767
        short valor3 = -32768;
        short valor4 = 32767;

        // int
        // 32 bits => - 2.147.483.648 a 2.147.483.647
        int valor5 = - 2147483648;
        int valor6 =   2147483647;

        // long
        // 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long valor7 = -9223372036854775808L;
        long valor8 = 9223372036854775807L;


        // tipos de número decimal
        // float and double

        // precisão simples, 32 bits
        // o float nós fornece poucos números dps da
        // usamos float para números de 6 a 7 dígitos de precisão
        float valor9 =  32.5f;
        // precisão dupla, 64 bits
        // o double nós fornece mais números dps da vírgula
        // usamos double para números de 15 a 16 dígitos de precisão
        double valor10 = 32.67;

        // dados de texto
        // char, unico caractere, seu valor deve estar entre ''
        char letra = 'A';

        // palavras e frases use String
        String palavra = "Minha casa";

        // dados lógicos
        // boolean => true or false
        boolean isBool = true;
    }
}
