package ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.*;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Modelo {

	HashMap< String, String> miMapa;
	
	public Modelo() {
	
		miMapa = new HashMap<>();
		
		String diccionario = "";
		String[]array; 
		
		try (BufferedWriter bout = Files.newBufferedWriter(Path.of("./src/ejercicio11/Diccionario.txt"),
									Charset.defaultCharset(),
									StandardOpenOption.CREATE);
				BufferedReader bin = Files.newBufferedReader(Path.of("./src/ejercicio11/Diccionario.txt"))){
			
			diccionario = bin.readAllAsString();
			
			array = diccionario.split(" ");
			
			for (int i = 0; i < array.length; i+=2) {
				miMapa.put(array[i],array[i+1]);
			}
			
			
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
