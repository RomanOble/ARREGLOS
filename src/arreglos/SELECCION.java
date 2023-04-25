package arreglos;

import java.util.Random;
import java.util.Scanner;

public class SELECCION {
    public static void main(String[] args) {
               int ta;
               Scanner lec = new Scanner(System.in);
               Random random = new Random();
               SELECCION ORD = new SELECCION();
               System.out.print("Ingresa el tamaño del arreglo: ");
               ta=lec.nextInt();
               int [] ARRE = new int[ta];
               for(int i =0;i < ta;i++){
               ARRE[i]= random.nextInt(100);

               }
               
               ORD.SEL(ARRE);
               ORD.Imprimir(ARRE);
               
        }
    public void SEL(int[] Arreglo_B){
        int aux=0;
        
       for(int i=0;i<Arreglo_B.length;i++){
       for(int j=i+1;j<Arreglo_B.length;j++){
       if(Arreglo_B[i]>Arreglo_B[j]){
       aux=Arreglo_B[i];
       Arreglo_B[i]=Arreglo_B[j];
       Arreglo_B[j]=aux;
       }
       }
       }
     
    }
    public void Imprimir(int[] Arreglo_B){
    System.out.println(" ");
            System.out.println("Los números ordenados son:");
        for (int i = 0; i < Arreglo_B.length; i++) {
            System.out.print(Arreglo_B[i] + " ");
        }
    }
}

