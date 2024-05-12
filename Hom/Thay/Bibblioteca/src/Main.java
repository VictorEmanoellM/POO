public class Main {
    public static void main(String[] args) {
        System.out.println("Olá! Bem vindo ao sistema de Biblioteca");
        System.out.println("Selecione uma opção do menu");

        Cliente Thay = new Cliente();
        Thay.setLogin("Thayroni_Lima");
        Thay.setSenha("1234");

        System.out.println(Thay.getLogin());
        System.out.println(Thay.getSenha());
    }
}