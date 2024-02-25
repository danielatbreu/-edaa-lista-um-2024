public class ProgramaCachorro {
    
    public static void main (String[] args) {

        Cachorro dog = new Cachorro();
        dog.setId(1);
        dog.setNome("Billy");
        dog.setIdade(2);
        System.out.println(dog.getNome());
        dog.latir();

    }

}
