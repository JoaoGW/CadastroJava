/**
 * Armazena um texto. Inverte texto e limpa espaços extras
 * 
 * @author Julio Arakaki 
 * @version 1.0 2019/02/29
 */
public class Texto {
    // Atributo da classe ou varáveis de instancia
    private String txt;

    Texto(String txt){
        setTxt(txt);
        limpaEspacosExcedentes();
    }

    // SETTER
    private void setTxt(String t){
        this.txt = t;
    }
    
    // GETTER
    public String getTxt(){
        return this.txt;
    }

    public String inverterTexto(){
        String txtInvertido = "";
        if(!(this.txt == null || this.txt.equals("") )){
            for (int i=this.txt.length()-1; i >= 0; i--){
                txtInvertido = txtInvertido + this.txt.charAt(i);
            }
        } else {
            return null;
        }
        return txtInvertido;
    }
    
    // RETORNA um INT a qnt de palavras
    public int getQtdePalavras(){
        return (getTxt().split(" ").length);
    }
    
    // VOID remove os espacos duplos
    private void limpaEspacosExcedentes(){
        // Elimina espacos do inicio e fim da string
        setTxt(this.txt.trim());

        // Elimina espacos excedentes do meio da string
        String s = "";
        for (int i=0; i < this.txt.length(); i++){
            s = s + this.txt.charAt(i); // pega o caractere da posicao
            if(this.txt.charAt(i) == ' '){
                while(this.txt.charAt(i+1) == ' '){ // avanca se tiver mais espacos
                    i++;
                }
            }
        }
        setTxt(s);
    }

    // Faz com que o comando abaixo imprima a String txt
    //"Texto seila = new Texto();"
    //"System.out.println(seila);"
    public String toString(){
        return("Texto: " + getTxt());
    }
}
