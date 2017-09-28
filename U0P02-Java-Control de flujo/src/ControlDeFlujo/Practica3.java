package ControlDeFlujo;
import java.util.*;
public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, aux=0;
		System.out.println("Introduzca numeros");
		
		while (aux<50) {
			n=teclado.nextInt();
			aux=aux+n;
		}
		
		System.out.println("El numero resultante es "+aux);
	}

}
