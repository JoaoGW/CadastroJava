import javax.swing.JOptionPane;
/**
 * Escreva uma descrição da classe EntradaGUI aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class EntradaGUI implements IMenu
{
   public String lerRa(){
        String ra = JOptionPane.showInputDialog("Forneca ra: ");
        return ra;
    }
    public String lerSerie(){
        String serie = JOptionPane.showInputDialog("Forneca serie: ");
        return serie;
    }
    public String lerDisciplina(){
        String disciplina = JOptionPane.showInputDialog("Forneca a disciplina: ");
        return disciplina;
    }
   public String lerNome(){
        String nome = JOptionPane.showInputDialog("Forneca Nome: ");
        return nome;
    }
   public String lerIdade(){
        String idade = JOptionPane.showInputDialog("Forneca idade: ");
        return idade;
    }
   public String lerNota(){
        String nota = JOptionPane.showInputDialog("Forneca Nota: ");
        return nota;
    } 
   public String lerListaRa(){
        String listara = JOptionPane.showInputDialog("RA do aluno:");
        return listara;
    } 
   //inserir,remover,listar,sair
   public int Menu(){
        int op;
        System.out.println("Programa Cadastro de Alunos");
        System.out.println("[1]Inserir");
        System.out.println("[2]Remover");
        System.out.println("[3]Listar");
        System.out.println("[4]Sair");
        op = Integer.parseInt(JOptionPane.showInputDialog("Escolha opcao: "));
        return op;
    }
}
