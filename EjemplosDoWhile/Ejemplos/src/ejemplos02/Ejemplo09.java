/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal;
        int nota;
        int salida;
        String nombre; // *
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        String mensaje;
        
        cadenaFinal = "\nListado de Notas";
        
        do {
            System.out.println("Ingrese nombre del estudiante");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese calificaciones, solo valor entero");
            nota = entrada.nextInt();
            
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();
            
            // agrego valor al acumulador
            suma = suma + nota;
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;
            
            if (nota >= 5) {
                mensaje = "Muy buena";
            }else{
                 mensaje = "Buena";
            }

            if (salida == -111) {
                bandera = false;
            }
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
                               // que se solicita al inicio del ciclo es una
                               // cadena
                               
            cadenaFinal = String.format("%s\nCalificacion %d (%s) del "
                    + "estudiante %s", cadenaFinal,nota,mensaje,nombre);

        } while (bandera); // (bandera==true)
        
        // promedio = suma / contador_calificaciones;
        promedio = (double)suma / contador_calificaciones;
        cadenaFinal = String.format("%s\n\nPromedio de calificaciones: %.2f\n",
                cadenaFinal,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
