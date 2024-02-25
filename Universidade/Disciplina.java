import java.text.MessageFormat;

public class Disciplina {

    private String nome;
    private String prova;
    private double presencaDiaria;
    private Aluno aluno;


    public void lancarPresencaDiariaAluno(int qtdAulaVista, Aluno aluno) {

    presencaDiaria = qtdAulaVista;
    System.out.println(MessageFormat.format("Aluno(a) {0} presente em aula!", aluno.GetNome()));    

    }
    
}
