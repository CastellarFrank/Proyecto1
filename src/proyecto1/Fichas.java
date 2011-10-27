/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public abstract class Fichas {
           
    public Fichas(int f,int c,int e){
        Tablero.tabla[f][c]=id(e);
    }
    
    public abstract String id(int e);
    public void movimiento(){
        
    }
}
