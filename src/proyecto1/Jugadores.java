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
    public String nombre1;
    public String nombre2;
    public static int contador=0;
    public static String jugadorrojo;
    public static String jugadorverde;
    public static int difpiezas=0;
    
    public Jugadores(String n1,String n2){
        nombre1=n1;
        nombre2=n2;
        contador++;
        jugadorrojo = n1;
        jugadorverde = n2;
        
    }
    
    public void setNombre1(String n){
        nombre1=n;
    }
    
    public void setNombre2(String n){
        nombre2=n;
    }
    
    public static int DifPiezas(int turno){
        if(turno == 0){
            difpiezas = (16-Fichas.contarMuertes)-(16-Fichas.contarMuertes2);
                if(difpiezas > 0){
                    return difpiezas;
                }else{
                    return difpiezas * -1;
                }    
        }else{
            difpiezas = (16-Fichas.contarMuertes2)-(16-Fichas.contarMuertes);
                if(difpiezas > 0){
                    return difpiezas;
                }else{
                    return difpiezas * -1;
                }
        }
    }    
    public void ImprimirStats(int turno){
            GameOver.Derrota(turno);
        }   
    }
        
    


