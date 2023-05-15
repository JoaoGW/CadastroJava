
/**
 * Escreva uma descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aplicacao{ 
   public static void main(String args[]){ 
       IMenu ent = new EntradaGUI(); //para entrada grafica
       //IMenu ent = new EntradaConsole(); //para entrada console
       CadastroAlunos ap = new CadastroAlunos();     
       do{
       switch(ent.Menu()){
           case 1:            //inserir nome,idade,serie,disc,ra
               String nome = ent.lerNome();
               int idade = Integer.parseInt(ent.lerIdade());
               String serie = ent.lerSerie();
               String disc = "a";
               while(disc != ""){
               disc = ent.lerDisciplina();
               float nota = Integer.parseInt(ent.lerNota());
               ap.cadDisciplina(disc,nota);
                }
               String ra = ent.lerRa(); //LEITURA E CADASTRO DO RA
               ap.Cadastro(nome,idade,serie,ra);
               //nome,idade,disciplina,serie,
               break;
           case 2:      //remover
               
               break;
           case 3:       //listar
               //chamar ent para printar e pedir qual aluno 
               ap.mostraAlunos();
               break;
           case 4:         //sair
               
               break;
           default:         //erro
               System.out.println("Escolha uma opcao valida numerica(1,2,3,4)");
               break; 
        }
    }while(ent.Menu() != 4);        
        

        
    }
}
