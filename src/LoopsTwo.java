import java.util.ArrayList;

public class LoopsTwo {
    public static void main (String[] args) {
        int[] myNumbers = { 1, 2, 3, 4, 6, 5, 7 };

        // existem dois tipos de loops mais usados no java
        // for e while
        // o for é executada para quando uma condição não é atingida
        // já o while é executado até tal condição ser atingida
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        // o while é executado até tal condição ser atingida
        int meuContador = 0;
        while(meuContador < 10) {
                System.out.println(meuContador);
                meuContador++;
        }

        ArrayList<String> names = new ArrayList<String>();
        names.add("Marcos");
        System.out.println("FOR: ");
       if(names.size() == 0) {
           System.out.println("Lista vazia");
       }
       else {
           for ( int contador = 0; contador < names.size(); contador++){
               System.out.println(names.get(contador));
           }
       }
        System.out.println("WHILE: ");
       if(names.size() == 0) {
           System.out.println("Lista vazia");
       }
       else {
           int meuIndex = 0;
           while (meuIndex < names.size()) {
               System.out.println(names.get(meuIndex));
               meuIndex++;
           }
       }
    }
}
