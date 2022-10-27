import java.util.Scanner;

/**
 * Exercise: 29
 *
 * @version: 16/10/2022 18:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order;
        String pitufo;
        String drink;
        float costFood;
        float costDrink;
        String foodOut;
        String drinkOut;

        costFood = 0;
        costDrink = 0;
        drink = "";
        foodOut = "";
        drinkOut = "";
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        order = sc.next();

        if (order.equals("palmera")) {
            costFood = (float) 1.40;
            foodOut = "Palmera";
        } else if (order.equals("donut")) {
            costFood = (float) 1;
            foodOut = "Donut";
        } else if (order.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo = sc.next();
            if (pitufo.equals("aceite")) {
                costFood = (float) 1.20;
                foodOut = "Pitufo con aceite";
            } else {
                costFood = (float) 1.60;
                foodOut = "Pitufo con tortilla";
            }
        }

        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        drink = sc.next();
        if (drink.equals("zumo")) {
            costDrink = (float) 1.50;
            drinkOut = "Zumo";
        } else {
            costDrink = (float) 1.20;
            drinkOut = "Café";
        }

        System.out.printf("%-20s %6.2f\n", foodOut, costFood);
        System.out.printf("%-20s %6.2f\n", drinkOut, costDrink);
        System.out.printf("%-20s %6.2f", "Total desayuno:", costFood + costDrink);

        sc.close();
    }
}
