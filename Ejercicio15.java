import java.util.Scanner;

/**
 * Exercise: 15
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo como
 * \*, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
 * hacia la izquierda o hacia la derecha.
 */

public class Ejercicio15 {
    public static void printSymbol(String symb, int spa, int num) {
        for (int i = 0; i < spa; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < num; i++) {
            System.out.print(symb);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symb;
        int dir;
        System.out.println("Introduce la dirección de la pirámide:");
        System.out.println("1: Arriba");
        System.out.println("2: Derecha");
        System.out.println("3: Abajo");
        System.out.println("4: Izquierda");
        dir = sc.nextInt();
        System.out.print("Introduce el caracter que deseas para la pirámide: ");
        symb = sc.next();
        switch (dir) {
            case 1:
                printSymbol(symb, 2, 1);
                printSymbol(symb, 1, 3);
                printSymbol(symb, 0, 5);
                break;
            case 2:
                printSymbol(symb, 0, 1);
                printSymbol(symb, 0, 2);
                printSymbol(symb, 0, 3);
                printSymbol(symb, 0, 2);
                printSymbol(symb, 0, 1);
                break;
            case 3:
                printSymbol(symb, 0, 5);
                printSymbol(symb, 1, 3);
                printSymbol(symb, 2, 1);
                break;
            case 4:
                printSymbol(symb, 2, 1);
                printSymbol(symb, 1, 2);
                printSymbol(symb, 0, 3);
                printSymbol(symb, 1, 2);
                printSymbol(symb, 2, 1);
                break;
            default:
                System.out.print("Has introducido una dirección no válida");
        }

        sc.close();
    }
}
