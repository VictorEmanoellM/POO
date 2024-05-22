import java.util.List;
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
        System.out.println("Bem vindo, " + currentUser.getNome() + "!");

        Acervo acervo = new Acervo();
        AdicionarLivros adicionarLivros = new AdicionarLivros(acervo);
        ExcluirLivros ExcluirLivros = new ExcluirLivros(acervo);
        ConsultarLivros consultarLivros = new ConsultarLivros(acervo);

        System.out.println("Adicionar livros...");
        Livro livro = new Livro("Java para Iniciantes", "Jonh Doe", "12345");
        Livro livro = new Livro("Programação Avançada", "Jane Smith", "67890");
        adicionarLivros.adicionarLivro(Livro1);
        adicionarLivros.adicionarLivro(Livro2);

        System.out.println("Consultando livros...");
        List<Livro> livros = consultarLivros.consultarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("excluindo um livro...");
        excluindoLivros.excluinLivros("12345"); 

        System.out.println("Consultando Livros novamnete...");
        livros = consultarLivros.consultarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }
}
