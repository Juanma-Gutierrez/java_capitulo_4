import java.util.Scanner;

/**
 * Exercise: 26
 *
 * @version: 16/10/2022 16:06
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tickets;
        int ticketsInd;
        int ticketsPair;
        float total;
        float discount;
        float normalPrice;
        float pairPrice;
        String card;
        String dayWeek;

        normalPrice = 8;
        pairPrice = 11;
        ticketsPair = 0;
        ticketsInd = 0;
        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        tickets = sc.nextInt();
        System.out.print("Día de la semana: ");
        dayWeek = sc.next();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        card = sc.next();
        System.out.println();

        if (tickets <= 0)
            System.out.print("Has introducido una cantidad de tickets errónea");
        else if (dayWeek.equals("jueves")) {

            if (tickets % 2 == 0) {
                ticketsPair = tickets / 2;
            } else {
                ticketsPair = (int) Math.floor((float) tickets / 2);
                ticketsInd = 1;
            }

        } else if (dayWeek.equals("miercoles")) {
            normalPrice = 5;
            ticketsInd = tickets;
        } else {
            ticketsInd = tickets;
        }

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        if (dayWeek.equals("jueves")) {
            if (ticketsPair > 0) {
                System.out.printf("%-35s %4d\n", "Entradas de pareja: ", ticketsPair);
                System.out.printf("%-35s %7.2f\n", "Precio por entrada de pareja: ", (float) pairPrice);
            }
            if (ticketsInd > 0) {
                System.out.printf("%-35s %4d\n", "Entradas individuales: ", ticketsInd);
                System.out.printf("%-35s %7.2f\n", "Precio por entrada individual: ", (float) normalPrice);
            }
        } else {
            System.out.printf("%-35s %4d\n", "Entradas individuales: ", tickets);
            System.out.printf("%-35s %7.2f\n", "Precio por entrada individual: ", (float) normalPrice);
        }
        total = (float) (normalPrice * ticketsInd) + (pairPrice * ticketsPair);
        System.out.printf("%-35s %7.2f\n", "Total: ", total);

        discount = 0;
        if (card.equals("s"))
            discount = (float) (total * 0.1);
        System.out.printf("%-35s %7.2f\n", "Descuento: ", discount);
        System.out.printf("%-35s %7.2f\n", "A pagar: ", total - discount);

        /*
         * System.out.printf("%-35s %7.2f\n", "Total: ", (float) price * tickets);
         * if (card.equals("s"))
         * discount = (float) (totalPrice * 0.1);
         * 
         * System.out.printf("%-35s %7.2f\n", "Descuento: ", discount);
         */

        /*
         * int tickets;
         * String dayWeek;
         * String card;
         * int price;
         * float totalPrice;
         * boolean pair;
         * float discount;
         * System.out.println("Venta de entradas CineCampa");
         * System.out.print("Número de entradas: ");
         * tickets = sc.nextInt();
         * System.out.print("Día de la semana: ");
         * dayWeek = sc.next();
         * System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
         * card = sc.next();
         * System.out.println();
         * price = 8;
         * discount = 0;
         * switch (dayWeek) {
         * case "miércoles":
         * case "miercoles":
         * price = 5;
         * break;
         * case "jueves":
         * if (tickets % 2 == 0) {
         * price = 11;
         * tickets /= 2;
         * }
         * }
         * totalPrice = tickets * price;
         * System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
         * if (dayWeek.equals("jueves")) {
         * System.out.printf("%-35s %4d\n", "Entradas de pareja: ", tickets);
         * System.out.printf("%-35s %7.2f\n", "Precio por entrada de pareja: ", (float)
         * price);
         * } else {
         * System.out.printf("%-35s %4d\n", "Entradas individuales: ", tickets);
         * System.out.printf("%-35s %7.2f\n", "Precio por entrada individual: ", (float)
         * price);
         * }
         * System.out.printf("%-35s %7.2f\n", "Total: ", (float) price * tickets);
         * if (card.equals("s"))
         * discount = (float) (totalPrice * 0.1);
         * 
         * System.out.printf("%-35s %7.2f\n", "Descuento: ", discount);
         */
        sc.close();
    }
}
