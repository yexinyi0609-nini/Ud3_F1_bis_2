import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir la temperadura en grados: ");
        double temperatura = scanner.nextDouble();

        //Datos de tabla
        if (temperatura <= 10) {
            System.out.println("Clima: Frío");
        } else if (temperatura <= 20) {
            System.out.println("Clima: Templado");
        }else if (temperatura <= 30) {
            System.out.println("Clima: Caluroso");
        }else{
            System.out.println("Clima: Tropical");
        }
        scanner.close();
    }
    
}
