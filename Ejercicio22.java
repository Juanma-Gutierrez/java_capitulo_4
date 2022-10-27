import java.util.Scanner;

/**
 * Exercise: 22
 *
 * @version: 16/10/2022 11:59
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al
 * viernes a las 15:00h.
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int hour;
        int min;
        int minAcum;
        int numDays;
        numDays = 0;
        System.out.println("Introduce el día de la semana:");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miércoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        day = sc.nextInt();
        System.out.print("Introduce la hora (0-23): ");
        hour = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        min = sc.nextInt();
        switch (day) {
            case 1:
                numDays = 4;
                break;
            case 2:
                numDays = 3;
                break;
            case 3:
                numDays = 2;
                break;
            case 4:
                numDays = 1;
                break;
            case 5:
                numDays = 0;
                break;
        }
        minAcum = (60 - min) + (((numDays * 24) + (15 - hour - 1)) * 60);

        System.out.print(
                (minAcum > 0) ? "Faltan " + minAcum + " minutos para el fin de semana" : "Ya estás en fin de semana");
        sc.close();
    }
}
