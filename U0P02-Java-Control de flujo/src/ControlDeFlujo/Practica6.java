package ControlDeFlujo;
import java.util.*;
public class Practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int n, m, aux;
		
		System.out.println("Introduzca un numero");
		n=teclado.nextInt();
		System.out.println("Introduzca otro numero");
		m=teclado.nextInt();
		
		if(m<n) {
			aux=m;
			m=n;
			n=aux;
		}
		
		while (n<m) {
			
			n=n+1;
			System.out.println("*");
		}
	}

}
