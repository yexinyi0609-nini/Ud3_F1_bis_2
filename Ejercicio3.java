import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[]args){
        //Abrir el scanner
        Scanner scanner = new Scanner(System.in);

        //Introducir el primer número
        System.out.println("Introducir el primer número:");
        int numero1 = scanner.nextInt();

        //Introducir el segundo número
        System.out.println("Introducir el segundo número:");
        int numero2 = scanner.nextInt();

        //Comparar los dos número
        if (numero1 > numero2){
            System.out.println("El mayor es:" + numero1);
        }else if (numero1 < numero2){
            System.out.println("El mayor es:" + numero2);
        }else {
            System.out.println("Los numeros son iguales");
        }
        scanner.close();
    }


}
