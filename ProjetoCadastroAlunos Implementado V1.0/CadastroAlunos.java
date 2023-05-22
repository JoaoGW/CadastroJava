
/**
 * Escreva uma descrição da classe CadastroAlunos aqui.
 * Cadastro cria uma instancia nova do tipo aluno e cadastra as informacoes
 * com excessao da disciplina e nota
 * CADDISC cadastra as disciplinas e suas respectivas notas no aluno
 * Armazenar armazena o objeto aluno em um banco de dados(vetdin,arraylist ou listaligada)
 * @author Grupo Pedro 
 * @version 2023
 */
public class CadastroAlunos
{
    IArmazenador arm = new VetDin();
    //IArmazenador arm = new ArrayList();
    //IArmazenador arm = new ListaLigadaSimples();
    Aluno aluno;
    CadastroAlunos (){
        }
    public void Cadastro(String nome,int idade,int ra,int serie){   
            aluno = new Aluno();
            aluno.cadNovo(nome,idade,ra,serie);
    }
    public void cadDisc(String[] nomedisc,float[] notadisc){
            aluno.cadDisc(nomedisc,notadisc);
            Armazenar();
    }
    public void Armazenar(){
        arm.adicionar(aluno);
    }
}
