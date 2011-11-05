/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Torre extends Fichas{
    private boolean m1,ma,mb,m2;
    private int fma,fmb;
    
    
    public Torre(int f,int c,int e){
        super(f,c,e);  
    }
    
    @Override
    public String id(int e){
        if(e==0)
            return "TR";
        return "TV";
    }

    @Override
    public boolean valPosiblesmov(){
        Tablero.movimientos="Sus posibles movimientos son: ";
        cm1=buscarFrente(fila,columna,nemesis);
        if(cm1==columna){
            m1=false;
        }else{
            Tablero.movimientos+=" ("+(fila-8<0 ? (fila-8)*-1:fila-8)+","+(columna+2)+" - "+(cm1+1)+") ";
            m1=true;
        }
        fm1=buscarAtras(fila,columna,nemesis);
        if(fm1==columna){
            m2=false;
        }else{
            Tablero.movimientos+=" ("+(fila-8<0 ? (fila-8)*-1:fila-8)+","+columna+" - "+(fm1+1)+") ";
            m2=true;
        }
        
        fma=buscarArriba(fila,columna,nemesis);
        if(fma==fila){
            ma=false;
        }else{
            Tablero.movimientos+=" ("+(((fila-1)-8)<0 ? ((fila-1)-8)*-1:(fila-1)-8)+" - "+((fma-8)<0?(fma-8)*-1:(fma-8))+","+(columna+1)+") ";
            ma=true;
        }
        fmb=buscarAbajo(fila,columna,nemesis);
        System.out.println(fmb);
        if(fmb==fila){
            mb=false;
        }else{
            Tablero.movimientos+=" ("+(((fila+1)-8)<0 ? ((fila+1)-8)*-1:(fila+1)-8)+" - "+((fmb-8)<0 ?((fmb-8)*-1):(fmb-8))+","+(columna+1)+") ";
            mb=true;
        }
      
        if(m1==true || ma==true || mb==true || m2==true)
            return true;
        return false;
        
    }
    
    public int buscarFrente(int f,int c,char n){   
        if(General.validarFC(f+1,c+1+1)){
            if(Tablero.tabla[f][c+1].equals("--")){
                return buscarFrente(f,c+1,n);
            }else if(Tablero.tabla[f][c+1].charAt(1)==n){
                return c+1;
            }
        }
        return c;
    }
    public int buscarAtras(int f,int c,char n){
        if(General.validarFC(f+1,c+1-1)){
            if(Tablero.tabla[f][c-1].equals("--")){
                return buscarAtras(f,c-1,n);
            }else if(Tablero.tabla[f][c-1].charAt(1)==n){
                return c-1;
            }
        }
        return c;
    }
    public int buscarArriba(int f,int c,char n){
        if(General.validarFC(f+1-1,c+1)){
            if(Tablero.tabla[f-1][c].equals("--")){
                return buscarArriba(f-1,c,n);
            }else if(Tablero.tabla[f-1][c].charAt(1)==n){
                return f-1;
            }
        }
        return f;
    }
    public int buscarAbajo(int f,int c,char n){
        if(General.validarFC(f+1+1,c+1)){
            if(Tablero.tabla[f+1][c].equals("--")){
                return buscarAbajo(f+1,c,n);
            }else if(Tablero.tabla[f+1][c].charAt(1)==n){
                return f+1;
            }
        }        
        return f;
    }

    @Override
    public boolean mover(int f, int c) {
        boolean movido=false;
        if(General.validarFC(f, c)){
            int tf=(f-8<0 ? (f-8)*-1:f-8),tc=c-1;
            if(m1==true && tf==fila && tc>columna && tc<=cm1){
                Tablero.tabla[tf][tc]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(m2==true && tf==fila && tc<columna && tc>=fm1){
                Tablero.tabla[tf][tc]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(mb==true && tc==columna && tf>fila && tf<=fmb){
                Tablero.tabla[tf][tc]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }else if(ma==true && tc==columna && tf<fila && tf>=fma){
                Tablero.tabla[tf][tc]=id(bando);
                Tablero.tabla[fila][columna]="--";
                fila=tf;
                columna=tc;
                movido=true;
            }
        }
        return movido;
    }

    @Override
    public void variables() {
        
    }

    @Override
    public String nombreFicha() {
        return "Torre";
    }
    
    
}
