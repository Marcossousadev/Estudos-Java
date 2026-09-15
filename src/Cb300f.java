import estudo_java.Animal;

public class Cb300f {
   public static void main( String[] args) {
        // exite duas formas de criar uma variável no java

        // 1 forma
        // declaramos tipo antes do nome da variável e dps o nome dela e valor

        // inteiro
        int ano = 2027; // inteiro, número sem vírgula

        //string
        String nome_moto = "Honda Cb Twister 300f";
     // Animal gato = new Animal("Gato"); // público, ainda consigo acessar de qualquer package

        // 2 forma
        /* usamos var, ao darmos o valor, ao qual a variável vai armazenar, ela automaticamente identifica o seu tipo*/

        var ano_moto = 2027; // ela automaticamente se classifica como inteiro

       var nome_nova_moto = "Honda Twister Cb300f";
    }
}
