import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir tu edad:");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        scanner.close();
    }
    
}
