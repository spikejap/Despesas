package despesas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i111057
 */
public class Despesa {
    int valor;
    String descricao;
    
    public Despesa(int v, String d)
    {
        valor=v;
        descricao=d;
    }
    
    public Despesa Create(int v, String d)
    {
        Despesa a = new Despesa(v, d);
        return a;    
    }
}
