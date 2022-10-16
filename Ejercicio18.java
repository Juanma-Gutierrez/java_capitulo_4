import java.util.Scanner;

/**
 * Exercise: 18
 *
 * @version: 16/10/2022 09:13
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInit;
        int num;
        int res;
        int newNum;
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        numInit = num;
        newNum = 0;

        if (num < 0)
            num *= (-1);

        do {
            res = num % 10;
            newNum *= 10;
            newNum += res;
            num /= 10;

        } while (num > 0);
        System.out.print("El primer dígito de " + numInit + " es " + newNum % 10);
        sc.close();
    }
}
