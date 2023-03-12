package Actividades_Cl;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Actividades_3 {

	public static void main(String[] args) throws IOException {
		
		Scanner leer=new Scanner(System.in);
		
		
		
		System.out.println("Ingrese el archivo de entrada para obtener la frase");
		String origen=leer.next();
				//"C:\\Users\\Usuario\\Desktop\\Git\\frase.txt";
		
		System.out.println("Ingrese el archivo final donde se dejara la frase ya trabajada");
		String destino=leer.next();
				//"C:\\Users\\Usuario\\Desktop\\Git\\CodificadoDecodificado.txt";
		
		System.out.println("Escriba 'c' para Codificar una frase o 'd' para Decodificarla");
		String eleccion=leer.next();
		
		System.out.println("Escriba el valor del Desplazo");
		int desplazo=leer.nextInt();
		
		
		
		if(eleccion=="c") {
			String codificado= CodificadorDecodificador.codificar(origen, desplazo);
			Files.writeString(Paths.get(destino ), codificado );
			
		}
		else{
			String decodificado= CodificadorDecodificador.decodificar(origen, desplazo);
			Files.writeString(Paths.get(destino ), decodificado );
			
		} 
		
		System.out.println("El programa termino correctamente");

	}

}
