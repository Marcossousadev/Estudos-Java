import user.User;

public class ExemploModificadores {
    public static void main(String[] args ) {
        User user1 = new User("Marcos", "marcos@gmail.com", 123456);

        System.out.println(user1.name); // consigo acessar o nome desse usuário, pois name é públic
      //  System.out.println(user1.email); // não consigo acessar email, pois é protected, apenas a classe e subclasses
        // do arquivo tem acesso e a package (pacote)
      //  System.out.println(user1.password); // não consigo acessar, pois a senha a private, apenas a classe tem acesso a esse atríbuto

        // mas como eu tenho métodos publicos q retornam alguns dados, posso usá-los
        String name = user1.get_name();
        System.out.println("Nome do usuário: " + name);
        String email = user1.get_email();
        System.out.println("Email do usuário: " + email);
        // System.out.println("Senha do usuário" + user1.getPassword();
        // não consigo acessar o método de retornar a senha, pois ele é protected, apenas a classe e subclasses do mesmo diretório conseguem acessar

    }
}
