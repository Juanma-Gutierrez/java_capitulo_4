import java.util.Scanner;

/**
 * Exercise: 19
 *
 * @version: 16/10/2022 09:41
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        cont = 0;
        if (num < 0)
            num *= (-1);
        do {
            num /= 10;
            cont++;

        } while (num > 0);
        System.out.print(cont);
        sc.close();
    }
}
