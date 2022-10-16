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
        int num;
        int res;
        int newNum;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        res = 1;
        newNum = 0;

        do {
            res = num % 10;
            newNum *= 10;
            newNum += res;
            num /= 10;

        } while (num > 0);
        System.out.print(newNum);
        sc.close();
    }
}
