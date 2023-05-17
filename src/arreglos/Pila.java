package arreglos;
import java.util.Stack;
import java.util.Scanner;
public class Pila {
    
 public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Ingrese la cantidad de elementos a agregar a la pila: ");
        int cantidadElementos = lec.nextInt();
        
        System.out.println("Ingrese los elementos a agregar a la pila:");
        for (int i = 0; i < cantidadElementos; i++) {
            int elemento = lec.nextInt();
            pila.push(elemento);
        }

        
        System.out.println("Elemento en la cima de la pila: " + pila.peek());

        
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);

        
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        
        System.out.println("Tamaño de la pila: " + pila.size());

        
        System.out.println("Elementos de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
      }  
    
}
