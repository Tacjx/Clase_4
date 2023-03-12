package Actividades_Cl;

import java.util.Scanner;

public class Actividad_1 {

	public static void main(String[] args) {
		//En estos ejercicios se utiliza la letra 'a' como Ascendente y la letra 'd' como descentente. 
		
		System.out.println("Actividad A");
		int[] respuesta= act(10,22,13,"d");
		
		for(int i=0; i<respuesta.length;i++) {
			System.out.print(respuesta[i]+ " ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("Actividad B");
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Ingrese 3 numeros, presione Enter cuando escriba cada numero ");
		int num1=leer.nextInt();
		int num2=leer.nextInt();
		int num3=leer.nextInt();
		
		System.out.println("Ingrese el orden en que se acomodaran");
		System.out.println("Presione 'a' por Ascendente o 'd' por Descentente");
		
		String letra=leer.next();		
		
		
		int[] respuestaB= act(num1,num2,num3,letra);
		for(int i=0; i<respuestaB.length;i++) {
			System.out.print(respuestaB[i]+ " ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		
		System.out.println("Actividad C");
		
		System.out.println("Dados los numeros 5, 47, 12 decida si ordenarlos de forma Ascendente o Descendente");
		int numA=5;
		int numB=47;
		int numC=12;
		
		System.out.println("Presione 'a' por Ascendente o 'd' por Descentente");
		
		String orden=leer.next();		
		
		
		int[] respuestaC= act(numA,numB,numC,orden);
		for(int i=0; i<respuestaC.length;i++) {
			System.out.print(respuestaC[i]+ " ");
		}
		

	}
	
	
	public static int[] act(int num1, int num2, int num3, String orden) {
		int[] resultado= new int[3];
		
		resultado[0]=num1;
		resultado[1]=num2;
		resultado[2]=num3;
		
		
		int auxiliar=0;
		
		if(orden=="a") {
			for(int i=0;i<resultado.length;i++) {
				for(int j=i+1;j<resultado.length;j++) {
					if (resultado[i]<resultado[j]) {
						auxiliar=resultado[i];
						resultado[i]=resultado[j];
						resultado[j]=auxiliar;
					}
					}
				}
				
			}
		else {
			for(int i=resultado.length-1;i>=0;i--) {
				for(int j=i-1; j>=0;j--) {
					if(resultado[i]<resultado[j]) {
						auxiliar=resultado[i];
						resultado[i]=resultado[j];
						resultado[j]=auxiliar;					}
				}
			}
		}
		
		return resultado;

}

}
