
/**
 * Escreva uma descrição da classe CadastroAlunos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CadastroAlunos
{
    int e = 0;
    int n = 0;
    Aluno alunos[];
    //private String ra = "Vazio";
    //private String serie = "Vazio";
    //private String disciplina = "Vazio";
    
    CadastroAlunos (){
        
        alunos = new Aluno[100];
        }
    public void Cadastro(String nome,int idade,String serie,String ra){   
            cadNome(nome);
            cadIdade(idade);
            cadSerie(serie);  
            cadRa(ra);
    }
    
    public void cadRa(String ra){    
            // alunos[e] = new Aluno(nome, idade, ra, serie, disc);     
             alunos[e].setRa(ra);
    }         
    public String getRaCa(int p){
        
        return alunos[p].getRa();
    }
    public String getSerie(int p){
        return alunos[p].getSerie();
    }
    public int getIdade(int p){
        return alunos[p].getIdade();
    }
    public String getNome(int p){
        return alunos[p].getNome();
    }
    public void cadSerie(String serie){  
            alunos[e].setSerie(serie);
    }
    public void cadDisciplina(String disc,float nota){
            if(alunos[e] == null){
                alunos[e] = new Aluno();
            }
            alunos[e].setDisciplina(disc,n,nota);
            n++;
            if(n >= 8){
                disc = "";
                n = 0;
                }
    }
    public void cadNome(String nome){
        alunos[e].criarPessoa(nome);
    }
    public void cadIdade(int idade){
            alunos[e].setIdade(idade);
    }
    public int verificarEspaco(){
        int e = 0;
        for(int i = 0;i < 100;i++){
            if(alunos[i] == null)
                return i;
        
        }
        return e;
    }
    public void mostraAlunos(){
        for(int i = 1;i < alunos.length;i++){
            System.out.println(getRaCa(i));
        }
    
    }
    
    
    
}
