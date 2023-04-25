package arreglos;

public class Abecedario_A {
    
    public static void main(String[] args) {
        char ch = 'a';
        while (ch <= 'z') {
            System.out.print(Character.toUpperCase(ch) + "" + ch + " ");
            ch++; 
        }
    }
}
