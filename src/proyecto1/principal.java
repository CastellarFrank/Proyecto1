/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author NIGHTMARE
 */
class principal{
    
    /**
     * @param args the command line arguments
     */
    public static Fichas fichas[][]=new Fichas[2][16];
    
    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Jugadores jugadores[]=new Jugadores[10];
        Tablero tablero=new Tablero();
        
        
        int turno=0,fmov,cmov,errorP;
        String nombre1,nombre2;
        char menu;
        
        while(true){
            General.menuPrincipal();
            
            do{
                System.out.print("Ingrese la opcion que desea realizar (1/2/3): ");
                menu=lea.next().charAt(0);
            }while(General.validarMenu(menu));
            
            if(menu=='1'){
                           
                fichas[0][0]=new Torre(0,0,0);fichas[0][1]=new Caballo(1,0,0);fichas[0][2]=new Elefante(2,0,0);fichas[0][3]=new Visir(3,0,0);
                fichas[0][4]=new Rey(4,0,0);fichas[0][5]=new Elefante(5,0,0);fichas[0][6]=new Caballo(6,0,0);fichas[0][7]=new Torre(7,0,0);
                fichas[0][8]=new Peon(0,1,0);fichas[0][9]=new Peon(1,1,0);fichas[0][10]=new Peon(2,1,0);fichas[0][11]=new Peon(3,1,0);
                fichas[0][12]=new Peon(4,1,0);fichas[0][13]=new Peon(5,1,0);fichas[0][14]=new Peon(6,1,0);fichas[0][15]=new Peon(7,1,0);
                fichas[1][0]=new Torre(0,7,1);fichas[1][1]=new Caballo(1,7,1);fichas[1][2]=new Elefante(2,7,1);fichas[1][3]=new Rey(3,7,1);
                fichas[1][4]=new Visir(4,7,1);fichas[1][5]=new Elefante(5,7,1);fichas[1][6]=new Caballo(6,7,1);fichas[1][7]=new Torre(7,7,1);
                fichas[1][8]=new Peon(0,6,1);fichas[1][9]=new Peon(1,6,1);fichas[1][10]=new Peon(2,6,1);fichas[1][11]=new Peon(3,6,1);
                fichas[1][12]=new Peon(4,6,1);fichas[1][13]=new Peon(5,6,1);fichas[1][14]=new Peon(6,6,1);fichas[1][15]=new Peon(7,6,1);

                System.out.println("");
                System.out.print("Ingrese el nombre del jugador 1: ");
                nombre1=lea.next();
                System.out.print("Ingrese el nombre del jugador 2: ");
                nombre2=lea.next();

                jugadores[Jugadores.contador]=new Jugadores(nombre1,nombre2);

                tablero.iniciarTabla();
                errorP=0;
                boolean movs=false;
                do{
                    
                    Tablero.imprimirTabla(turno);
                    Tablero.mensajes(errorP);
                    Tablero.quienMueve(turno);
                    Tablero.movs(movs,turno);              
                    System.out.print("Ingrese la fila donde se ENCUENTRA la ficha a mover: ");
                    fmov=lea.nextInt();                           
                    System.out.print("Ingrese la columna donde se ENCUENTRA la ficha a mover: ");
                    cmov=lea.nextInt();
                    if(General.validarFC(fmov,cmov)){
                        int tf=fmov-8,tc=cmov-1;
                        for(int e=0;e<fichas[turno].length;e++){
                              if(fichas[turno][e].dead==false && fichas[turno][e].columna==tc && fichas[turno][e].fila==(tf<0 ? tf*-1:tf)){
                                  if(fichas[turno][e].valPosiblesmov()){
                                        movs=true;
                                        errorP=0;                                            
                                        Tablero.imprimirTabla(turno);
                                        Tablero.mensajes(errorP);
                                        Tablero.quienMueve(turno);
                                        Tablero.movs(movs,turno);
                                        System.out.print("Ingrese la fila a donde desea MOVER la ficha: ");
                                        fmov=lea.nextInt();
                                        System.out.print("Ingrese la columna a donde desea MOVER la ficha: ");
                                        cmov=lea.nextInt();
                                        if(!fichas[turno][e].mover(fmov,cmov)){
                                            errorP=4;
                                            movs=false;
                                        }else{
                                            General.buscarKill(fmov, cmov, turno);
                                            if(turno==0){
                                                turno=1;
                                            }else{
                                                turno=0;
                                            }
                                            errorP=0;
                                            movs=false;
                                        }
                                        break;
                                  }else{
                                      movs=false;
                                      errorP=3;                                      
                                      break;
                                  }
                              }else if(e==15){
                                  movs=false;
                                  errorP=2;                                  
                              }
                        }
                    }else{
                        movs=false;
                        errorP=1;
                    }
                    
                }while(true);                
            }else if(menu=='2'){
                for(Jugadores stats : jugadores){
                    stats.ImprimirStats(turno);
                }
                
            }else{
                System.exit(0);
            }
            
        }
    }
}
