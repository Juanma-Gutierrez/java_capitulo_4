import java.util.Scanner;

/**
 * Exercise: 21
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de
 * la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la
 * nota media anterior.
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        // Var declarations
        float note1;
        float note2;
        float avg;
        String rec;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Nota del primer control: ");
        note1 = sc.nextFloat();
        System.out.print("Nota del segundo control: ");
        note2 = sc.nextFloat();

        // Process
        avg = (note1 + note2) / 2;
        if (avg < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            rec = sc.next();
            if (rec.equals("apto"))
                avg = 5;
        }

        // Output results
        System.out.print("Tu nota de Programación es " + avg);

        // Close scanner
        sc.close();
    }
}
