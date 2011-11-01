/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author NIGHTMARE
 */
public class Tablero {
    public static String movimientos;
    public static String tabla[][]=new String[8][8];
    
    
    
    public void iniciarTabla(){
        for(int i=0;i<tabla.length;i++){
            for(int e=0;e<tabla[i].length;e++){
                if(tabla[i][e]==null){
                    tabla[i][e]="--";
                }
            }
        }
        
    }
    
    public static void imprimirTabla(int turno){
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
        }else if(error==5){
            System.out.print("\n"+movimientos);
        }
    }
}
