import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println( "Introducir un número:");
        int numero = scanner.nextInt();

        //Si el numero es >=0(positivo) o negativo

        if (numero >=0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
        
        scanner.close();
    }
    
}
