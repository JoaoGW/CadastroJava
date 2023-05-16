
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa
{
    private int idade;
    private NomePessoa nome;
    
    
    public int getIdade(){
        return this.idade;
    }
    public void criarPessoa(String nome){
        setNome(new NomePessoa(nome));
    
    }
    public void setNome(NomePessoa nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome.toString();
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
}
