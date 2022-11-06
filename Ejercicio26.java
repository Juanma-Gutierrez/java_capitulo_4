import java.util.Scanner;

/**
 * Exercise: 26
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una
 * entradason 8 euros. El miércoles (día del espectador), el precio base es de 5
 * euros. Los jueves son el día de la pareja, por lo que la entrada para dos
 * cuesta 11 euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si
 * un jueves, un grupo de 6 personas compran entradas, el precio total sería de
 * 33 euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas
 * de pareja más 1 individual que son 41 euros (33 + 8).
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        // Var declarations
        int tickets;
        int ticketsInd;
        int ticketsPair;
        float total;
        float discount;
        float normalPrice;
        float pairPrice;
        String card;
        String dayWeek;

        // Var init
        normalPrice = 8;
        pairPrice = 11;
        ticketsPair = 0;
        ticketsInd = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        tickets = sc.nextInt();
        System.out.print("Día de la semana: ");
        dayWeek = sc.next();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        card = sc.next();
        System.out.println();

        // Process
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

        // Close scanner
        sc.close();
    }
}
