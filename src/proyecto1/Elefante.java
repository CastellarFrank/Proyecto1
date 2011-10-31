/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Elefante extends Fichas {

    public Elefante(int f,int c,int e){
        super(f,c,e);
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "ER";
        return "EV";
    }

    @Override
    public boolean valPosiblesmov() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
