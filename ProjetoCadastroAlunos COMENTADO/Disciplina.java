
/**
 * Escreva uma descrição da classe Disciplina aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Disciplina
{
    
    private float nota;
    Texto nomedisc;
    
    Disciplina(){
        criaDisc("Vazio");
        setNota(0);
    }
    
    // SETTERS
    public void setDisc(Texto nomedisc){
        this.nomedisc = nomedisc;
    }
    public void setNota(float nota){
        this.nota = nota;
    }
    
    // GETTERS
    public String getNomeDisc(){
        if(nomedisc == null){
            return "";
        }
        return nomedisc.toString();
    }
    public float getNota(){
        return nota;
    }
    
    // VOID cria disciplina
    public void criaDisc(String nomedisc){
        setDisc(new Texto(nomedisc));
    }
}

   

