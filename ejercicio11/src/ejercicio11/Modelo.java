package ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Modelo {

	private HashMap< String, String> miMapaE, miMapaI;
	
	public Modelo() {
	
		miMapaE = new HashMap<>();
		miMapaI = new HashMap<>();
		
		String diccionario = "";
		String[]array; 
		
		try (BufferedReader bin = Files.newBufferedReader(Path.of("./src/ejercicio11/Diccionario.txt"))){
			
			diccionario = bin.readAllAsString();
			
			array = diccionario.split(" ");
			
			for (int i = 0; i < array.length; i+=2) {
				miMapaE.put(array[i],array[i+1]);
			}
			for (int i = 0; i < array.length; i+=2) {
				miMapaI.put(array[i+1],array[i]);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
	public void annadir (String str) {
		try (BufferedWriter bout = Files.newBufferedWriter(Path.of("./src/ejercicio11/Diccionario.txt"),
				Charset.defaultCharset(),
				StandardOpenOption.CREATE)){
			if(miMapaE.containsKey(str)) {
				throw new Exception("Esta palabra ya esta en el diccionario");
			}
			
			bout.append(" "+str+" ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public HashMap<String, String> getMiMapaE() {return miMapaE;}
	public HashMap<String, String> getMiMapaI() {return miMapaI;}
	
	public void setMiMapaI(HashMap<String, String> miMapaI) {this.miMapaI = miMapaI;}
	public void setMiMapaE(HashMap<String, String> miMapaE) {this.miMapaE = miMapaE;}
	
}
