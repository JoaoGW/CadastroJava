import javax.swing.*;
import java.util.ArrayList;
import java.util.*;

/**
 * Escreva uma descrição da classe ArrayList aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ArrayListImp implements IArmazenador
{
    //IMenu ent = new EntradaGUI(); //para entrada grafica
    IMenu ent = new EntradaConsole();
    
    private boolean error = false;
    public String nome;
    public String ra;
    public String serie;
    public String idade;
    
    //Criação da array de alunos e professores para funcionalidade de cadastro em Array
    List<List<String>> usuariosArr = new ArrayList<List<String>>();
    
    public boolean getError(){
        return this.error;
    }
    
    public void setError(boolean erro){
        this.error = erro;
    }
    
    public void adicionarUsuarioAlunoArrayList(){
        List<String> listaCad = new ArrayList<>();
        
        //Para o nome
        try{
            do{
                nome = ent.lerNome();
            } while ( getError() == true );
        }catch(Exception e){
            setError(true);
        }
        
        //Para o RA
        try{
            do{
                ra = ent.lerRa();
            } while (getError() == true);
        }catch(Exception e){
            setError(true);
        }
        
        //Para a série
        try{
            do{
                serie = ent.lerSerie();
            }while(getError() == true);
        }catch(Exception e){
            setError(true);
        }
        
        //Para a idade
        try{
            do{
                idade = ent.lerIdade();
            } while ( getError() == true );
        }catch(Exception e){
            setError(true);
        }
        
        //FAZER Para as disciplinas e Para as notas
        
        //Criando a funcionalidade do ArrayList
        usuariosArr.add(listaCad);
            
        //Insere os valores dentro da array
        listaCad.add("Nome: " + nome);
        listaCad.add("Serie: " + serie);
        listaCad.add("Idade: " + idade + " anos");
        listaCad.add("RA: " + ra);
        
        //Mostra todos os usuários já cadastrados dentro do ArrayList
        System.out.println(usuariosArr + "\n");
            
        //FAZER Adiciona mais um cadastro no contador
    }
}
