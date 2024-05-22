import java.util.ArrayList;
import java.util.List;

public class Acervo {
    private List<Livro> livros;

    public Acervo() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void excluirLivro(String isbn) {
        boolean removed = livros.removeIf(livro -> livro.getIsbn().equals(isbn));
        if (removed) {
            System.out.println("Livro com ISBN " + isbn + " excluído.");
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    public List<Livro> consultarLivros() {
        return livros;
    }
}