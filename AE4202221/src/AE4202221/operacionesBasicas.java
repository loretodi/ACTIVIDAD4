package AE4202221;
import java.util.Scanner;
public class operacionesBasicas {

	public static void main(String[] args) {
		/** Actividad evaluable n4  */
		/** Introducir 2 n�meros enteros positivos */
  		/** Realizar las 4 operaciones b�sicas matem�ticas (suma, resta, multiplicaci�n y divisi�n) sin el uso de m�todos */ 
		/** Visualizar sus resultados. */
		
		/** @author Maria Loreto Diaz Fernandez */
		/** @version Version1*/

		/** Definicion de variables de trabajo */
		int a, b, suma, resta , multiplicacion, division = 0;

		/** Introduccion de datos */
		Scanner s = new Scanner( System.in );
	    System.out.println( "Introduce dos n�meros: ");
	    a = s.nextInt();
	    b = s.nextInt();

	    /** Calculos */
	    suma = a + b;
	    resta = a - b;
		multiplicacion = a * b;
		division = a / b;
		
	    /** Visualizar los resultados */
        System.out.println( "La suma de a y b es: " + suma );
	    System.out.println( "La resta de a y b es: " + resta );
	    System.out.println( "La multiplicacion de a y b es: " + multiplicacion );
	    System.out.println( "La division de a y b es: " + division );
	}

}
