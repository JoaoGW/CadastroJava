/**
 * Classe para armazenar o nome de uma pessoa. Possibilita inverter nome e limpar
 * espaços extras (operaçoes herdados da classe pai).
 * Retorna o nome da pessoa em formato de bibliografia
 * 
 * @author Julio Arakaki 
 * @version 1.0 2019/02/29
 */
public class NomePessoa {
    // Atributos
    private Texto nome;

    // Construtores
    public NomePessoa(String nome){
        setNome(nome);
    }
    
    // GETTERS
    public String getNome() {
        return this.nome.getTxt();
    }
    protected void setNome(String nome) {
        this.nome = new Texto(nome);
    }
    public int getQtdePalavras(){
        return this.nome.getQtdePalavras();
    }
    public String getNomeInvertido(){
        return this.nome.inverterTexto();
    }
    public String getNomeBiblio(){

        // Separa as palavras
        String vts[] = this.nome.getTxt().split(" ");
        int qtd = vts.length;

        String sBib = vts[qtd-1] + ", "; // ultimo nome + a virgula
        // Monta o texto
        for (int i=0; i < (qtd-1); i++){
            String pal = vts[i].toLowerCase(); // pega palavra
            if(!verificaStr(pal)){ // Se nao for preposicao concatena
                sBib = sBib + vts[i].toUpperCase().charAt(0) + ". ";
            }
        }
        return sBib;
    }
    
    // RETORNA true se possui "da", "de", "do" etc. no nome da pesosa
    private boolean verificaStr(String s){
        // Vetor de strings a serem retiradas
        final String sRet[]={"da", "de", "do", "di", "das", "dos", "e",};

        for (int i = 0; i < sRet.length; i++){
            if(sRet[i].equals(s)){
                return true;
            }
        }
        return false;
    }
    
    // RETORNA uma String q eh o nome do aluno
    public String toString(){
        return this.nome.toString();
    }

}

