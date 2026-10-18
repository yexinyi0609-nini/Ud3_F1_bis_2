import java.util.Scanner;
public class Ejercicio5 { 
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        
        //Introducir los tres números
        System.out.println("Introducir el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introducir el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Introducir el tercer número: ");
        int numero3 = scanner.nextInt();

        //Compara los tres números
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El número mayor es:" + numero1);
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número mayor es:" + numero2);
        }else{
            System.out.println("El número mayor es:" + numero3);
        }   
        scanner.close();
    }

}
