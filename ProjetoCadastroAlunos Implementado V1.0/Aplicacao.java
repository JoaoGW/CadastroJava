
/**
 * Escreva uma descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aplicacao{ 
    public static void main(String args[]) { 

        IMenu ent = new EntradaGUI("Cadastro de Alunos"); //para entrada grafica
        //IMenu ent = new EntradaConsole(); //para entrada console
        CadastroAlunos ap = new CadastroAlunos(); 
        
        ent.Menu();
        
        
}
}
