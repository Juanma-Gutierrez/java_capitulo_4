# java_capitulo_4

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en https://leanpub.com/aprendejava

### Ejercicio 1

Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

```
Introduce un día de la semana:
1: Lunes
2: Martes
3: Miércoles
4: Jueves
5: Viernes
1
El día 1 de la semana toca Programación
```

### Ejercicio 2

Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.

```
Introduce la hora (0-23): 10
Buenos días
```

### Ejercicio 3

Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

```
Introduce un número (1-7): 5
El día 5 de la semana es: Viernes
```

### Ejercicio 4

Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.

```
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros

Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros

Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros
```

### Ejercicio 5

Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).

```
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5

Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.
```

### Ejercicio 6

Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2

```
Introduce la altura: 10
El tiempo en caer desde una altura 10.0 es de 1,43
```

### Ejercicio 7

Realiza un programa que calcule la media de tres notas.

```
Introduce la primera nota: 7
Introduce la segunda nota: 8
Introduce la tercera nota: 10
La nota media de 7.0, 8.0 y 10.0 es: 8,33
```

### Ejercicio 8

Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).

```
Introduce la primera nota: 7
Introduce la segunda nota: 8
Introduce la tercera nota: 10
La nota media de 7.0, 8.0 y 10.0 es: 8,33, es decir: Notable
```

### Ejercicio 9

Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

```
Introduce el valor de a: 1
Introduce el valor de b: -5
Introduce el valor de c: 6
x1 = 3.0
x2 = 2.0
```

### Ejercicio 10

Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

```
Introduce el día de nacimiento: 13
Introduce el número del mes de nacimiento:
10
El signo zodiacal para alguien nacido el 13/10 es: Libra
```

### Ejercicio 11

Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.

```
Introduce la hora: 10
Introduce los minutos: 30
Segundos hasta medianoche: 48600
```

### Ejercicio 12

Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.

```
1- A los elementos físicos de un ordenador los llamamos:
1: Hardware
2: Software
1
2- ¿Qué es un algoritmo?:
1: Una función / operación matemática con un resultado exacto
2: Un conjunto de órdenes que describen cómo resolver un problema
1
3- ¿Qué es un lenguaje de bajo nivel?:
1: El lenguaje de programación que no dispone de clases ni funciones
2: El más cercano al ordenador, depende de la arquitectura de la máquina
1
4- ¿De qué nivel es el lenguaje Cobol?:
1: Bajo nivel
2: Alto nivel
1
5- ¿En qué generación se define el Modelo Relacional de BBDD?:
1: 3ª Generación
2: 4ª Generación
1
6- ¿Qué modelo es más productivo?:
1: Modelo en Cascada
2: Modelo en Cascada con Realimentación
1
7- ¿Cuál es el comando para listar los commits realizados en git?:
1: git log
2: git list
1
8- ¿Cuál es el comando para eliminar un archivo de git?:
1: git rm <archivo> --cached
2: git remove <archivo> -force
1
9- ¿Cuál es el comando para realizar un commit?:
1: git commit -m 'commit'
2: git commit -c 'commit'
1
10- ¿Tenemos la tabla empleado y la tabla departamentos. Un empleado puede estar asignado únicamente a un departamento. Un departamento puede tener muchos empleados. ¿En qué tabla iría la Foreign Key?:
1: Tabla empleado
2: Tabla departamento
1
Puntuación obtenida: 6
```

### Ejercicio 13

Escribe un programa que ordene tres números enteros introducidos por teclado.

```
Introduce el primer número: 20
Introduce el segundo número: 15
Introduce el tercer número: 18
Los números ordenados quedan así: 15, 18, 20
```

### Ejercicio 14

Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

```
Introduce un número: 5
5 es impar y divisible entre 5

Introduce un número: 6
6 es par y NO es divisible entre 5

Introduce un número: 7
7 es impar y NO es divisible entre 5

Introduce un número: 8
8 es par y NO es divisible entre 5
```

### Ejercicio 15

Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como \*, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

