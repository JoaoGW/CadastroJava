
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author Pedro
 * @version 2023
 */
public class Aluno extends Pessoa
{
   private int ra;
   private int serie;
   Disciplina discs[];
   Aluno(){
    setRa(0);
    setSerie(0);
    discs = new Disciplina[10];
    }
   //getters
   public int getRa(){
       return this.ra; 
    }
   public int getSerie(){
    return this.serie;
    } 
   //setters
    public void setRa(int  ra){
     this.ra = ra;   
    }
   public void setSerie(int serie){
    this.serie = serie;
    }
   public void cadNovo(String  nome,int idade,int ra, int serie){
    criarPessoa(nome);
    setIdade(idade);
    setRa(ra);
    setSerie(serie);
    }
   public void cadDisc(String[] nomedisc,float[] notadisc){
       int n = 0;
       while(n != -1){
       discs[n].criaDisc(nomedisc[n]);
       discs[n].setNota(notadisc[n]);
       n++;
       if(nomedisc[n] == null){
        n = -1;
        }
       if(n > 8){
        n = -1;
        } 
        }
    } 
   
}
