package arreglos;

import java.util.Random;
import java.util.Scanner;

public class INSER {
    public static void main(String[] args) {
               int ta;
               Scanner lec = new Scanner(System.in);
               Random random = new Random();
               INSER ORD = new INSER();
               System.out.print("Ingresa el tamaño del arreglo: ");
               ta=lec.nextInt();
               int [] ARRE = new int[ta];
               for(int i =0;i < ta;i++){
               ARRE[i]= random.nextInt(100);

               }
               
               ORD.INSERCION(ARRE);
               ORD.Imprimir(ARRE);
               
        }
    public void INSERCION(int[] Arreglo_B){
        int aux=0;
        
       for(int i=0;i<Arreglo_B.length;i++){
       aux=Arreglo_B[i];
       for(int j=i-1;j>=0&&Arreglo_B[j]>aux;j--){
       Arreglo_B[j+1]=Arreglo_B[j];
       Arreglo_B[j]=aux;
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
