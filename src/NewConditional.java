public class NewConditional {
    // revisão condicionais
    public static void main (String[] args ) {
        int number = 10;
        String name = "Marcos";
        // condicional numérica
        if(number < 10) {
            System.out.println("número menor que 10");
        }
        else {
            System.out.println("número maior que 10");
        }
        // condicional textual
        if(name == "Marcos") {
            System.out.println("usuário autenticado");
        }
        else {
            System.out.println("usuário não autenticado");
        }

        if(name.equals("Marcos")) {
            System.out.println("usuário autenticado");
        }
        else {
            System.out.println("usuário não autenticado");
        }

    }
}
