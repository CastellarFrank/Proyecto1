/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Jugadores {
    private String nombre1;
    private String nombre2;
    public static int contador=0;
    
    public Jugadores(String n1,String n2){
        nombre1=n1;
        nombre2=n2;
        contador++;
        
    }
    
    public void setNombre1(String n){
        nombre1=n;
    }
    
    public void setNombre2(String n){
        nombre2=n;
    }
}
