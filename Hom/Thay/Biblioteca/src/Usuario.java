import java.util.Date;

abstract class Usuario {
    private int id;
    private String cpf;
    private String nome;
    private Date nascimento;
    private String genero;
    private String login;
    private String senha;
    Boolean acesso_sistema;

    //Construtor
    public Usuario(int id, String cpf, String nome, Date nascimento, String genero, String login,
                   String senha, Boolean acesso_sistema) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.login = login;
        this.senha = senha;
        this.acesso_sistema = acesso_sistema;
    }

    //Getter & setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAcesso_sistema() {
        return acesso_sistema;
    }

    public void setAcesso_sistema(Boolean acesso_sistema) {
        this.acesso_sistema = acesso_sistema;
    }
}
