public class Livro {
    String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    String assunto;

    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    void informações(){
    System.out.println("O nome do livro é: " + this.nome);
    System.out.println("O nome do autor é: " + this.autor);
    System.out.println("O assunto é: " + this.assunto);
}
}