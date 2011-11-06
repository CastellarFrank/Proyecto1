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
    public static boolean reySelect=false;
    private boolean m1,m2,m3,m4,ml1,ml2,ml3,ml4;
    public static boolean mele,mele2;
    private int fm2,cm2;
    
    private int lfm1,lfm2,lcm1,lcm2;
    private int lfml1,lfml2,lcml1,lcml2;
    private boolean lm1,lm2,lm3,lm4,lml1,lml2,lml3,lml4;
    
    
    
    public Rey(int f,int c,int e){
        super(f,c,e);
        mele=false;    
        mele2=false;
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "RR";
        return "RV";
    }

    @Override
    public boolean valPosiblesmov() {
        variables();
        reySelect=true;
        Tablero.movimientos="Sus posibles movimientos son: ";
        if(General.validarFC(fila+1, cm1+1)){
            if(Tablero.tabla[fila][cm1].equals("--") || Tablero.tabla[fila][cm1].charAt(1)==nemesis){
                Tablero.movimientos+=" ("+(fila-8<0 ? (fila-8)*-1:fila-8)+","+(cm1+1)+") ";
                m1=true;
                Tablero.verificarAmenaza(fila, cm1, bando);
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
                Tablero.verificarAmenaza(fila, cm2, bando);
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
                Tablero.verificarAmenaza(fm1, columna, bando);
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
                Tablero.verificarAmenaza(fm2, columna, bando);
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
                Tablero.verificarAmenaza(fm1, cm1, bando);
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
                Tablero.verificarAmenaza(fm1, cm2, bando);
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
                Tablero.verificarAmenaza(fm2, cm1, bando);
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
                Tablero.verificarAmenaza(fm2, cm2, bando);
            }else{
                ml4=false;
            }
        }else{
            ml4=false;
        }
        
        if(((bando==0 ? mele==false : mele2==false) ? movL():false) || m1==true || m2==true || m3==true || m4==true || ml1==true || ml2==true || ml3==true || ml4==true){
            return true;
        }else{
            return false;
        }
    }
    
    
    private boolean movL(){
        variablesL();
        Tablero.reyl="(Rey) Los posibles movimientos en forma de L son: ";
        if((bando==0?mele==false:mele2==false) && (bando==0?principal.reyAmenazado==false:principal.reyAmenazado2==false)){
            if(General.validarFC(lfm1+1, lcm1+1)){
                if(Tablero.tabla[lfm1][lcm1].equals("--") || Tablero.tabla[lfm1][lcm1].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfm1-8<0 ? (lfm1-8)*-1:lfm1-8)+","+(lcm1+1)+") ";
                    lm1=true;
                    Tablero.verificarAmenaza(lfm1, lcm1, bando);
                }else{
                    lm1=false;
                }
            }else{
                lm1=false;
            }
            if(General.validarFC(lfm2+1,lcm1+1)){
                if(Tablero.tabla[lfm2][lcm1].equals("--") || Tablero.tabla[lfm2][lcm1].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfm2-8<0 ? (lfm2-8)*-1:lfm2-8)+","+(lcm1+1)+") ";
                    lm2=true;
                    Tablero.verificarAmenaza(lfm2, lcm1, bando);
                }else{
                    lm2=false;
                }
            }else{
                lm2=false;
            }
            if(General.validarFC(lfm1+1,lcm2+1)){
                if(Tablero.tabla[lfm1][lcm2].equals("--") || Tablero.tabla[lfm1][lcm2].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfm1-8<0 ? (lfm1-8)*-1:lfm1-8)+","+(lcm2+1)+") ";
                    lm3=true;
                    Tablero.verificarAmenaza(lfm1, lcm2, bando);
                }else{
                    lm3=false;
                }
            }else{
                lm3=false;
            }
            if(General.validarFC(lfm2+1,lcm2+1)){
                if(Tablero.tabla[lfm2][lcm2].equals("--") || Tablero.tabla[lfm2][lcm2].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfm2-8<0 ? (lfm2-8)*-1:lfm2-8)+","+(lcm2+1)+") ";
                    lm4=true;
                    Tablero.verificarAmenaza(lfm2, lcm2, bando);
                }else{
                    lm4=false;
                }
            }else{
                lm4=false;
            }
            if(General.validarFC(lfml1+1,lcml1+1)){
                if(Tablero.tabla[lfml1][lcml1].equals("--") || Tablero.tabla[lfml1][lcml1].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfml1-8<0 ? (lfml1-8)*-1:lfml1-8)+","+(lcml1+1)+") ";
                    lml1=true;
                    Tablero.verificarAmenaza(lfml1, lcml1, bando);
                }else{
                    lml1=false;
                }
            }else{
                lml1=false;
            }
            if(General.validarFC(lfml1+1,lcml2+1)){
                if(Tablero.tabla[lfml1][lcml2].equals("--") || Tablero.tabla[lfml1][lcml2].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfml1-8<0 ? (lfml1-8)*-1:lfml1-8)+","+(lcml2+1)+") ";
                    lml2=true;
                    Tablero.verificarAmenaza(lfml1, lcml2, bando);
                }else{
                    lml2=false;
                }
            }else{
                lml2=false;
            }
            if(General.validarFC(lfml2+1,lcml1+1)){
                if(Tablero.tabla[lfml2][lcml1].equals("--") || Tablero.tabla[lfml2][lcml1].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfml2-8<0 ? (lfml2-8)*-1:lfml2-8)+","+(lcml1+1)+") ";
                   lml3=true;
                   Tablero.verificarAmenaza(lfml2, lcml1, bando);
                }else{
                    lml3=false;
                }
            }else{
                lml3=false;
            }
            if(General.validarFC(lfml2+1,lcml2+1)){
                if(Tablero.tabla[lfml2][lcml2].equals("--") || Tablero.tabla[lfml2][lcml2].charAt(1)==nemesis){
                    Tablero.reyl+=" ("+(lfml2-8<0 ? (lfml2-8)*-1:lfml2-8)+","+(lcml2+1)+") ";
                    lml4=true;
                    Tablero.verificarAmenaza(lfml2, lcml2, bando);
                }else{
                    lml4=false;
                }
            }else{
                lml4=false;
            }
            System.out.println("");
        }
        if(lm1==true || lm2==true || lm3==true || lm4==true || lml1==true || lml2==true || lml3==true || lml4==true){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean mover(int f, int c) {
        reySelect=false;
        boolean movido=false;
        if(General.validarFC(f, c)){
            int tf=(f-8<0 ? (f-8)*-1:f-8),tc=c-1;
            if(m1==true && fila==tf && cm1==tc){
                Tablero.tabla[fila][cm1]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(m2==true && fila==tf && cm2==tc){
                Tablero.tabla[fila][cm2]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(m3==true && fm1==tf && columna==tc){
                Tablero.tabla[fm1][columna]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(m4==true && fm2==tf && columna==tc){
                Tablero.tabla[fm2][columna]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(ml1==true && fm1==tf && cm1==tc){
                Tablero.tabla[fm1][cm1]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(ml2==true && fm1==tf && cm2==tc){
                Tablero.tabla[fm1][cm2]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(ml3==true && fm2==tf && cm1==tc){
                Tablero.tabla[fm2][cm1]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(ml4==true && fm2==tf && cm2==tc){
                Tablero.tabla[fm2][cm2]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if((bando==0?mele==false:mele2==false) && (bando==0?principal.reyAmenazado==false:principal.reyAmenazado2==false)){
                    if(lm1==true && lfm1==tf && lcm1==tc){
                    Tablero.tabla[lfm1][lcm1]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    columna=tc;
                    fila=tf;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }

                    movido=true;
                }else if(lm2==true && lfm2==tf && lcm1==tc){
                    Tablero.tabla[lfm2][lcm1]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    columna=tc;
                    fila=tf;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lm3==true && lfm1==tf && lcm2==tc){
                    Tablero.tabla[lfm1][lcm2]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lm4==true && lfm2==tf && lcm2==tc){
                    Tablero.tabla[lfm2][lcm2]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lml1==true && lfml1==tf && lcml1==tc){
                    Tablero.tabla[lfml1][lcml1]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lml2==true && lfml1==tf && lcml2==tc){
                    Tablero.tabla[lfml1][lcml2]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lml3==true && lfml2==tf && lcml1==tc){
                    Tablero.tabla[lfml2][lcml1]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }else if(lml4==true && lfml2==tf && lcml2==tc){
                    Tablero.tabla[lfml2][lcml2]=id(bando);
                    Tablero.tabla[fila][columna]="--";
                    fila=tf;
                    columna=tc;
                    if(bando==0){
                        mele=true;
                    }else{
                        mele2=true;
                    }
                    movido=true;
                }
            }
        }   
        return movido;
    }

    @Override
    public void variables() {
        fm1=fila+1;
        fm2=fila-1;
        cm1=columna+1;
        cm2=columna-1;
        
    }
    public void variablesL(){
        lfm1=fila+1;
        lfm2=fila-1;
        lcm1=columna+2;
        lcm2=columna-2;
        lfml1=fila+2;
        lfml2=fila-2;
        lcml1=columna+1;
        lcml2=columna-1;
    }

    @Override
    public String nombreFicha() {
        return "Rey";
    }
    
}
