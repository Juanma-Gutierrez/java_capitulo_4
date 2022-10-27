import java.util.Scanner;

/**
 * Exercise: 28
 *
 * @version: 16/10/2022 17:02
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
 * opción incorrecta, el programa deberá mostrar un mensaje de error.
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play1;
        String play2;
        String res;
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        play1 = sc.next();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        play2 = sc.next();
        res = "";

        if (((!play1.equals("piedra"))
                && (!play1.equals("papel"))
                && (!play1.equals("tijera")))
                || ((!play2.equals("piedra"))
                        && (!play2.equals("papel"))
                        && (!play2.equals("tijera"))))
            System.out.print("Entrada de datos incorrecta");
        else {
            if (play1.equals("piedra")) {
                if (play2.equals("piedra"))
                    res = "Empate";
                else if (play2.equals("papel"))
                    res = "Gana el jugador 2";
                else if (play2.equals("tijera"))
                    res = "Gana el jugador 1";
            } else if (play1.equals("papel")) {
                if (play2.equals("piedra"))
                    res = "Gana el jugador 1";
                else if (play2.equals("papel"))
                    res = "Empate";
                else if (play2.equals("tijera"))
                    res = "Gana el jugador 2";
            } else if (play1.equals("tijera")) {
                if (play2.equals("piedra"))
                    res = "Gana el jugador 2";
                else if (play2.equals("papel"))
                    res = "Gana el jugador 1";
                else if (play2.equals("tijera"))
                    res = "Empate";
            }

            System.out.print(res);

        }
        sc.close();
    }
}
