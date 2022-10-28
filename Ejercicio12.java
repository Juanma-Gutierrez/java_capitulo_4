import java.util.Scanner;

/**
 * Exercise: 12
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
 * andan de conocimientos en las diferentes asignaturas del curso.
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;
        int points;
        points = 0;

        System.out.println("1- A los elementos físicos de un ordenador los llamamos:");
        System.out.println("1: Hardware");
        System.out.println("2: Software");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.println("2- ¿Qué es un algoritmo?:");
        System.out.println("1: Una función / operación matemática con un resultado exacto");
        System.out.println("2: Un conjunto de órdenes que describen cómo resolver un problema");
        res = sc.nextInt();
        points += (res == 2) ? 1 : 0;

        System.out.println("3- ¿Qué es un lenguaje de bajo nivel?:");
        System.out.println("1: El lenguaje de programación que no dispone de clases ni funciones");
        System.out.println("2: El más cercano al ordenador, depende de la arquitectura de la máquina");
        res = sc.nextInt();
        points += (res == 2) ? 1 : 0;

        System.out.println("4- ¿De qué nivel es el lenguaje Cobol?:");
        System.out.println("1: Bajo nivel");
        System.out.println("2: Alto nivel");
        res = sc.nextInt();
        points += (res == 2) ? 1 : 0;

        System.out.println("5- ¿En qué generación se define el Modelo Relacional de BBDD?:");
        System.out.println("1: 3ª Generación");
        System.out.println("2: 4ª Generación");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.println("6- ¿Qué modelo es más productivo?:");
        System.out.println("1: Modelo en Cascada");
        System.out.println("2: Modelo en Cascada con Realimentación");
        res = sc.nextInt();
        points += (res == 2) ? 1 : 0;

        System.out.println("7- ¿Cuál es el comando para listar los commits realizados en git?:");
        System.out.println("1: git log");
        System.out.println("2: git list");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.println("8- ¿Cuál es el comando para eliminar un archivo de git?:");
        System.out.println("1: git rm <archivo> --cached");
        System.out.println("2: git remove <archivo> -force");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.println("9- ¿Cuál es el comando para realizar un commit?:");
        System.out.println("1: git commit -m 'commit'");
        System.out.println("2: git commit -c 'commit'");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.println(
                "10- ¿Tenemos la tabla empleado y la tabla departamentos. Un empleado puede estar asignado únicamente a un departamento. Un departamento puede tener muchos empleados. ¿En qué tabla iría la Foreign Key?:");
        System.out.println("1: Tabla empleado");
        System.out.println("2: Tabla departamento");
        res = sc.nextInt();
        points += (res == 1) ? 1 : 0;

        System.out.print("Puntuación obtenida: " + points);
        sc.close();
    }
}
