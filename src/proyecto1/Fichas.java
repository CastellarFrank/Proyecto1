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
    public int fm1,cm1;
    public char nemesis;
            
    public Fichas(int f,int c,int e){
        Tablero.tabla[f][c]=id(e);
        fila=f;
        columna=c;
        bando=e;
        if(bando==0){
            nemesis='V';
        }else{
            nemesis='R';
        }
    }
    
    public abstract String id(int e);
    
    public void movimiento(int fmov,int cmov){
        Tablero.tabla[fila][columna]="--";
        fila=fmov;
        columna=cmov;
    }
    public abstract boolean valPosiblesmov();
        
}
