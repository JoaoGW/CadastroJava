
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa
{
   private String ra;
   private String serie;
   Disciplina discs[];
   Aluno(){
    setRa("a");
    setSerie("a");
    discs = new Disciplina[10];
    }
   
   //getters
   public String getRa(){
       return this.ra; 
    }
   public String getSerie(){
    return this.serie;
    } 
   //setters
    public String setRa(String  ra){
     this.ra = ra;
     return ra;    
    }
   public String setSerie(String serie){
    this.serie = serie;
    return serie;
    }
   public void setDisciplina(String disc, int n, float nota){
        discs[n] = new Disciplina();
        discs[n].criaDisc(disc);
        discs[n].setNota(nota);
    }
   public Disciplina getDisciplina(int n){
        return discs[n];
    } 
}
