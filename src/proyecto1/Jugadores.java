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
    public static int contador=0;
    public static String jugadorrojo;
    public static String jugadorverde;
    public String Victoria;
    
    public Jugadores(String n1,String n2){
            contador++;
            jugadorrojo = n1;
            jugadorverde = n2; 
          
    }
        
    public void setVictoria(String v){
        Victoria=v;       
    }
}

        
    


