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
    public int difpiezas;
    
    
    public void Derrota(int turno){
        System.out.print("<<<<GAME OVER>>>>");
        if(turno == 0){
            difpiezas = (16-Fichas.contarMuertes)-(16-Fichas.contarMuertes2);
                if(difpiezas < 0){
                    difpiezas = difpiezas * -1;
                }
            System.out.print("EL Jugador 1: "+Jugadores.jugadorrojo+" HA ¡TRIUNFADO! SE COMIO AL REY Y A "+difpiezas+" Piezas Mas del Jugador 2: "+Jugadores.jugadorverde);
        }else{
            difpiezas = (16-Fichas.contarMuertes2)-(16-Fichas.contarMuertes);
                if(difpiezas < 0){
                    difpiezas = difpiezas * -1;
                }
             System.out.print("EL Jugador 2: "+Jugadores.jugadorverde+" HA ¡TRIUNFADO! SE COMIO AL REY Y A "+difpiezas+" Piezas Mas del Jugador 1: "+Jugadores.jugadorrojo);
        }
    }
    
    
    
   
}
