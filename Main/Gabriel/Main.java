import java.util.Scanner;

public class Main {
    public static void main(Sting[] args) {

        User user1 = new User("Gabriel", "gabriel@exemple.com", "senha123");
        User user2 = new User("Josinaldo", "josinaldo@exemple.com", "senha456");

        Scaner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema bibilioteca!");

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        User currentUser = null;
        if (User1.getEmail().equals(email) && user1.autenticar(senha)) {
            currentUser = user1;
        } else if (User2.getEmail().equals(email) && user1.autenticar(senha)) {
            currentUser = user2;
        }

        if (currentUser == null) {
            System.out.println("Email ou senha incorretos, Encerrando...");
            return;
        }

    }
}
