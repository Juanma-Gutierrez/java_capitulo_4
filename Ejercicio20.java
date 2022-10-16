import java.util.Scanner;

/**
 * Exercise: 20
 *
 * @version: 16/10/2022 09:45
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int longNum;
        boolean cap;
        int neg;
        cap = true;
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        longNum = Integer.toString(num).length();
        neg = (num < 0) ? 1 : 0;
        for (int i = 0; i < longNum / 2; i++) {
            if (Integer.toString(num).charAt(i + neg) != Integer.toString(num).charAt(longNum - i - 1)) {
                cap = false;
            }
        }
        System.out.print((cap) ? num + " es capicúa" : num + " no es capicúa");
        if (neg == 1)
            System.out.print(" y de signo negativo");
        sc.close();
    }
}
