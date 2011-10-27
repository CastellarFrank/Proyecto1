/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class General {
    
    
    public void menuPrincipal(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1.- JUGAR CHATURANGA!");
        System.out.println("2.- ESTADISTICAS DEL JUEGO");
        System.out.println("3.- SALIR");
        System.out.println("");
    }
    
    public boolean validarMenu(char s){
        if(s!='1' && s!='2' && s!='3'){
            System.out.println("");
            System.out.println("<<<LA OPCION INGRESADA ES INCORRECTA>>>");
            this.menuPrincipal();
            return true;
        }
        return false;
    }
}
