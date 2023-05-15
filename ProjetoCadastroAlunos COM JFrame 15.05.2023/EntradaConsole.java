import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Entrada de dados (texto).
 * 
 * @author Julio Arakaki
 * @version 03/04/2023
 */public class EntradaConsole implements IMenu{
    Scanner scan = new Scanner( System.in );

    /**
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */    
    public String lerNome(){ 
        System.out.println("Forneca nome: ");
        String nome = scan.nextLine();
        return nome;
    }

    /**
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */
    
    public String lerIdade(){ 
        System.out.println("Forneca idade: ");
        String idade = scan.nextLine();
        return idade;
    }
    
    public String lerRa()
    {
        System.out.println("Forneca RA: ");
        String ra = scan.nextLine();
        return ra;
    }
    
    public String lerSerie()
    {
        System.out.println("Forneca serie: ");
        String serie = scan.nextLine();
        return serie;
    }
    
    public String lerDisciplina()
    {
        System.out.println("Forneca disciplinas: ");
        String disciplina = scan.nextLine();
        return disciplina;
    }
    
    public String lerNota(){ 
        System.out.println("Forneca nota: ");
        String nota = scan.nextLine();
        return nota;
    }
    
    public String lerListaRa(){
        System.out.println("Forneca RA do aluno: ");
        String listara = scan.nextLine();
        return listara;
    }
    
     public int Menu(){
        System.out.println("Programa Cadastro de Alunos");
        System.out.println("[1]Inserir");
        System.out.println("[2]Remover");
        System.out.println("[3]Listar");
        System.out.println("[4]Sair");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha opcao: "));
        op = scan.nextInt();
        return op;
    }
}