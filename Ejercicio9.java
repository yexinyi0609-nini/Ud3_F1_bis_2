import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir un número entero");
        int numero = scanner.nextInt();

        //Los numeros negativos no son cuadrados de números enteros
        if (numero < 0) {
            System.out.println("El número" + numero + "no se puede expresar como el cuadrado de un número entero.");
        }else{
            //Calcular la raíz cuadrada 
            double raíz = Math.sqrt(numero);
            //Convertimos la raíz a un número entero(quitando los decimales)
            int raizEntera = (int) raíz;

            //Comprobar si el resultado evaluadndo da el número original
            if (raizEntera * raizEntera == numero) {
                System.out.println("El número" + numero + " Sí puede expresar como el cuadrado de " + raizEntera + " (ya que " + raizEntera + " al cuadrado es " + numero + ").");

            }else{
                System.out.println("El número" + numero + " No se puede expresar como el cuadrado de dos números enteros.");

            }

        }

        scanner.close();
    }

    
}
