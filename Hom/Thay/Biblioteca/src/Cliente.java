import java.util.Date;

public class Cliente extends Usuario{

    public Cliente(int id, String cpf, String nome, Date nascimento, String genero, String login, String senha, Boolean acesso_sistema) {
        super(id, cpf, nome, nascimento, genero, login, senha);
        this.acesso_sistema = acesso_sistema;
    }
}
