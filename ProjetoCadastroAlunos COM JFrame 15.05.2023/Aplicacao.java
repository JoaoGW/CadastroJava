
/**
 * Escreva uma descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aplicacao{ 
    public static void main(String args[]){ 
        
        System.out.println("============================");
        View menu = new View("aa");
        
        /*
        //IMenu ent = new EntradaGUI(); //para entrada grafica
        IMenu ent = new EntradaConsole(); //para entrada console
        CadastroAlunos ap = new CadastroAlunos();  
        int op;
        boolean alunonovo;
        do{
            op = ent.Menu();    
            switch(op){
                case 1:            //inserir nome,idade,serie,disc,ra
                    String nome = ent.lerNome();
                    int idade = Integer.parseInt(ent.lerIdade());
                    String serie = ent.lerSerie();
                    String disc = "a";
                    float nota = 0;
                    alunonovo = true;
                    while(!disc.equals("")){
                        disc = ent.lerDisciplina();
                        if(!disc.equals("")){
                            nota = Integer.parseInt(ent.lerNota());
                        }
                        ap.cadDisciplina(disc,nota,alunonovo);
                        alunonovo = false;
                    }
                    String ra = ent.lerRa(); //LEITURA E CADASTRO DO RA
                    ap.Cadastro(nome,idade,serie,ra);
                    //nome,idade,disciplina,serie,
                    break;
                case 2:      //remover

                    break;
                case 3:       //listar
                    //chamar ent para printar e pedir qual aluno 
                    String listara = ent.lerListaRa();
                    ap.mostraAlunos(listara);
                    break;
                case 4:         //sair

                    break;
                default:         //erro
                    System.out.println("Escolha uma opcao valida numerica(1,2,3,4)");
                    break; 
            }
        }while(op != 4);        
    */
    }
}
