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
        
        if(turno==0){
            System.out.println("");
            System.out.println("<<<MUEVEN LAS ROJAS>>>");
        }else{
            System.out.println("");
            System.out.println("<<<MUEVEN LAS VERDES>>>");
        }
    }
    
    public void colocarFichas(){
        
    }
}
