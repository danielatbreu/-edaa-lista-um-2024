public class Pessoa {
String nome;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
long cpf;
public long getCpf() {
    return cpf;
}
public void setCpf(long cpf) {
    this.cpf = cpf;
}
int celular;
public int getCelular() {
    return celular;
}
public void setCelular(int celular) {
    this.celular = celular;
}

void infos(){
    System.out.println("O nome é: " + this.nome);
    System.out.println("O CPF é: " + this.cpf);
    System.out.println("O número de celular sem DDD é: " + this.celular);

}

}
