/*
 Agregar lo correspondiente para que el proceso siguiente permita
 sumar las notas en cada iteración y presentar en la cadena final el
 valor de la suma.
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        int salida;
        double sumaNotas = 0;
        
        do {
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            sumaNotas = sumaNotas + nota;
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, 
                    nota);
            
            System.out.println("Ingrese (-111) si desea salir del ciclo ");
            salida = entrada.nextInt();
            
            
            //si la salida es -111 el progranma identifica a bandera como falso
            //y por lo tanto termina el prorama
            if (salida == -111) {
                bandera = false;
            }

        } while (bandera); // (bandera==true)
        
        // se guardan todos los valores numericos agregados por el usario
        cadenaFinal = String.format("%s\n", cadenaFinal);
        
        // se suma todos los valores numericos agregados por el usuario
        cadenaFinal = String.format("%s\nLa suma es%.2f", cadenaFinal, sumaNotas);
        
        // se presenta las notas del usuario y la suma total de esas notas
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
