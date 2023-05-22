
/**
 * IArmazenador interface para armazenadores.
 * 
 * @author Grupo Pedro
 * @version 2023
 */

public interface IArmazenador { 
    public void adicionar(Object a);
    public Object remover(int i);
    public boolean estaVazia();
    public Object buscar (int i);
    public int getQtd();
}

