package estudo_casting;

public class NewCasting {
    // revisão casting
    public static void main (String[] args) {
        // usamos casting para transformar dados em outros tipos de dados

        // transformando um número decimal em inteiro
        double numero_decimal = 10.9;
        int numero_inteiro = (int) numero_decimal; // casting explícito (int)
        System.out.println(numero_inteiro);

        // tranformando um número inteiro em decimal
        int numero_inteiroo = 10;
        double numero_decimaldb = numero_inteiroo; // não é necessário (double), pois é um casting implícito
        System.out.println(numero_decimaldb);

        // transformando uma string em inteiro
        String numero_string = "10";
        int string_to_number = Integer.parseInt(numero_string); // casting usando uma classe utilitária, método
        System.out.println(string_to_number);

        // transformando inteiro em uma string
        int inteiro_str = 10;
        String inteiro_to_string = String.valueOf(inteiro_str); // casting usando classe utilitária, método
        System.out.println(inteiro_to_string);
    }
}
