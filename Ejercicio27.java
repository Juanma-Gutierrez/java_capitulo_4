import java.util.Scanner;

/**
 * Exercise: 27
 *
 * @version: 16/10/2022 16:41
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cost;
        String flavour1;
        String flavour2;
        String cream;
        String name;
        float creamCost;
        float nameCost;
        cost = 0;
        creamCost = 0;
        nameCost = 0;
        flavour1 = "";
        flavour2 = "";
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        flavour1 = sc.next();
        if (flavour1.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            flavour2 = sc.next();
        }
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
        sc.close();
    }

}