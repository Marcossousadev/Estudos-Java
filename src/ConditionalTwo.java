public class ConditionalTwo {
    public static void main(String[] args) {
        byte numero = 11;
        String name = "Marcos";
        boolean isValidName;
        byte idade = 18;
        boolean hasLiscense = false;
        String documentNumber = "";
        // conditional para dado númerico
        if(numero > 10) {
            System.out.println("esse número é maior que 10");
        }
        else if(numero == 10) {
            System.out.println("esse número é igual a 10");
        }
        else {
            System.out.println("ese número é menor que 10");
        }

        if(name == "Marcos") {
            isValidName = true;
        }
        else {
            isValidName = false;
        }

        if(isValidName) {
            System.out.println("esse usuário de fato é o Marcos");
        }
        else {
            System.out.println("esse usuário não é o Marcos");
        }

        if(idade >= 18){
            System.out.println("você está autorizado a começar a auto escola");
        }
        else {
            System.out.println(("você ainda não possuí a idade obrigatória para começar a auto escola"));
        }

        if(hasLiscense){
            System.out.println("Você está autorizado a dirigir");
        }
        else {
            System.out.println("Você não pode dirigir");
        }

        if(documentNumber.isBlank()) {
            System.out.println("informe o número da carteira de habilitação");
        }
        else {
            System.out.println("Número da carteira informado");
        }

        if(name.equals("Marcos")) {
            System.out.println("Usuário autenticado");
        }
        else {
            System.out.println("Usuário não autenticado");
        }
    }
}
