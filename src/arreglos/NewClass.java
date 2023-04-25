package arreglos;
import java.util.Random;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
           int ta;
           Scanner lec = new Scanner(System.in);
           Random random = new Random();
           System.out.print("Ingresa el tamaño del arreglo: ");
           ta=lec.nextInt();
           int [] ARRE = new int[ta];
           System.out.print("El arreglo aleatorio es: ");
           for(int i =0;i < ta;i++){
           ARRE[i]= random.nextInt(100);
           System.out.print(ARRE[i]+ " ");
           }
    
    }
}
