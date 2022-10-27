import java.util.Scanner;

/**
 * Exercise: 23
 *
 * @version: 16/10/2022 12:25
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el precio final de un producto según su base
 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se muestran los valores correctos, aunque los números no estén tabulados.
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float baseImp;
        String typeIVA;
        int iva;
        String codeProm;
        float discount;
        iva = 0;
        discount = 0;
        System.out.print("Introduzca la base imponible: ");
        baseImp = sc.nextFloat();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        typeIVA = sc.next();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codeProm = sc.next();

        switch (typeIVA) {
            case ("general"):
                iva = 21;
                break;
            case ("reducido"):
                iva = 10;
                break;
            case ("superreducido"):
                iva = 4;
        }

        switch (codeProm) {
            case ("nopro"):
                discount = 0;
                break;
            case ("mitad"):
                discount = (float) ((baseImp + (baseImp * iva / 100)) * 0.5) * (-1);
                break;
            case ("meno5"):
                discount = -5;
                break;
            case ("5porc"):
                discount = (float) ((baseImp + (baseImp * iva / 100)) * 0.05) * (-1);
                break;
        }

        System.out.printf("%-22s", "Base imponible");
        System.out.printf("%5.2f", baseImp);
        System.out.println();
        System.out.printf("%-22s", "IVA (" + iva + "%)");
        System.out.printf("%5.2f", baseImp * iva / 100);
        System.out.println();
        System.out.printf("%-22s", "Precio con IVA");
        System.out.printf("%5.2f", baseImp + (baseImp * iva / 100));
        System.out.println();
        System.out.printf("%-22s", "Cód. promo. (" + codeProm + "):");
        System.out.printf("%5.2f", discount);
        System.out.println();
        System.out.printf("%-22s", "TOTAL");
        System.out.printf("%5.2f", baseImp + (baseImp * iva / 100) + discount);

        sc.close();
    }
}
