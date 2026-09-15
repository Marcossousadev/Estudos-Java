package tipos_primitivos;

public class NewTipos {
    // revisão tipos
    public static void main( String[] args ) {
        // tipos inteiros
        // 8 bits
        byte number1 = 127;
        // 16 bits
        short number2 = 32000;
        // 32 bits
        int number3 = 2000000000;
        // 64 bits
        long number4 = 9000000000000000000L;

        // tipos decimais
        // 32 bits, precisão simples, 6 a 7
        float number5 = 10.9f;
        // 64 bits, precisão dupla, 15 a 16
        double number6 = 10.99;

        // dados textuais
        // char => armazenar apenas um valor caracterer
        char caracterer = 'A'; // o valor do char deve tá entre aspas simples

        // Usa-se aspas dupla, usada para armazenar palavras e frases
        String frase = "Minha casa";

        // dados lógicos
        // true or false
        boolean isBool = true;
    }
}
