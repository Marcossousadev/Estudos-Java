import java.util.ArrayList;

public class Loops {
    // loops são interações em cima de elementos
    // repetindo alguma expressão várias vezes
     public static void main( String[] args ) {
         ArrayList<String> nomes = new ArrayList<String>();
         nomes.add("Marcos");
         nomes.add("Paulo");
         nomes.add("Paula");
         nomes.add("Carla");
        // #1 deco declarar a variável de interação, quanto tempo vai durar essa interação
         // #2 declaro a condição desse lopp, como ele vai se repetir
         // #3 qual a manipulação que eu vou fazer na minha variável de incrementação
         // a cada volta que eu loop dar ele roda essa manipulação ;
         // enquanto tal condição não é atingida, usamos o for
         for( int enquanto = 0; enquanto < 10; enquanto++ ) {
             System.out.println("Menor");
         }
         for (int i = 0; i < nomes.size(); i++){
             System.out.println(nomes.get(i));
         }

         for (int n = 0; n <  nomes.size(); n++){
             System.out.println(nomes.get(n));
         }

         int[] myNumbers = { 1, 2, 3, 4, 5, 6};

         for (int meuI = 0; meuI < myNumbers.length; meuI ++ ) {
            System.out.println( meuI + "<" + myNumbers.length);
             System.out.println("Número: " + myNumbers[meuI]);
         }

         String[] names = new String[10];
         names[0] = "Márcio";

         for (int inte = 0; inte < names.length; inte++){
             System.out.println(names[inte]);
         }
         for( String nome: names) {
             System.out.println(nome);
         }

         for (int number: myNumbers) {
             System.out.println(number);
         }

         // como vimos, enquanto tal situação não é atingida usamos o for

         // While
         // o while vai ser executado até que ele chegue numa condição
         // já o for é executado enquanto tal condição não é atingida
         // O FOR É EXECUTADO ATÉ TAL CONDIÇÃO NÃO SER VERDADEIRA!
         // JÁ O WHILE É EXECUTADO ATÉ TAL CONDIÇÕ SER VERDADEIRA!

         int meuContador = 0;
         while(meuContador < 10){
             System.out.println("Estou no while");
             meuContador++;
         }
    }
}