```
Introduce la dirección de la pirámide:
1: Arriba
2: Derecha
3: Abajo
4: Izquierda
1
Introduce el caracter que deseas para la pirámide: @
  @
 @@@
@@@@@

Introduce la dirección de la pirámide:
1: Arriba
2: Derecha
3: Abajo
4: Izquierda
2
Introduce el caracter que deseas para la pirámide: *
*
**
***
**
*

Introduce la dirección de la pirámide:
1: Arriba
2: Derecha
3: Abajo
4: Izquierda
3
Introduce el caracter que deseas para la pirámide: X
XXXXX
 XXX
  X

Introduce la dirección de la pirámide:
1: Arriba
2: Derecha
3: Abajo
4: Izquierda
4
Introduce el caracter que deseas para la pirámide: <
  <
 <<
<<<
 <<
  <
```

### Ejercicio 16

Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A continuación se listan las preguntas del test.

1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo

A continuación se muestran los mensajes que deberá dar el programa según la puntuación obtenida.

-   Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.
-   Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.
-   Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.

```
Test de infidelidad. Contesta a cada pregunta con v para verdadero o f para falso
---------------------------------------------------------------------------------
Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente (v/f): f
Ha aumentado sus gastos de vestuario (v/f): f
Ha perdido el interés que mostraba anteriormente por ti (v/f): f
Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) (v/f): f
No te deja que mires la agenda de su teléfono móvil (v/f): f
A veces tiene llamadas que dice no querer contestar cuando estás tú delante (v/f): f
Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a (v/f): f
Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo (v/f): f
Has notado que últimamente se perfuma más (v/f): f
Se confunde y te dice que ha estado en sitios donde no ha ido contigo (v/f): f
¡Enhorabuena! tu pareja parece ser totalmente fiel.

Test de infidelidad. Contesta a cada pregunta con v para verdadero o f para falso
---------------------------------------------------------------------------------
Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente (v/f): v
Ha aumentado sus gastos de vestuario (v/f): v
Ha perdido el interés que mostraba anteriormente por ti (v/f): v
Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) (v/f): v
No te deja que mires la agenda de su teléfono móvil (v/f): v
A veces tiene llamadas que dice no querer contestar cuando estás tú delante (v/f): v
Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a (v/f): v
Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo (v/f): v
Has notado que últimamente se perfuma más (v/f): v
Se confunde y te dice que ha estado en sitios donde no ha ido contigo (v/f): v
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.
```

### Ejercicio 17

Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

```
Introduce un número entero: 1234
El último dígito de 1234 es 4

Introduce un número entero: -1234
El último dígito de -1234 es 4 y es negativo
```

### Ejercicio 18

Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.

```
Introduce un número entero: 1234
El primer dígito de 1234 es 1

Introduce un número entero: -1234
El primer dígito de -1234 es 1
```

### Ejercicio 19

Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

```
Introduce un número: 1234
1234 tiene 4 dígitos

Introduce un número: -1234
-1234 tiene 4 dígitos y es negativo

Introduce un número: 123456
El número introducido tiene más de 5 dígitos
```

### Ejercicio 20

Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.

```
Introduce un número entero de hasta 5 dígitos de tamaño: 12345
12345 no es capicúa

Introduce un número entero de hasta 5 dígitos de tamaño: 12321
12321 es capicúa

Introduce un número entero de hasta 5 dígitos de tamaño: -12321
-12321 es capicúa y de signo negativo

Introduce un número entero de hasta 5 dígitos de tamaño: 123456
Has introducido un número mayor de 5 dígitos
```

### Ejercicio 21

Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.

```
Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5

Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5

Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5
```

### Ejercicio 22

Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.

```
Introduce el día de la semana:
1: Lunes
2: Martes
3: Miércoles
4: Jueves
5: Viernes
4
Introduce la hora (0-23): 10
Introduce los minutos (0-59): 30
Faltan 1710 minutos para el fin de semana

Introduce el día de la semana:
1: Lunes
2: Martes
3: Miércoles
4: Jueves
5: Viernes
5
Introduce la hora (0-23): 14
Introduce los minutos (0-59): 45
Faltan 15 minutos para el fin de semana

Introduce el día de la semana:
1: Lunes
2: Martes
3: Miércoles
4: Jueves
5: Viernes
5
Introduce la hora (0-23): 16
Introduce los minutos (0-59): 00
Ya estás en fin de semana
```

### Ejercicio 23

Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

