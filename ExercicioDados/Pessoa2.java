public class Pessoa2 extends Pessoas {

    // Atributo adicional
    private String localNascimento;

    public Pessoa2() {}

    // Construtor com parâmetros herdados + novo atributo
    public Pessoa2(String nome, String sobrenome, String genero, int idade, String numeroTelefone, String localNascimento) {
        super(nome, sobrenome, genero, idade, numeroTelefone); // chama o construtor da classe Pessoas
        this.localNascimento = localNascimento;
    }

    public String getLocalNascimento() {
        return this.localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
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

    public void exibirLocalNascimento() {
        System.out.println("Meu local de nascimento é: " + getLocalNascimento());
    }
}
