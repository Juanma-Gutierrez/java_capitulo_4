import java.util.Scanner;

/**
 * Exercise: 21
 *
 * @version: 16/10/2022 11:21
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float note1;
        float note2;
        float avg;
        String rec;
        System.out.print("Nota del primer control: ");
        note1 = sc.nextFloat();
        System.out.print("Nota del segundo control: ");
        note2 = sc.nextFloat();
        avg = (note1 + note2) / 2;
        if (avg < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            rec = sc.next();
            if (rec.equals("apto"))
                avg = 5;
        }

        System.out.print("Tu nota de Programación es " + avg);
        sc.close();
    }
}
