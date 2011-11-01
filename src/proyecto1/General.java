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
    
    public static void menuPrincipal(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1.- JUGAR CHATURANGA!");
        System.out.println("2.- ESTADISTICAS DEL JUEGO");
        System.out.println("3.- SALIR");
        System.out.println("");
    }
    
    public static boolean validarMenu(char s){
        if(s!='1' && s!='2' && s!='3'){
            System.out.println("");
            System.out.println("<<<LA OPCION INGRESADA ES INCORRECTA>>>");
            menuPrincipal();
            return true;
        }
        return false;
    }
    
    public static boolean validarFC(int fmov,int cmov){
        if(fmov-1>=8 || cmov-1>=8 || fmov-1<0 || cmov-1<0){
            return false;
        }else{
            return true;
        }        
    }
    
}
