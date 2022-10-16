import java.util.Scanner;

/**
 * Exercise: 24
 *
 * @version: 16/10/2022 13:04
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int category;
        int days;
        int civilState;
        float baseSalary;
        float bruteSalary;

        System.out.println("Introduzca el cargo del empleado:");
        System.out.println("1: Prog. junior");
        System.out.println("2: Prog. senior");
        System.out.println("3: Jefe de proyecto");
        category = sc.nextInt();

        System.out.println("Introduzca el estado civil:");
        System.out.println("1: Soltero");
        System.out.println("2: Casado");
        civilState = sc.nextInt();
        civilState = (civilState == 1) ? 25 : 20;

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        days = sc.nextInt();

        switch (category) {
            case 1:
                baseSalary = 950;
                break;
            case 2:
                baseSalary = 1200;
                break;
            case 3:
                baseSalary = 1600;
                break;
            default:
                baseSalary = 950;

        }
        bruteSalary = (float) (baseSalary + (days * 30));
        System.out.print("+---------------------------------+\n");
        System.out.printf("%-25s", "| Sueldo base");
        System.out.printf("%8.2f", baseSalary);
        System.out.println(" |");
        System.out.printf("%-25s", "| Dietas (" + days + " viajes)");
        System.out.printf("%8.2f", (float) (days * 30));
        System.out.println(" |");
        System.out.print("+---------------------------------+\n");
        System.out.printf("%-25s", "| Sueldo bruto");
        System.out.printf("%8.2f", bruteSalary);
        System.out.println(" |");
        System.out.printf("%-25s", "| Retención IRPF (" + civilState + "%)");
        System.out.printf("%8.2f", bruteSalary * civilState / 100);
        System.out.println(" |");
        System.out.print("+---------------------------------+\n");
        System.out.printf("%-25s", "| Sueldo neto");
        System.out.printf("%8.2f", bruteSalary - (bruteSalary * civilState / 100));
        System.out.println(" |");
        System.out.print("+---------------------------------+\n");

        sc.close();
    }
}
