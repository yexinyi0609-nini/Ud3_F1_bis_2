import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir un número de 1 a 7: ");
        int numero = scanner.nextInt();

        //Usamos switch para evaluar el número y el día correspondiente

        switch(numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error.Día Incorrecto.");
                break;
        }
        scanner.close();
    }
    
}
