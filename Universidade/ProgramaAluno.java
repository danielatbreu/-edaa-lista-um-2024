public class ProgramaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("1245328451", "Vinícius Rios", 21);
        Professor professor = new Professor("12121212", "Daniel Paiva", "Graduação e Pós Graduação", 31);
        Universidade universidade = new Universidade("UNA", "Av. Maria da Glória Rocha");
        Disciplina disciplina = new Disciplina();
        System.out.println("Professor: " + professor.GetNome());
        System.out.println("Universidade: " + universidade.GetNome());
        disciplina.lancarPresencaDiariaAluno(2, aluno);


    }
    
}
