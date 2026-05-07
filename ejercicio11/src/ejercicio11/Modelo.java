package ejercicio11;

import java.util.HashMap;

public class Modelo {

	HashMap< String, String> miMapa;
	
	public Modelo() {
	
		miMapa = new HashMap<>();
		
		String[] array = {"casa", "house", "sol", "sun", "libro", "book", "agua", "water",
				"manzana", "apple", "árbol", "tree", "ventana", "window", "puerta", "door",
				"ciudad", "city", "camino", "road", "amigo", "friend", "tiempo", "time", 
				"escuela", "school", "mesa", "table", "silla", "chair", "leche", "milk",
				"pan", "bread", "flor", "flower", "mar", "sea", "montaña", "mountain"}; 
		
		for(int i = 0;i<array.length;i+=2) {
			miMapa.put(array[i], array[i+1]);
		}
		
	}
	
}
