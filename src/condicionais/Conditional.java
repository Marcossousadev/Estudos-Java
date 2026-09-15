package condicionais;

public class Conditional {
    // estudo de conditionais no Java
    public static void main( String[] args) {
        // -128 a 127
        byte b = 100;
        // 16 bits =>  -32768 a 32767
        short s = 10000;
        //  int => 32 bits => - 2.147.483.648 a 2.147.483.647, 2 trilhões e uns quebrados
        int i = 100000;
        // long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long l = 100000L;
        // float => 32 bits => precisão simples => 10.50f ou 189.22f;
        // usamos float para números de 6 a 7 dígitos de precisão
        float f = 10.5f;
        // double => 64 bits => precisão dupla => 20.5555555f;
        // usamos double para números de 15 a 16 dígitos de precisão
        // 123456.789123456;
        double d = 20.5;
        // char => único caractere entre aspas simples
        char c = 'A';
        // tipo textual para palavras e frases
        // a string do java não é um tipo primitivo,
        String str = "Marcos";
        // dado lógico, true or false
        boolean bool = false;

        // condicionais em dados lógicos
        if(bool) {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }
        // condicionais em números
        if(b > 100) {
            System.out.println("Esse número é maior que 100");
        }
        else if(b == 100){
            System.out.println("esse número é igual a 100");
        }
        else {
            System.out.println("Esse número é menor que 100");
        }

        if(s >= 10000) {
            System.out.println("S é maior ou igual a 10000");
        }
        else {
            System.out.println("S é menor que 10000");
        }

        // condicionais em strings
        if( str == "Paulo") {
            System.out.println("Esse usuários está autorizado a entrar!");
        }
        else {
            System.out.println("Esse usuário não está autorizado a entrar!");
        }

        String nome1 = new String("Marcos");
        String nome2 = new String("Marcos");

        System.out.println(nome1 == nome2); // false
        System.out.println(nome1.equals(nome2)); // true

        // comparado conteúdo de textos, se são iguais
        if(str.equals("Marccos")){
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }

        // comparando se um texto é vazio null
        if(str.isBlank()){
            System.out.println("Essa string é vazia");
        }
        else if (str == "Gisele"){
            System.out.println("Gisele");
        }
        else {
            System.out.println("Essa string não é vazia");
        }
    }
}
