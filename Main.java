public class Main {
    public static void main(String[] args) {
        try {

            PessoaTrabalhadoraEstudante pessoa = new PessoaTrabalhadoraEstudante("Big Jorge", 25, 3000.0);


            pessoa.trabalhar();
            System.out.println("Salary: R$ " + pessoa.receberSalario());


            pessoa.estudar();


            pessoa.tirarNotaComMateria();

            // dados invalidos
            PessoaTrabalhadoraEstudante pessoaInvalida = new PessoaTrabalhadoraEstudante("Lu", -5, -100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
