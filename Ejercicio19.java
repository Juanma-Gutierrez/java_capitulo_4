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
        cont = Integer.toString(Math.abs(num)).length();
        System.out
                .print(cont > 5 ? "El número introducido tiene más de 5 dígitos" : num + " tiene " + cont + " dígitos");
        if (num < 0)
            System.out.print(" y es negativo");
        sc.close();
    }
}
