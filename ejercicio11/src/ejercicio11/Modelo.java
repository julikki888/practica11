package ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.*;
import java.io.FileWriter;
import java.util.*;

public class Modelo {

	HashMap< String, String> miMapa;
	
	public Modelo() {
	
		miMapa = new HashMap<>();
		String[] array;
		
		try (BufferedWriter bout = new BufferedWriter(new FileWriter("./src/ejercicio11/Diccionario.txt",true));
				BufferedReader bin = new BufferedReader(new FileReader(new File("./src/ejercicio11/Diccionario.txt")))){
			
			List<String> lineas = bin.readAllLines();

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	public HashMap<String, String> getMiMapa() {
		return miMapa;
	}

	public void setMiMapa(HashMap<String, String> miMapa) {
		this.miMapa = miMapa;
	}
	
}
