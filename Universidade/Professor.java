public class Professor {

    private String cpf;
    private String nome;
    private String formacao;
    private int idade;

    public Professor(String cpf, String nome, String formacao, int idade) {

        this.cpf = cpf;
        this.nome = nome;
        this.formacao = formacao;
        this.idade = idade;

    }


    public String GetNome() {
        return nome;
    }
    
    
}
