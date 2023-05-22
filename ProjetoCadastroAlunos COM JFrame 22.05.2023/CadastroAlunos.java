
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
        //alunos[0] = View.getAluno();
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
    public void cadNome(String nome){
        alunos[e].criarPessoa(nome);
    }
    public void cadIdade(int idade){
            alunos[e].setIdade(idade);
    }
    public int verificarEspaco(){
        int e = 404;
        for(int i = 0;i < 100;i++){
            if(alunos[i] == null)
                return i;
        
        }
        return e;
    }
    public String getDisciplina(int posaluno,int posdisc){
        return alunos[posaluno].getDisc(posdisc);
    }
    public float getNota(int posaluno,int posdisc){
        return alunos[posaluno].getNota(posdisc);
    
    }
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
