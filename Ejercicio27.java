import java.util.Scanner;

/**
 * Exercise: 27
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la
 * tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de
 * fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe
 * preguntar además si el chocolate es negro o blanco; la primera opción vale 14
 * euros y la segunda 15. Por último se pregunta si se añade nata y si se
 * personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        // Var declarations
        float cost;
        String flavour1;
        String flavour2;
        String cream;
        String name;
        float creamCost;
        float nameCost;

        // Var init
        cost = 0;
        creamCost = 0;
        nameCost = 0;
        flavour1 = "";
        flavour2 = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        flavour1 = sc.next();
        if (flavour1.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            flavour2 = sc.next();
        }

        // Process
        switch (flavour1) {
            case "manzana":
                cost = 18;
                break;
            case "fresa":
                cost = 16;
                break;
            case "chocolate":
                switch (flavour2) {
                    case "negro":
                        cost = 14;
                        break;
                    case "blanco":
                        cost = 15;
                        break;
                }
        }
        System.out.print("¿Quiere nata? (si o no): ");
        cream = sc.next();
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        name = sc.next();

        if (flavour1.equals("chocolate"))
            System.out.printf("\n%-30s %7.2f\n", ("Tarta de " + flavour1 + " " + flavour2 + ":"), cost);
        else
            System.out.printf("\n%-30s %7.2f\n", ("Tarta de " + flavour1 + ":"), cost);

        if (cream.equals("si")) {
            creamCost = (float) 2.50;
            System.out.printf("%-30s %7.2f\n", "Con nata:", creamCost);
        }

        if (name.equals("si")) {
            nameCost = (float) 2.75;
            System.out.printf("%-30s %7.2f\n", "Con nombre:", nameCost);
        }

        System.out.printf("%-30s %7.2f\n", "Total:", (cost + creamCost + nameCost));

        // Close scanner
        sc.close();
    }

}
