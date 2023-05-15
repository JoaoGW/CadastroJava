
public class Pessoa
{
    private int idade;
    private NomePessoa nome;
    
    // GETTERS
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return nome.toString();
    }
    
    // SETTERS
    public void setNome(NomePessoa nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    // VOID que crai um NomePessoa
    public void criarPessoa(String nome){
        setNome(new NomePessoa(nome));
    
    }
    
}
