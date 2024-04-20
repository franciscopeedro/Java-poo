public class App {

    public static void main(String[] args) throws Exception {

        String pais = "argentina";
        
        Ser usuario01 = new Pessoa("pedro",22,"pedro");
        System.out.println(usuario01.getNome());
        usuario01.setNome("paulo");
        System.out.println(usuario01.getNome());
        System.out.println(usuario01.getIdade());
        System.out.println(usuario01.cumprimentar(pais));
    }
}
