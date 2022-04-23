package AE4202221;
import java.util.Scanner;
public class operacionesBasicas {

	public static void main(String[] args) {
		// Introducir 2 numeros enteros positivos
		// Realizar las 4 operaciones basicas matematicas (suma, resta, multiplicacion y division)
		// Visualizar los resultados
		
		int a, b, suma, resta , multiplicacion, division = 0;

		Scanner s = new Scanner( System.in );
	    System.out.println( "Introduce dos números: ");
	    a = s.nextInt();
	    b = s.nextInt();
		
	    suma = a + b;
	    resta = a - b;
		multiplicacion = a * b;
		division = a / b;
	    
        System.out.println( "La suma de a y b es: " + suma );
	    System.out.println( "La resta de a y b es: " + resta );
	    System.out.println( "La multiplicacion de a y b es: " + multiplicacion );
	    System.out.println( "La division de a y b es: " + division );

	}

}
