import java.util.Scanner;

/**
 * Exercise: 3
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspondiente nombre del día de la semana.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        String msg;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número (1-7): ");
        num = sc.nextInt();

        // Process
        switch (num) {
            case 1:
                msg = "El día 1 de la semana es: Lunes";
                break;
            case 2:
                msg = "El día 2 de la semana es: Martes";
                break;
            case 3:
                msg = "El día 3 de la semana es: Miércoles";
                break;
            case 4:
                msg = "El día 4 de la semana es: Jueves";
                break;
            case 5:
                msg = "El día 5 de la semana es: Viernes";
                break;
            case 6:
                msg = "El día 6 de la semana es: Sábado";
                break;
            case 7:
                msg = "El día 7 de la semana es: Domingo";
                break;
            default:
                msg = "Has introducido un número no válido";
                break;
        }

        // Output results
        System.out.println(msg);

        // Close scanner
        sc.close();
    }
}
