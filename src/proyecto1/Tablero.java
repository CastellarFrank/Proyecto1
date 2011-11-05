/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Tablero{
    public static String movimientos;
    public static String reyl;
    public static String tabla[][]=new String[8][8];
    private static String pwned;
    
    public static void iniciarTabla(){
        for(int i=0;i<tabla.length;i++){
            for(int e=0;e<tabla[i].length;e++){
                if(tabla[i][e]==null){
                    tabla[i][e]="--";
                }
            }
        }
        
    }
    
    private static void imprimirTabla(int turno){
        System.out.print(" ");
        for(int i=0;i<tabla.length;i++){
            System.out.print(" "+(i+1)+" ");
        }
        System.out.print("\n");
        for(int i=0;i<tabla.length;i++){
            System.out.print((tabla.length-(i)+" "));
            for(int e=0;e<tabla[i].length;e++){
                System.out.print(tabla[i][e]);
                System.out.print(" ");
            }
            System.out.print((tabla.length-(i)));
            System.out.print("\n");
        }
        System.out.print(" ");
        for(int i=0;i<tabla.length;i++){
            System.out.print(" "+(i+1)+" ");
        }        
    }
    
    public static void quienMueve(int turno){
        if(turno==0){
            System.out.println("\n  <<<MUEVEN LAS ROJAS>>>");
        }else{
            System.out.println("\n  <<<MUEVEN LAS VERDES>>>");
        }
    }
    public static void mensajes(int error){
        if(error==1){
            System.out.print("\n>>>Error, La posicion ingresada no existe en el tablero<<<");
        }else if(error==2){
            System.out.print("\n>>>Error, La posicion seleccionada esta vacia, o ha seleccionado una ficha del contrario<<<");
        }else if(error==3){
            System.out.print("\n<<<Error, la ficha no tiene ningun movimiento posible>>>");
        }else if(error==4){
            System.out.print("<<<\nError, no es posible mover la ficha a la posicion ingresada>>>");
        }
    }
    public static void movs(boolean t,int b){
        if(t){
            System.out.print(movimientos+"\n");
            if((b==0?Rey.mele==false: Rey.mele2==false) && reyl!=null){
                System.out.print(reyl+"\n");
                reyl=null;
            }
        }
    }
    public static void comido(String matador, String matado,int bando){
        pwned="El "+matador+(bando==0?" Rojo del jugador ":" Verde del jugador ")+(bando==0 ? Jugadores.jugadorrojo:Jugadores.jugadorverde)+
                           " ha aniquilado al "+matado+(bando==0?" Verde del jugador ":" Rojo del jugador ")+(bando==0 ? Jugadores.jugadorverde: Jugadores.jugadorrojo);
        principal.kill=true;
    }
    public static void pwned(boolean p){
        if(p)
            System.out.print("\n"+pwned);                
    }
   public static void imprimirTodo(int turno,boolean kill,int errorP,boolean movs){
        imprimirTabla(turno);
        pwned(kill);
        mensajes(errorP);
        quienMueve(turno);
        movs(movs,turno);
    }
    
    
}
