// como criar um arquivo java
// todo arquivo java que você for escrever, é obrigatório declarar uma classe
/* o nome da classe deve ser igual ao nome do arquivo, exemplo: arquivo Main,
 nome da classe Main */
// isso não significa que posso declarar apenas uma classe por arquivo
// a classe que precisar ter o mesmo nome do arquivo, tem que ter o prefixo public

import classes_abstratas.*;
import heranca_classe_normal.Admin;
import heranca_classe_normal.Student;
import heranca_classe_normal.User;
import interfaces.*;

public class Main {
    public static void main(String[] args){
        // interface Carro
        Carroo meuSandeiro = new Sandeiro();
        // nosso sandeiro tem um limite de velocidade
        for (int i = 0; i != 16; i++) {
            meuSandeiro.acelerar();
        }
        meuSandeiro.freiar();
        meuSandeiro.parar();

        Carroo meuMobi = new Mobi();
        // nosso mobi não tem limite de velocidade
        for (int i = 0; i <20; i++) {
            meuMobi.acelerar();
        }
        // aqui vemos como funciona o polimorfismo
        // classe e métodos que utilizam a mesma assinatura de uma interface
        // tem lógicas completamente diferentes, o Sandeiro acelera de uma forma completamente diferente do Mobi, e ambos utiliza o mesmo método
        // isso é polimorfismo
        meuMobi.freiar();
        meuMobi.parar();

        // interface Jogador
        Jogador jogador = new JogadorFutebol();
        Jogador jogadorFF = new JogadorFreeFire();
      //  Jogador jpgador2 = new Jogador(); // error, não posso instânciar uma classe, pois ela é vazia, não tem implementação
        jogador.jogar();
        jogador.parar_de_jogar();

        jogadorFF.jogar();
        jogadorFF.parar_de_jogar();
        // interface Motoo
        Motoo minhaCb = new Cb300fs();
        minhaCb.acelerar();
        minhaCb.freiar();
        minhaCb.parar();

        // classe abstrata
      /*  Funcionario funcionario = new Funcionario() {
            @Override
            public double calcular_salario() {
                return 0;
            }
        }; */
        // não posso instânciar uma classe abstrata

        Funcionario developer = new Developer();
        double bonus_desenvolvedor = developer.calcular_bonus();
        developer.falar();
        System.out.println(bonus_desenvolvedor);
        double total_salario_developer = developer.soma_salario_mais_bonus();
        System.out.println("Salário mais bônus, desenvolvedor, total: " + total_salario_developer);
        Funcionario chefe_contabil = new ChefeContabil();
        double bonus_chefe_contabil = chefe_contabil.calcular_bonus();
        chefe_contabil.falar();
        System.out.println(bonus_chefe_contabil);
        double total_salario_chefe_contabil = chefe_contabil.soma_salario_mais_bonus();
        System.out.println("Salário mais bônus, chefe contábil, total: " + total_salario_chefe_contabil);

        // herança em classe normal
        User admin = new Admin();
        System.out.println(admin.nome);
        Boolean resultLoginAdmin = admin.signIn("adminjava@gmail.com", "javaebom");

        if(resultLoginAdmin){
            System.out.println("Login do admin com sucesso!");
        }
        else {
            System.out.println("Login do admin falhou");
        }

        // para eu conseguir acessar o signUp do Admin, meu tipo não pode ser User, poia o método de cadastro do admin é exclusivo dele
        Admin admin1 = new Admin();
        admin1.signUp();

        // exemplo com student
        User student = new Student(0.6081465744268867);

        Boolean resultLoginStudent = student.signIn("marcosstudent@gmail.com", "student123");

        if(resultLoginStudent){
            System.out.println("Login do student com sucesso!");
        }
        else {
            System.out.println("Login do student falhou");
        }

        // student.signUp(); // não consigo acessar o signUp, pois ele é um método individual da classe admin, pois ele tem regras diferença,
        // sua implementação é diferente!

        // como usar ele?
        // tenho q usar o tipo Student
        Student student1 = new Student(0.6081465744268867);

        student1.signUp();

        // classe abstrata
      /*  SerVivo humano = new SerVivo() {
            @Override
            public void respirar() {
                System.out.println("respirando...");
            }
        };*/
        // não posso instânciar uma classe abstrata, mas sim extende-la a uma classe normal

        // classe que herda de uma classe mãe, a classe mâe é SerVivo e a filha é Humano
        SerVivo humano1 = new Humano(19);
        String nome = humano1.nome; // como nome é um atributo da classe SerVivo, consigo acessá-lo, mas se fosse da classe Humano
        // eu não conseguiria, pois um atributo da classe Humano é unicamente dela, e eu tipei como SerVivo
        Humano humano = new Humano(19); // posso instânciar, pois é uma classe normal, não abstrata
        // mas se eu trocar o tipo para Humano, eu consigo acessar
         int idadeHumano =  humano.idade; // se meu humano for do tipo ser vivo, não consigo acessar a idade, pois a idade é um
        // atributo único do Humano
        humano.dormir();
        humano.respirar();
    }

}


// compilar para bytecode => javac nome_arquivo.java
// executar bytecode => java nome_arquivo