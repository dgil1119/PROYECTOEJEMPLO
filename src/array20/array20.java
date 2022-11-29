package array20;

import java.util.Random;
import java.util.Scanner;

public class array20 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	Random random = new Random();

	String palabras[]=new String[] { "azulejo", "tenedor", "saltamontes",
			"carretilla", "molinero", "sofisticado", "terremoto", "culinario", "teclado", "primavera"};
	Integer aleatorio = random.nextInt(10);
	String palabra1=aleatorio.toString();
	for(int i=0; i<palabras.length-1;i++) {
		if(palabras[i].equals(aleatorio)) {
			
		}
	}
	
	scanner.close();
}
}
