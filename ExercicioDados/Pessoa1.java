public class Pessoa1 extends Pessoas {

    private String endereco;

    // Construtor vazio
    public Pessoa1() {}

    // Construtor com parâmetros
    public Pessoa1(String nome, String sobrenome, String genero, int idade, String numeroTelefone, String endereco) {
        super(nome, sobrenome, genero, idade, numeroTelefone); // Chama o construtor da classe pai
        this.endereco = endereco;
    }

    // Get e Set do novo atributo
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Métodos personalizados
    public void exibirNome() {
        System.out.println("Meu nome é: " + getNome());
    }

    public void exibirSobrenome() {
        System.out.println("Meu sobrenome é: " + getSobrenome());
    }

    public void exibirGenero() {
        System.out.println("Meu gênero é: " + getGenero());
    }

    public void exibirIdade() {
        System.out.println("Minha idade é: " + getIdade());
    }

    public void exibirNumeroTelefone() {
        System.out.println("Meu número de telefone é: " + getNumeroTelefone());
    }

    public void exibirEndereco() {
        System.out.println("Meu endereço é: " + getEndereco());
    }
}
