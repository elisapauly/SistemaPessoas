public class SistemaPessoas {

    public static void main(String[] args) {
        Pessoa2 pessoa = new Pessoa2("Elisa", "Pauly", "Feminino", 19, "40028922", "Curitiba");

        pessoa.exibirNome();
        pessoa.exibirSobrenome();
        pessoa.exibirGenero();
        pessoa.exibirIdade();
        pessoa.exibirNumeroTelefone();
        pessoa.exibirLocalNascimento();
    }
}
