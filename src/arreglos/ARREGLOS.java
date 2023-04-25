package arreglos;
import java.util.Scanner;
public class ARREGLOS {

    public static void main(String[] args) {
           
        Scanner lec = new Scanner(System.in);
        int [] arreglo = new int [20];
        
        for(int i=0;i<20;i++){
        arreglo [i]=i+1;
        }
        System.out.print("El arreglo es: ");
        for(int i=0;i<arreglo.length;i++){
        System.out.print(arreglo[i]+" ");
        }
                        
    }
    
}
