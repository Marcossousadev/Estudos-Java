import java.util.ArrayList;

public class Vetores {
    public static void main( String[] args ) {
        // estrutura de dados utilizada para armazenar uma coleção de valores do mesmo tipo
        // pode ser uma lista de números
        // lista de texto e etc
        // todo vetor inicia seu primeiro index no valor 0
        //                          0, 1, 2, 3, 4
        int[] ColecaoDeInteiros = { 1, 2, 3, 4, 5};  // [1, 2, 3, 4, 5];
        // ColecaoDeInteiros[5] = 6;
        // como esse vetor foi criado com 4 index por padrão, não é possível adicionar um 5 index ou mais
        // QUANDO DECLARAMOS O VETOR DESSA FORMA NÃO É POSSÍVEL MODIFICAR A ESTRUTURA JÁ CRIADA
        // não consigo adicionar mais indexs, pois ele fica fixo
        System.out.println("Primeiro número Vetor: " + ColecaoDeInteiros[0]); // 1
        System.out.println("Segundo número Vetor: " + ColecaoDeInteiros[1]); // 2
        System.out.println("Terceiro número Vetor: " + ColecaoDeInteiros[2]); // 3
        System.out.println("Quarto número Vetor: " + ColecaoDeInteiros[3]); // 4
        System.out.println("Quinto número Vetor: " + ColecaoDeInteiros[4]); // 5

        // descobrindo o tamanho do meu Vetor
        System.out.println("Tamanho do meu Vetor: " + ColecaoDeInteiros.length);

        // e se eu não quero criar um vetor com valores já definidos de forma padrão?

        // podemos cria-los já definidos a quantidade de indexs que esse vetor pode ter
        int[] meusNumeros = new int[20]; // esse vetor só poderá ter 20 indexs
        // quando eu crio um vetor dessa forma, eu não posso atribuir um novo valor a esse vetor
        // pois ele fica por padrão com esses valores e essa quantidade fixa de indexs
        String[] nomes_alunos_turma_manha = {"Ana", "Maria", "Paulo", "José"};
       //  nomes_alunos[4] = "Mario"; // Array index is out of bounds
        // não posso atribuir um novo valor a ele

        String[] meus_alunos_turma_tarde = new String[20];
        meus_alunos_turma_tarde[0] = "Arthur"; // vetor de lista char
        meus_alunos_turma_tarde[1] = "Marcos";
        // exibindo a quantidade de alunos turma manhã
        System.out.println("Quantidade alunos manhâ: " + nomes_alunos_turma_manha.length);
        System.out.println("Quantidade alunos tarde: " + meus_alunos_turma_tarde.length);
        System.out.println("Primeiro aluno Vetor: " + meus_alunos_turma_tarde[0]); // Arthur
        System.out.println("Primeiro aluno Vetor: " + meus_alunos_turma_tarde[0]); // Marcos
        // inicinado um vetor char já com valores definifos
        char[] inicias_nome = {'j', 'a', 'v', 'a'};
        // um vetor do tipo char para 5 chars
        char[] letras = new char[5];
        // E se eu não souber a quantidade de intes que meu vetor vai armazenar?
        // usamos o ArrayList para listas dinâmicas
        // ArrayList => é uma classe no Java que nós permiti criar uma lista dinâmica
        // onde é possível adicionar e remover intens de forma dinâmica
        // não é preciso declarar no momento da criação da variável o tamanho dela
        // chama essa classe utilitária, defini o tipo e o nome dela e instância ela

        // no vetor como seria
        String[] nomesArr = new String[10];
        nomesArr[0] = "Marcos";
        ArrayList<String> nomes = new ArrayList<String>();
        // como adicionar um elemento a essa lista, usasse o metódo add
        nomes.add("Marcos");
        nomes.add("Leo");
        nomes.add("Gisele");
        nomes.add("Maria");

        // como acessar o valores desses indexs
        System.out.println("Primeiro valor index1 ArrayList" + nomes.get(0));
        // como remover um index dessa lista (ArrayList), removendo pelo index
        nomes.remove(0); // removendo o Marcos

        System.out.println(nomes.get(0)); // agora descobrindo que é o novo index 0, resultado: Leo
        // existe como remover pelo objeto mesmo
        nomes.remove("Leo");
        System.out.println(nomes.get(0)); // agora descobrindo que é o novo index 0, resultado: Gisele

    }
}
