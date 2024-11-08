public abstract class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 3) {
            throw new IllegalArgumentException("The name have to be with more than 3 letters");
        }
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("The age needs to be higher than 0");
        }
        this.idade = idade;
    }
}
