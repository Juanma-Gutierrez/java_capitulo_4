import java.util.Scanner;

/**
 * Exercise: 1
 *
 * @version: 12/10/2022 10:46
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        String subject;
        System.out.println("Introduce un día de la semana: ");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miércoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        day = sc.nextInt();
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
        System.out.print((day >= 1 && day <= 5) ? "El día " + day + " de la semana toca " + subject : subject);
        sc.close();
    }
}
