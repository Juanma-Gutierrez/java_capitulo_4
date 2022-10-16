import java.util.Scanner;

/**
 * Exercise: 16
 *
 * @version: 16/10/2022 08:38
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char res;
        int sum;
        sum = 0;
        System.out.println("Test de infidelidad. Contesta a cada pregunta con v para verdadero o f para falso");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Ha aumentado sus gastos de vestuario (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Ha perdido el interés que mostraba anteriormente por ti (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print(
                "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("No te deja que mires la agenda de su teléfono móvil (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Has notado que últimamente se perfuma más (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo (v/f): ");
        res = sc.next().charAt(0);
        if (res == 'v')
            sum += 3;

        if (sum <= 10)
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        else if (sum <= 22)
            System.out.println(
                    "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
        else
            System.out.println(
                    "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        sc.close();
    }
}
