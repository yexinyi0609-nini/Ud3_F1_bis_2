import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Poner tres números
        System.out.println("Introducir el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introducir el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Introducir el tercer número: ");
        int numero3 = scanner.nextInt();

        //Ordenar los tres números escritos

        if (numero1 <= numero2 && numero2 <= numero3){
            System.out.println("El orden de menor a mayor es: " + numero1 + "," + numero2 + "," + numero3);
        }else if (numero1 <= numero3 && numero3 <= numero2){
            System.out.println("El orden de menor a mayor es: " + numero1 + "," + numero3 + "," + numero3);
        }else if (numero2 <= numero1 && numero1 <= numero3){
            System.out.println("El orden de menor a mayor es: " + numero2 + "," + numero1 + "," + numero3);
        }else if (numero2 <= numero3 && numero3 <= numero1){
            System.out.println("El orden de menor a mayor es: " + numero2 + "," + numero3 + "," + numero1);
        }else if (numero3 <= numero1 && numero1 <= numero2){
            System.out.println("El orden de menor a mayor es: " + numero3 + "," + numero1 + "," + numero2);
        }else{
            System.out.println("El orden de menor a mayor es:" + numero3 + "," + numero2 + "," + numero1);
        }
        scanner.close();

    }
    
}
