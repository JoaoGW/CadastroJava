import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ArrayList aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ArrayList
{
    private boolean error = false;
    
    //Criação da array de alunos e professores para funcionalidade de cadastro em Array
    List<List<String>> usuariosArr = new ArrayList<List<String>>();
    List<String> listaCad = new ArrayList<>();
    
    public boolean getError(){
        return this.error;
    }
    
    public void setError(boolean erro){
        this.error = erro;
    }
    
    public void adicionarUsuarioAlunoArrayList(){
        //Para o nome
        try{
            do{
                cadNome(JOptionPane.showInputDialog("Insira o nome: "));
            } while ( getError() == true );
        }catch(Exception e){
            setError(true);
        }
        
        //Para o RA
        try{
            do{
                cadRa(JOptionPane.showInputDialog("Insira o registro acadêmico: "));
            } while (getError() == true);
        }catch(Exception e){
            setError(true);
        }
        
        //Para a série
        try{
            do{
                cadSerie(JOptionPane.showInputDialog("Insira a serie: "));
            }while(getError() == true);
        }catch(Exception e){
            setError(true);
        }
        
        //Para a idade
        try{
            do{
                String idade;
                int idadeTrans;
                idade = JOptionPane.showInputDialog("Insira a idade: ");
                idadeTrans = Integer.parseInt(idade);
                cadIdade(idadeTrans);
            } while ( getError() == true );
        }catch(Exception e){
            setError(true);
        }
        
        //Criando a funcionalidade do ArrayList
        usuariosArr.add(listaCad);
            
        //Insere os valores dentro da array
        listaCad.add("Nome: " + getNome());
        listaCad.add("Curso: " + aluno.getCurso());
        listaCad.add("Idade: " + getIdade() + " anos");
        listaCad.add("Materias: " + getDisciplina());
        
        //Mostra todos os usuários já cadastrados dentro do ArrayList
        System.out.println(usuariosArr + "\n");
            
        //Adiciona mais um cadastro no contador
        store.atual = store.atual + 1;
    }
}
