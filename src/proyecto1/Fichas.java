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
    public int fila;
    public int columna;
    public int bando;
    
            
    public Fichas(int f,int c,int e){
        Tablero.tabla[f][c]=id(e);
        fila=f;
        columna=c;
        bando=e;
    }
    
    public abstract String id(int e);
    
    public void movimiento(){        
    }
}
