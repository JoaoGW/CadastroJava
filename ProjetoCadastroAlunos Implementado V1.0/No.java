/**
 * No de uma lista ligada.
 * 
 * @author Julio Arakaki 
 * @version 1.0 2023/05/15
 */
public class No{
    /**
     * Atributos
     */
    Object conteudo; // conteudo
    No proximo; // proximo

    /**
     * No Construtor
     *
     * @param conteudo Object a ser inserido no no
     */
    public No(Object conteudo){
        setConteudo(conteudo);
        setProximo(null);
    }
    /**
     * setters e getters
     */
    public void setConteudo(Object conteudo){
        this.conteudo = conteudo;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    public Object getConteudo(){
        return(this.conteudo);
    }
    
    public No getProximo(){
        return(this.proximo);
    }
    public String toString(){
        return(conteudo.toString());
    }
}
