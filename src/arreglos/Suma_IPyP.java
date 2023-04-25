package arreglos;

public class Suma_IPyP {
    public static void main(String[] args) {
    int p=0;
    int t=0;
    for(int i=1;i<=6;i++){
       
        if(i%2==0){
        p +=i;
        
        }else{
        t+=i;        
        }   
    }
    System.out.println("La suma de los 3 primeros numeros pares es: "+p);
    System.out.println("La suma de los 3 primeros numeros impares es: "+t);
    }
}
