import java.util.Scanner;

/**
 * Exercise: 4
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        hours = sc.nextInt();
        if (hours <= 0)
            System.out.println("Has introducido un número de horas incorrecto");
        else {
            if (hours <= 40) {
                System.out.println("El sueldo semanal que le corresponde es de " + hours * 12 + " euros");
            } else {
                System.out.println(
                        "El sueldo semanal que le corresponde es de " + ((40 * 12) + ((hours - 40) * 16)) + " euros");
            }
        }
        sc.close();
    }
}
