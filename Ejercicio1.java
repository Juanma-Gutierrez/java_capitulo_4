import java.util.Scanner;

/**
 * Exercise: 1
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Var declarations
        int day;
        String subject;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Introduce un día de la semana: ");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miércoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        day = sc.nextInt();

        // Process
        switch (day) {
            case 1:
                subject = "Programación";
                break;
            case 2:
                subject = "Sistemas informáticos";
                break;
            case 3:
                subject = "Entorno de desarrollos";
                break;
            case 4:
                subject = "Programación";
                break;
            case 5:
                subject = "Formación y orientación laboral";
                break;
            default:
                subject = "Has introducido un día no válido";
                break;
        }

        // Output results
        System.out.print((day >= 1 && day <= 5) ? "El día " + day + " de la semana toca " + subject : subject);

        // Close scanner;
        sc.close();
    }
}
