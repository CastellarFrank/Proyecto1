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
    public boolean dead;
    public static int contarMuertes=0;
    public static int contarMuertes2=0;
    
    public Fichas(int f,int c,int e){
        Tablero.tabla[f][c]=id(e);
        dead=false;
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
    
    public abstract String nombreFicha();
    
    public abstract boolean valPosiblesmov();
    
    
    public abstract boolean mover(int f,int c);
    
    public abstract void variables();
    
    public final void muerto(){
        if(bando == 0){
            contarMuertes++;
        }else{
            contarMuertes2++;
        }
        dead=true;
        fila=-1000001;
        columna=-1000001;
    }
}
