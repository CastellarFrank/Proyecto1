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
           
   public Caballo(int f,int c,int e){
        super(f,c,e);
        fm1=fila+1;
        fm2=fila-1;
        cm1=columna+3;
        cm2=columna-3;
        fml1=fila+3;
        fml2=fila-3;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
