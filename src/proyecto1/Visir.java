/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Visir extends Fichas {
    private int fm2,cm2;
    private boolean m1,m2,m3,m4;
    public Visir(int f,int c,int e){
        super(f,c,e);
        fm1=fila+1;
        fm2=fila-1;
        cm1=columna+1;
        cm2=columna-1;
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "VR";
        return"VV";
                   
    }

    @Override
    public boolean valPosiblesmov() {
        Tablero.movimientos="Sus movimientos posibles son: ";
        if(General.validarFC(fm1+1, cm1+1)){
            if(Tablero.tabla[fm1][cm1].equals("--") || Tablero.tabla[fm1][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm1-8<0?(fm1-8)*-1:fm1-8)+","+(cm1+1)+") ";
                m1=true;
            }else{
                m1=false;
            }
        }else{
            m1=false;
        }
        if(General.validarFC(fm1+1, cm2+1)){
            if(Tablero.tabla[fm1][cm2].equals("--") || Tablero.tabla[fm1][cm2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm1-8<0?(fm1-8)*-1:fm1-8)+","+(cm2+1)+") ";
                m2=true;
            }else{
                m2=false;
            }
        }else{
            m2=false;
        }
        if(General.validarFC(fm2+1, cm1+1)){
            if(Tablero.tabla[fm2][cm1].equals("--") || Tablero.tabla[fm2][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm2-8<0?(fm2-8)*-1:fm2-8)+","+(cm1+1)+") ";
                m3=true;
            }else{
                m3=false;
            }
        }else{
            m3=false;
        }
        if(General.validarFC(fm2+1, cm2+1)){
            if(Tablero.tabla[fm2][cm2].equals("--") || Tablero.tabla[fm2][cm2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm2-8<0?(fm2-8)*-1:fm2-8)+","+(cm2+1)+") ";
                m4=true;
            }else{
                m4=false;
            }
        }else{
            m4=false;
        }
        
        if(m1==true || m2==true || m3==true || m4==true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean mover(int f,int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
