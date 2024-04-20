public class Pessoa extends Ser{
    
    private String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome)
    {
        super(nome,idade);
        this.sobrenome = sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

}
