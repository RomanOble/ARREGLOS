package arreglos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LFamilia {
    private List<String> nombres;
    
    public LFamilia() {
        nombres = new ArrayList<>();
    }
    
    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }
    
    public void imprimirNombres() {
        System.out.println("La lista de integrantes de familia es: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LFamilia lista = new LFamilia();
        
        System.out.print("Escribe el nombre completo de algun integrante de tu familia(o 'fin' para terminar): ");
        String nombre = scanner.nextLine();
        while (!nombre.equals("fin")) {
            lista.agregarNombre(nombre);
            System.out.print("Escribe otro nombre completo de algun integrante de tu familia(o 'fin' para terminar): ");
            nombre = scanner.nextLine();
        }
        
        lista.imprimirNombres();
    }
    
}
