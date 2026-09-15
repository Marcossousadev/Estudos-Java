package loops;

import java.util.ArrayList;
// revisão loop
public class NewLoop {
    public static void main(String[] args) {
        // esse tipo de vetor não pode adicionar o novo index
        int[] myNumbers = { 1, 2, 3, 4, 5 };
        // o for é executado enquanto tal situação não é atingida
        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }
        // lista dinâmica, podemos adicionar e remover itens
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        // o while é executado até que chegue em uma condição
        int incrementador = 0;
        while ( incrementador < numbers.size()){
            System.out.println(numbers.get(incrementador));
            incrementador++;
        }
    }
}
