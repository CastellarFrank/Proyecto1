/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author NIGHTMARE
 */
public class General {
    private Scanner lea=new Scanner(System.in);
    
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
    public boolean validarFC(int n){
        if(n-1>=8 || n-1<0){
            System.out.println("<<<Ha ingresado una posicion invalida>>>");
            return true;
        }else{
            return false;
        }
    }
    public boolean validarFC(int fmov,int cmov){
        if(fmov-1>=8 || cmov-1>=8 || fmov-1<0 || cmov-1<0){
            System.out.println(">>>La posicion ingresada es invalida<<<");
            return false;
        }else{
            return true;
        }        
    }
    
}
