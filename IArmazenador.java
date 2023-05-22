
/**
 * Escreva a descrição da interface IMenuArrayList aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface IArmazenador
{
    public void adicionarUsuarioAlunoArrayList(String nomeRec, String raRec, String serieRec, idadeRec);     
    public boolean estaVaziaArrayList();
    public void buscarUsuarioArrayList(String ra);
    public void removerUsuarioArrayList(String ra);
}
