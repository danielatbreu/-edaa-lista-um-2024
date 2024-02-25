public class Aluno {
    private String cpf;
    private String nome;
    private int idade;

    public Aluno(String cpf, String nome, int idade) {

        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;

    }


    public String GetNome() {
        return nome;
    }
    
}
