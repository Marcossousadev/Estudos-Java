package vetores;

import java.util.ArrayList; // é necessário importar essa classe

public class VetoresNew {
    public static void main( String[] args) {
        // como se cria um vetor em java
        // um vetor é uma lista de dados de um mesmo tipo no java

        // exemplo: uma lista de números inteiros
        // para criar um vetor no java é bem simples
        // nós primeiros declaramos o seu tipo, unimos [] ao seu tipo
        // o [] serve para explicar ao Java que estamos criando um vetor
        // e não uma variável simples, de apenas um valor
        // tipo[]
        // dps nomeamos o nome desse vetor
        // exemplo: int[] nomes
        // podemos iniciar esse vetor com valores fixos, que dps não poderam ser alterados
        // ou informando quantos indexs esse vetor terá
        // exemplo de valores fixos: int[] casas = {1, 2, 3};
        // nesse exemplo não posso adiconar um novom valor a essa lista
        // exemplo definindo quantidade de indexs: int[] casas = new int[5];
        // todos os vetores inicial seus indexs no valor 0 casas[0]
        // criando um vetor de valores fixos
        //              0 ,1, 2, 3, 4
        int[] casas = { 1, 2, 3, 4, 5 }; // [ 1, 2, 3, 4, 5 ]
        // casas[5] = 6; // Array index is out of bounds, não consigo adicionar um novo valor ao index 5, pois o vetor é fixo
        // criando um vetor que pode receber apenas 5 valores
        int[] casasArr = new int[5];
        // inserindo valor ao index 0 desse vetor
        casasArr[0] = 5;
        System.out.println("PARTE DE VETORES PURO JAVA: ");
        // Verificando qual o tamanho desse vetor
        System.out.println("Tamanho vetor: " + casasArr.length);

        // Exibindo o primeiro valor desse vetor
        System.out.println("Primeiro valor desse vetor: " + casasArr[0]);

        String[] nomes = { "Marcos", "Paulo", "Cesár" };

        // Verificando qual o tamanho desse vetor
        System.out.println("Tamanho vetor: " + nomes.length);

        // Exibindo o primeiro valor desse vetor
        System.out.println("Primeiro valor desse vetor: " + nomes[0]);

        // COMO CRIAR UMA LISTA DINÂMICA NO JAVA
        // LISTA ONDE EU POSSO ADICIONAR E DELETAR ITENS DINÂMICAMENTE
        // SEM QUE SEJA PRECISO ESPECIFICAR A QUANTIDADE DE INDEXS NA CRIAÇÃO
        // USAMOS O ArrayList que é uma classe do Java util

        // chamamos a classe ArrayList
        ArrayList<String> nomes_alunos = new ArrayList<String>();

        // como adicionar um valor a essa lista
        // como o java é fortemente tipado, ele aceita apenas valores que sejam do mesmo tipo de dado da lista
        nomes_alunos.add("Joâo");
        nomes_alunos.add("Marcos");
        nomes_alunos.add("Paulo");
        nomes_alunos.add("Gisele");
        System.out.println("PARTE DE ARRAYLIST:  ");
        // como exibir um valor dessa lista?
        System.out.println("Antes era do 0 o aluno: " + nomes_alunos.get(0));

        // como remover um valor dessa lista?
        nomes_alunos.remove(0); // REMOVENDO POR INDEX

        System.out.println("Agora o aluno do index 0 passa a ser o: " + nomes_alunos.get(0));

        nomes_alunos.remove("João"); // podemos deletar pelo objeto também

        System.out.println("Agora o aluno do index 0 passa a ser o: " + nomes_alunos.get(0));

        // modificando o valor de um index específico
        nomes_alunos.set( 1, "Carlos");

        // removendo todos os elementos de um ArrayList
        // nomes_alunos.clear();

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        // adicionando valores a lista
        myNumbers.add(19);
        myNumbers.add(18);
        myNumbers.add(17);
        myNumbers.add(16);

        // removendo um valor dessa lista
        myNumbers.remove(0);

        // modificando o valor de um index específico
        myNumbers.set(0, 20);

        // lista o valor de um index específico
        System.out.println(myNumbers.get(0));

        // listando o primeiro item da lista
        System.out.println(myNumbers.getFirst());
        // listando o último item da lista
        System.out.println(myNumbers.getLast());

        // limpando
        myNumbers.clear();

        ArrayList<Boolean> myBools = new ArrayList<Boolean>();

        myBools.add(true);
        myBools.add(false);

        System.out.println(myBools.get(0));
        System.out.println(myBools.getFirst());
        System.out.println(myBools.getLast());

        myBools.remove(0);

        myBools.set(0, true);

        myBools.clear();

    }
}
