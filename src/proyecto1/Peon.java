/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Peon extends Fichas{
    private int fkill1,ckill1,fkill2,ckill2;
    private boolean kill1,kill2,mov1;
    
    
    public Peon(int f,int c,int e){
        super(f,c,e);        
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "PR";
        return "PV";
    }
    
    
    @Override
    public boolean valPosiblesmov(){
        variables();
        Tablero.movimientos="Sus posibles movimientos son: ";
        if(General.validarFC(fm1+1,cm1+1)){
            if(Tablero.tabla[fm1][cm1].equals("--")){
                mov1=true;
                Tablero.movimientos+=" ("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(cm1+1)+") ";
            }else{
                mov1=false;
            }
        }else{
            mov1=false;
        }
        
        if(General.validarFC(fkill1+1,ckill1+1)){
            if(Tablero.tabla[fkill1][ckill1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fkill1-8<0 ? (fkill1-8)*-1:fkill1-8)+","+(ckill1+1)+") ";
                kill1=true;            
            }else{
                kill1=false;
            }
        }else{
            kill1=false;
        }
        if(General.validarFC(fkill2+1,ckill2+1)){
            if(Tablero.tabla[fkill2][ckill2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fkill2-8<0 ? (fkill2-8)*-1:fkill2-8)+","+(ckill2+1)+") ";
                kill2=true;
            }else{
                kill2=false;
            }
        }else{
            kill2=false;
        }
        
        if(mov1==true || kill1==true || kill2==true){
            return true;
        }else{
            return false;
        }
            
    }

    @Override
    public boolean mover(int f, int c) {
        boolean movido=false;
        if(General.validarFC(f,c)){
            int tf=(f-8<0 ? (f-8)*-1:f-8),tc=c-1;
            if(fkill1==tf && ckill1==tc && kill1==true){
                Tablero.tabla[fkill1][ckill1]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=fkill1;
                columna=ckill1;
                movido=true;
            }else if(fkill2==tf && ckill2==tc && kill2==true){
                Tablero.tabla[fkill2][ckill2]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=fkill2;
                columna=ckill2;
                movido=true;
            }else if(fm1==tf && cm1==tc && mov1==true){
                Tablero.tabla[fm1][cm1]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=fm1;
                columna=cm1;
                movido=true;
            }
        }
        return movido;
    }

    @Override
    public void variables() {
        if(bando==0){
            fkill1=fila+1;
            ckill1=columna+1;
            fkill2=fila-1;
            ckill2=columna+1;
            fm1=fila;
            cm1=columna+1;
        }else{
            fkill1=fila-1;
            ckill1=columna-1;
            fkill2=fila+1;
            ckill2=columna-1;
            fm1=fila;
            cm1=columna-1;
        }
    }

    @Override
    public String nombreFicha() {
        return "Peon";
    }
    
    
}
