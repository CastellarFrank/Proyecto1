/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Caballo extends Fichas{
   private int fm2,cm2,fml1,cml1,fml2,cml2;
   private boolean m1,m2,m3,m4,ml1,ml2,ml3,ml4;
           
   public Caballo(int f,int c,int e){
        super(f,c,e);
        fm1=fila+1;
        fm2=fila-1;
        cm1=columna+2;
        cm2=columna-2;
        fml1=fila+2;
        fml2=fila-2;
        cml1=columna+1;
        cml2=columna-1;
        
    }
   
    @Override
    public String id(int e) {
        if(e==0)
            return "CR";
        return"CV";
    }

    @Override
    public boolean valPosiblesmov() {
        System.out.print("Sus posibles movimientos son: ");
        if(General.validarFC(fm1+1, cm1+1)){
            if(Tablero.tabla[fm1][cm1].equals("--") || Tablero.tabla[fm1][cm1].charAt(1)==nemesis){
                System.out.print("-("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(cm1+1)+") ");
                m1=true;
            }else{
                m1=false;
            }
        }else{
            m1=false;
        }
        if(General.validarFC(fm2+1,cm1+1)){
            if(Tablero.tabla[fm2][cm1].equals("--") || Tablero.tabla[fm2][cm1].charAt(1)==nemesis){
                System.out.print("-("+(fm2-8<0 ? (fm2-8)*-1:fm2-8)+","+(cm1+1)+") ");
                m2=true;
            }else{
                m2=false;
            }
        }else{
            m2=false;
        }
        if(General.validarFC(fm1+1,cm2+1)){
            if(Tablero.tabla[fm1][cm2].equals("--") || Tablero.tabla[fm1][cm2].charAt(1)==nemesis){
                System.out.print("-("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(cm2+1)+") ");
                m3=true;
            }else{
                m3=false;
            }
        }else{
            m3=false;
        }
        if(General.validarFC(fm2+1,cm2+1)){
            if(Tablero.tabla[fm2][cm2].equals("--") || Tablero.tabla[fm2][cm2].charAt(1)==nemesis){
                System.out.print("-("+(fm2-8<0 ? (fm2-8)*-1:fm2-8)+","+(cm2+1)+") ");
                m4=true;
            }else{
                m4=false;
            }
        }else{
            m4=false;
        }
        if(General.validarFC(fml1+1,cml1+1)){
            if(Tablero.tabla[fml1][cml1].equals("--") || Tablero.tabla[fml1][cml1].charAt(1)==nemesis){
                System.out.print("-("+(fml1-8<0 ? (fml1-8)*-1:fml1-8)+","+(cml1+1)+") ");
                ml1=true;
            }else{
                ml1=false;
            }
        }else{
            ml1=false;
        }
        if(General.validarFC(fml1+1,cml2+1)){
            if(Tablero.tabla[fml1][cml2].equals("--") || Tablero.tabla[fml1][cml2].charAt(1)==nemesis){
                System.out.print("-("+(fml1-8<0 ? (fml1-8)*-1:fml1-8)+","+(cml2+1)+") ");
                ml2=true;
            }else{
                ml2=false;
            }
        }else{
            ml2=false;
        }
        if(General.validarFC(fml2+1,cml1+1)){
            if(Tablero.tabla[fml2][cml1].equals("--") || Tablero.tabla[fml2][cml1].charAt(1)==nemesis){
                System.out.print("-("+(fml2-8<0 ? (fml2-8)*-1:fml2-8)+","+(cml1+1)+") ");
                ml3=true;
            }else{
                ml3=false;
            }
        }else{
            ml3=false;
        }
        if(General.validarFC(fml2+1,cml2+1)){
            if(Tablero.tabla[fml2][cml2].equals("--") || Tablero.tabla[fml2][cml2].charAt(1)==nemesis){
                System.out.print("-("+(fml2-8<0 ? (fml2-8)*-1:fml2-8)+","+(cml2+1)+") ");
                ml4=true;
            }else{
                ml4=false;
            }
        }else{
            ml4=false;
        }
        if(m1==true || m2==true || m3==true || m4==true || ml1==true || ml2==true || ml3==true || ml4==true){
            return true;
        }else{
            return false;
        }
    }
    
}
