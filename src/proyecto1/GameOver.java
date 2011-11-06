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
    
    public static void Derrota(int turno){
        System.out.print("<<<<GAME OVER>>>>");
    }
}
