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
    
    // cria em array 100 Aluno
    CadastroAlunos (){
        alunos = new Aluno[100];
    }
    
    // Passa o nome, idade, serie, ra
    public void Cadastro(String nome,int idade,String serie,String ra){   
        cadNome(nome);
        cadIdade(idade);
        cadSerie(serie);  
        cadRa(ra);
    }
    // Cria a pessoa
    public void cadNome(String nome){
        alunos[e].criarPessoa(nome);
    }
    
    // SETTERS
    public void cadRa(String ra){        
        alunos[e].setRa(ra);
    }
    public void cadSerie(String serie){  
        alunos[e].setSerie(serie);
    }
    public void cadIdade(int idade){
        alunos[e].setIdade(idade);
    }
    
    // GETTERS
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
    public String getDisciplina(int posaluno,int posdisc){
        return alunos[posaluno].getDisc(posdisc);
    }
    public float getNota(int posaluno,int posdisc){
        return alunos[posaluno].getNota(posdisc);
    }
    
    //
    public void cadDisciplina(String disc,float nota,boolean alunonovo){
        if(!disc.equals("")){
            if(alunonovo == true){
                int v = verificarEspaco();
                alunos[v] = new Aluno();
                n = 0;
            }
            alunos[e].setDisciplina(disc,n,nota);
            n++;
            if(n >= 8){
                disc = "";
                n = 0;
            }
        }    
    }
    
    // RETORNA a prox posicao a ser colocado o cliente
    // RETORNA "404" caso esteja cheio
    public int verificarEspaco(){
        int e = 404;
        for(int i = 0;i < 100;i++){
            if(alunos[i] == null)
                return i;
        
        }
        return e;
    }
    
    // IMPRIME o nome, idade, serie, ra, e o nome e nota das materias
    public void mostraAlunos(String listara){
        int i = 0;
        int j = 0;
        int tamanhodisc;
        String ra;
        while(alunos[i] != null){
            if(getRaCa(i).equals(listara)){
                System.out.println(getRaCa(i));
                //nome, idade, serie, disciplina e nota, ra 
                System.out.println(getNome(i));
                System.out.println(getIdade(i));
                System.out.println(getSerie(i));
                System.out.println(getRaCa(i));
                System.out.println("Materias: ");
                while(!alunos[i].getDisc(j).equals("")){
                    System.out.println(getDisciplina(i,j));
                    System.out.println(getNota(i,j));
                    j++;
                }
                
            }
            i++;    
        }
    }
}
