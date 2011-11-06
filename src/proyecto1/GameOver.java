/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Armin
 */

public class GameOver {
    public static String text;
    
    
    public static boolean rendirse(){
        char select=0;
        do{
            System.out.print("Realmente desea desertar del juego (s/n): ");
            select=principal.lea.next().charAt(0);
        }while(select!='s' && select!='S' && select!='n' && select!='N');
        if(select=='s' || select=='S'){
            return true;
        }else{
            return false;
        }
    }
    
    public static String Derrota(int turno,int tipo){
        System.out.println("\n");
        System.out.println("<<<<GAME OVER>>>>");
        if(tipo==0){
            if(turno==0){
                text="EL JUGADOR 2: "+Jugadores.jugadorverde+" HA ¡TRIUNFADO!, POR RENDICION DEL JUGADOR 1: "+Jugadores.jugadorrojo;
            }else{
                text="EL JUGADOR 1: "+Jugadores.jugadorrojo+" HA ¡TRIUNFADO!, POR RENDICION DEL JUGADOR 2: "+Jugadores.jugadorverde;
            }
        }else{
            if(turno==0){
                text="EL JUGADOR 2: "+Jugadores.jugadorverde+" HA ¡TRIUNFADO!, SE COMIO AL REY Y A "+(Fichas.contarMuertes-1)+" PIEZAS MAS DEL JUGADOR 1: "+Jugadores.jugadorrojo;
            }else{
                text="EL JUGADOR 1: "+Jugadores.jugadorrojo+" HA ¡TRIUNFADO!, SE COMIO AL REY Y A "+(Fichas.contarMuertes2-1)+" PIEZAS MAS DEL JUGADOR 2: "+Jugadores.jugadorrojo;
            }
        }
        System.out.println(text);
        return text;
    }
}