```
Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible  25.00
IVA (10%)2.50
Precio con IVA  27.50
Cód. promo. (mitad):   -13.75
TOTAL   13.75
```

### Ejercicio 24

Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:

-   Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
-   El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
-   Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.

```
Ejemplo:
1 - Programador junior
2 - Prog. senior
3 - Jefe de proyecto
Introduzca el cargo del empleado (1 - 3): 2
¿Cuántos días ha estado de viaje visitando clientes? 5
Introduzca su estado civil (1 - Soltero, 2 - Casado): 2

+--------------------------------+
| Sueldo base            1200,00 |
| Dietas ( 5 viajes)      150,00 |
+--------------------------------+
| Sueldo bruto           1350,00 |
| Retención IRPF (20%)    270,00 |
+--------------------------------+
| Sueldo neto            1080,00 |
+--------------------------------+
```

### Ejercicio 25

La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.

```
Ejemplo 1:
Introduzca la altura de la bandera en cm: 20
Ahora introduzca la anchura: 35
¿Quiere escudo bordado? (s/n): n
Gracias. Aquí tiene el desglose de su compra.
Bandera de 700 cm2: 7,00 €
Sin escudo: 0,00 €
Gastos de envío: 3,25 €
Total: 10,25 €

Ejemplo 2:
Introduzca la altura de la bandera en cm: 10
Ahora introduzca la anchura: 15
¿Quiere escudo bordado? (s/n): s
Gracias. Aquí tiene el desglose de su compra.
Bandera de 150 cm2: 1,50 €
Con escudo: 2,50 €
Gastos de envío: 3,25 €
Total: 7,25 €
```

### Ejercicio 26

Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana. El precio base de una entradason 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual que son 41 euros (33 + 8).

```
Ejemplo 1:
Venta de entradas CineCampa
Número de entradas: 4
Día de la semana: martes
¿Tiene tarjeta CineCampa? (s/n): n
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 4
Precio por entrada individual 8.00 €
Total 32.00 €
Descuento 0.00 €
A pagar 32.00 €

Ejemplo 2:
Venta de entradas CineCampa
Número de entradas: 4
Día de la semana: viernes
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 4
Precio por entrada individual 8.00 €
Total 32.00 €
Descuento 3.20 €
A pagar 28.80 €

Ejemplo 3:
Venta de entradas CineCampa
Número de entradas: 4
Día de la semana: jueves
¿Tiene tarjeta CineCampa? (s/n): n
Aquí tiene sus entradas. Gracias por su compra.
Entradas de parejas 2
Precio por entrada de pareja 11.00 €
Total 22.00 €
Descuento 0.00 €
A pagar 22.00 €

Ejemplo 4:
Venta de entradas CineCampa
Número de entradas: 5
Día de la semana: jueves
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas parejas 2
Precio por entrada de pareja 11.00 €
Entradas individuales 1
Precio por entrada individual 8.00 €
Total 30.00 €
Descuento 3.00 €
A pagar 27.00 €

Ejemplo 5:
Venta de entradas CineCampa
Número de entradas: 5
Día de la semana: miercoles
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 5
Precio por entrada individual 5.00 €
Total 25.00 €
Descuento 2.50 €
A pagar 22.50 €
```

### Ejercicio 27

Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.

```
Ejemplo 1:
Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 €
Con nata: 2,50 €
Total: 16,50 €

Ejemplo 2:
Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18,00 €
Con nombre: 2,75 €
Total: 20,75 €

Ejemplo 3:
Elija un sabor (manzana, fresa o chocolate): fresa
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): si
Tarta de fresa: 16,00 €
Con nata: 2,50 €
Con nombre: 2,75 €
Total: 21,25 €
```

### Ejercicio 28

Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.

```
Ejemplo 1:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): papel
Empate

Ejemplo 2:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 2

Ejemplo 3:
Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 1
```

### Ejercicio 29

Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.

```
Ejemplo 1:
¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
¿Qué ha tomado de beber? (zumo o café): café
Palmera: 1,40 €
Café: 1,20 €
Total desayuno: 2,60 €

Ejemplo 2:
¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
¿Qué ha tomado de beber? (zumo o café): zumo
Pitufo con tortilla: 1,60 €
Zumo: 1,50 €
Total desayuno: 3,10 €
```
