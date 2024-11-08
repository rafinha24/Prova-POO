import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante {
    private double salario;
    private int nota;
    private String materia;


    private static final List<String> MATERIAS = Arrays.asList(
            "Art", "Biology", "Cience", "Philosophy",
            "Geography", "History", "English",
            "Portuguese Language", "Math", "chemistry", "Sociology"
    );

    private static final Random RANDOM = new Random();

    public PessoaTrabalhadoraEstudante(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Implementação do método trabalhar
    @Override
    public void trabalhar() {
        System.out.println(getNome() + " is working.");
    }

    // Implementação do método receberSalario
    @Override
    public double receberSalario() {
        return salario;
    }

    // Implementação do método estudar
    @Override
    public void estudar() {
        System.out.println(getNome() + " is studying.");
    }


    @Override
    public int tirarNota() {
        this.nota = RANDOM.nextInt(11);
        return nota;
    }


    public int tirarNotaComMateria() {
        int nota = tirarNota();
        this.materia = MATERIAS.get(RANDOM.nextInt(MATERIAS.size()));
        System.out.println("Grade: " + nota + " - School subject: " + materia);
        return nota;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("The salary cant be negative");
        }
        this.salario = salario;
    }
}
