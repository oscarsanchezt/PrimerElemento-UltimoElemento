import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		// Para imprimir la lista tras la rotación, recuerda las operaciones remove y
		// add
		String rotacion = miColeccion.remove(0);
		miColeccion.add(rotacion);
		// El resultado debería ser: List, Set, SortedSet, Map y Collection
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
/*
 * Sí, eso es correcto. Por defecto, el método add() de ArrayList añade un
 * elemento al final de la lista. Si no se especifica un índice, el elemento se
 * coloca al final de la lista.
 * 
 * En el ejemplo anterior, al usar miColeccion.add(rotacion), el elemento
 * rotacion se añade automáticamente al final de la lista después de los
 * elementos existentes.
 * 
 * Si deseas agregar un elemento en una posición específica de la lista, puedes
 * utilizar el método add(index, element) de ArrayList. El parámetro index
 * indica la posición en la que deseas insertar el elemento, y el parámetro
 * element es el elemento que deseas añadir.
 * 
 * Aquí tienes un ejemplo de cómo añadir un elemento en una posición específica:
 * 
 * [EJEMPLO]
 * 
 * miColeccion.add(2, "NuevoElemento");
 * 
 */
