/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Rey extends Fichas {
    private boolean m1,m2,m3,m4,ml1,ml2,ml3,ml4,mele;
    private int fm2,cm2;
    
    
    
    public Rey(int f,int c,int e){
        super(f,c,e);
        fm1=fila+1;
        fm2=fila-1;
        cm1=columna+1;
        cm2=columna-1;
        mele=false;
        
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "RR";
        return "RV";
    }

    @Override
    public boolean valPosiblesmov() {
        Tablero.movimientos="Sus posibles movimientos son: ";
        if(General.validarFC(fila+1, cm1+1)){
            if(Tablero.tabla[fila][cm1].equals("--") || Tablero.tabla[fila][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fila-8<0 ? (fila-8)*-1:fila-8)+","+(cm1+1)+") ";
                m1=true;
            }else{
                m1=false;
            }
        }else{
            m1=false;
        }
        if(General.validarFC(fila+1,cm2+1)){
            if(Tablero.tabla[fila][cm2].equals("--") || Tablero.tabla[fila][cm2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fila-8<0 ? (fila-8)*-1:fila-8)+","+(cm2+1)+") ";
                m2=true;
            }else{
                m2=false;
            }
        }else{
            m2=false;
        }
        if(General.validarFC(fm1+1,columna+1)){
            if(Tablero.tabla[fm1][columna].equals("--") || Tablero.tabla[fm1][columna].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(columna+1)+") ";
                m3=true;
            }else{
                m3=false;
            }
        }else{
            m3=false;
        }
        if(General.validarFC(fm2+1,columna+1)){
            if(Tablero.tabla[fm2][columna].equals("--") || Tablero.tabla[fm2][columna].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm2-8<0 ? (fm2-8)*-1:fm2-8)+","+(columna+1)+") ";
                m4=true;
            }else{
                m4=false;
            }
        }else{
            m4=false;
        }
        if(General.validarFC(fm1+1,cm1+1)){
            if(Tablero.tabla[fm1][cm1].equals("--") || Tablero.tabla[fm1][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(cm1+1)+") ";
                ml1=true;
            }else{
                ml1=false;
            }
        }else{
            ml1=false;
        }
        if(General.validarFC(fm1+1,cm2+1)){
            if(Tablero.tabla[fm1][cm2].equals("--") || Tablero.tabla[fm1][cm2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm1-8<0 ? (fm1-8)*-1:fm1-8)+","+(cm2+1)+") ";
                ml2=true;
            }else{
                ml2=false;
            }
        }else{
            ml2=false;
        }
        if(General.validarFC(fm2+1,cm1+1)){
            if(Tablero.tabla[fm2][cm1].equals("--") || Tablero.tabla[fm2][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm2-8<0 ? (fm2-8)*-1:fm2-8)+","+(cm1+1)+") ";
                ml3=true;
            }else{
                ml3=false;
            }
        }else{
            ml3=false;
        }
        if(General.validarFC(fm2+1,cm2+1)){
            if(Tablero.tabla[fm2][cm2].equals("--") || Tablero.tabla[fm2][cm2].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fm2-8<0 ? (fm2-8)*-1:fm2-8)+","+(cm2+1)+") ";
                ml4=true;
            }else{
                ml4=false;
            }
        }else{
            ml4=false;
        }
        
        if(m1==true || m2==true || m3==true || m4==true || ml1==true || ml2==true || ml3==true || ml4==true || movL()){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean movL(){
        int lfm1=fila+1,lfm2=fila-1,lcm1=columna+2,lcm2=columna-2;
        int lfml1=fila+2,lfml2=fila-2,lcml1=columna+1,lcml2=columna-1;
        boolean lm1,lm2,lm3,lm4,lml1,lml2,lml3,lml4;
        System.out.print("(Rey) Sus posibles movimientos para L son: ");
        
        if(General.validarFC(lfm1+1, lcm1+1)){
            if(Tablero.tabla[lfm1][lcm1].equals("--") || Tablero.tabla[lfm1][lcm1].charAt(1)==nemesis){
                System.out.print(" ("+(lfm1-8<0 ? (lfm1-8)*-1:lfm1-8)+","+(lcm1+1)+") ");
                lm1=true;
            }else{
                lm1=false;
            }
        }else{
            lm1=false;
        }
        if(General.validarFC(lfm2+1,lcm1+1)){
            if(Tablero.tabla[lfm2][lcm1].equals("--") || Tablero.tabla[lfm2][lcm1].charAt(1)==nemesis){
                System.out.print(" ("+(lfm2-8<0 ? (lfm2-8)*-1:lfm2-8)+","+(lcm1+1)+") ");
                lm2=true;
            }else{
                lm2=false;
            }
        }else{
            lm2=false;
        }
        if(General.validarFC(lfm1+1,lcm2+1)){
            if(Tablero.tabla[lfm1][lcm2].equals("--") || Tablero.tabla[lfm1][lcm2].charAt(1)==nemesis){
                System.out.print(" ("+(lfm1-8<0 ? (lfm1-8)*-1:lfm1-8)+","+(lcm2+1)+") ");
                lm3=true;
            }else{
                lm3=false;
            }
        }else{
            lm3=false;
        }
        if(General.validarFC(lfm2+1,lcm2+1)){
            if(Tablero.tabla[lfm2][lcm2].equals("--") || Tablero.tabla[lfm2][lcm2].charAt(1)==nemesis){
                System.out.print(" ("+(lfm2-8<0 ? (lfm2-8)*-1:lfm2-8)+","+(lcm2+1)+") ");
                lm4=true;
            }else{
                lm4=false;
            }
        }else{
            lm4=false;
        }
        if(General.validarFC(lfml1+1,lcml1+1)){
            if(Tablero.tabla[lfml1][lcml1].equals("--") || Tablero.tabla[lfml1][lcml1].charAt(1)==nemesis){
                System.out.print(" ("+(lfml1-8<0 ? (lfml1-8)*-1:lfml1-8)+","+(lcml1+1)+") ");
                lml1=true;
            }else{
                lml1=false;
            }
        }else{
            lml1=false;
        }
        if(General.validarFC(lfml1+1,lcml2+1)){
            if(Tablero.tabla[lfml1][lcml2].equals("--") || Tablero.tabla[lfml1][lcml2].charAt(1)==nemesis){
                System.out.print(" ("+(lfml1-8<0 ? (lfml1-8)*-1:lfml1-8)+","+(lcml2+1)+") ");
                lml2=true;
            }else{
                lml2=false;
            }
        }else{
            lml2=false;
        }
        if(General.validarFC(lfml2+1,lcml1+1)){
            if(Tablero.tabla[lfml2][lcml1].equals("--") || Tablero.tabla[lfml2][lcml1].charAt(1)==nemesis){
                System.out.print(" ("+(lfml2-8<0 ? (lfml2-8)*-1:lfml2-8)+","+(lcml1+1)+") ");
               lml3=true;
            }else{
                lml3=false;
            }
        }else{
            lml3=false;
        }
        if(General.validarFC(lfml2+1,lcml2+1)){
            if(Tablero.tabla[lfml2][lcml2].equals("--") || Tablero.tabla[lfml2][lcml2].charAt(1)==nemesis){
                System.out.print(" ("+(lfml2-8<0 ? (lfml2-8)*-1:lfml2-8)+","+(lcml2+1)+") ");
                lml4=true;
            }else{
                lml4=false;
            }
        }else{
            lml4=false;
        }
        System.out.println("");
        
        if(lm1==true || lm2==true || lm3==true || lm4==true || lml1==true || lml2==true || lml3==true || lml4==true){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean mover(int f, int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
