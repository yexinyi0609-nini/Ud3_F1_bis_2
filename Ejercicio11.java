import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        System.out.println("Introducir un número (negativo para terminar): ");
        double numero = scanner.nextDouble();

        while (numero >= 0) {
            suma += numero;
            contador++;

            System.out.println("Introducir otro (negativo para terminar): ");
            numero = scanner.nextDouble();
        }

        if (contador > 0) {
            double media = suma/contador;
            System.out.println("Has intoducido " + contador + " números válidos.");
            System.out.println("La media de los valores introducidos es: " + media); 
        }else{
            System.out.println("No se ha introducido ningún número positivo.");
        }
        
        scanner.close();
    }
    
}
