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

    public Rey(int f,int c,int e){
        super(f,c,e);
    }
    
    @Override
    public String id(int e) {
        if(e==0)
            return "RR ";
        return "RV ";
    }
    
}
