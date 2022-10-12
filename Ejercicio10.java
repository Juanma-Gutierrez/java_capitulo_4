import java.util.Scanner;

/**
 * Exercise: 10
 *
 * @version: 12/10/2022 19:21
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        String sign;
        System.out.print("Introduce el día de nacimiento: ");
        day = sc.nextInt();
        System.out.println("Introduce el número del mes de nacimiento:");
        month = sc.nextInt();
        sign = "";
        switch (month) {
            case 1:
                sign = day <= 20 ? "Capricornio" : "Acuario";
                break;
            case 2:
                sign = day <= 19 ? "Acuario" : "Piscis";
                break;
            case 3:
                sign = day <= 20 ? "Piscis" : "Aries";
                break;
            case 4:
                sign = day <= 19 ? "Aries" : "Tauro";
                break;
            case 5:
                sign = day <= 21 ? "Tauro" : "Géminis";
                break;
            case 6:
                sign = day <= 20 ? "Géminis" : "Cáncer";
                break;
            case 7:
                sign = day <= 22 ? "Cáncer" : "Leo";
                break;
            case 8:
                sign = day <= 22 ? "Leo" : "Virgo";
                break;
            case 9:
                sign = day <= 22 ? "Virgo" : "Libra";
                break;
            case 10:
                sign = day <= 22 ? "Libra" : "Escorpio";
                break;
            case 11:
                sign = day <= 21 ? "Escorpio" : "Sagitario";
                break;
            case 12:
                sign = day <= 21 ? "Sagitario" : "Capricornio";
                break;

        }
        System.out.println("El signo zodiacal para alguien nacido el " + day + "/" + month + " es: " + sign);
        sc.close();
    }
}
