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
    
    public Torre(int f,int c,int e){
        super(f,c,e);
    }
    
    @Override
    public String id(int e){
        if(e==0)
            return "TR ";
        return "TV ";
    }
    
}
