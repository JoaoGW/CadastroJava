
/**
 * Escreva uma descrição da classe Disciplina aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Disciplina
{
    /*private String nport;
    private String nmat;
    private String nfis;
    private String nbio;
    private String ning;
    private String nquim;*/
    private float nota;
    Texto nomedisc;
    
    Disciplina(){
        criaDisc("Vazio");
        setNota(0);
    }
    public void criaDisc(String nomedisc){
        setDisc(new Texto(nomedisc));
    }
    public void setDisc(Texto nomedisc){
        this.nomedisc = nomedisc;
    }
    public void setNota(float nota){
        this.nota = nota;
    }
    public String getNomeDisc(){
        if(nomedisc == null){
            return "";
        }
        return nomedisc.toString();
    }
    public float getNota(){
        return nota;
    }
    }
    /*Disciplina(){
        setNPort("0");
        setNMat("0");
        setNFis("0");
        setNBio("0");
        setNIng("0");
        setNQuim("0");
    }*/
    
    /*public String getNPort(){
         return this.nport;
    }
    public String setNPort(String  nport){
         this.nport = nport;
         return nport;    
    }
    public String getNMat(){
        return this.nmat;
    }
    public String setNMat(String nmat){
        this.nmat = nmat;
        return nmat;
    }
    public String getNFis(){
        return this.nfis;
    }
    public String setNFis(String nfis){
        this.nfis = nfis;
        return nfis;
    }
    public String getNBio(){
        this.nbio = nbio;
        return nbio;
    }
    public String setNBio(String nbio){
        this.nbio = nbio;
        return nbio;
    }
    public String getNIng(){
        return this.ning;
    }
    public String setNIng(String ning){
        this.ning = ning;
        return ning;
    }
    public String getNQuim(){
        return this.nquim;
    }
    public String setNQuim(String nquim){
        this.nquim = nquim;
        return nquim;
    }
    */
   

