package Actividades_Cl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class Actividad_2 {

	public static void main(String[] args) throws IOException {
		
		String archivo = "C://Users//Usuario//Desktop//Git//numero.txt";
		int resultado = 0;
		int auxiliar = 0;

		
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				auxiliar = Integer.parseInt(linea);
				resultado = resultado + auxiliar;
			}
			System.out.println("La sumatoria es: " + resultado);
			
			
			
			resultado = 1;
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				auxiliar = Integer.parseInt(linea);
				resultado = resultado * auxiliar;
			}
			System.out.println("La multiplicacion es: " + resultado);

		}

		

	}

