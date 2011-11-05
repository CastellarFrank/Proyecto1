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
    
    
    
    public static void Derrota(int turno){
        System.out.print("<<<<GAME OVER>>>>");
        if(turno == 0){
            
            System.out.print("EL Jugador 1: "+Jugadores.jugadorrojo+" HA ¡TRIUNFADO! SE COMIO AL REY Y A "+Jugadores.difpiezas+" Piezas Mas del Jugador 2: "+Jugadores.jugadorverde);
       
        }else{
            
             System.out.print("EL Jugador 2: "+Jugadores.jugadorverde+" HA ¡TRIUNFADO! SE COMIO AL REY Y A "+Jugadores.difpiezas+" Piezas Mas del Jugador 1: "+Jugadores.jugadorrojo);
        }
    }
}
