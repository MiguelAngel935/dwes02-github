package ControlDeFlujo;
import java.util.*;
public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
	String palabra1, palabra2, palabra3, palabra4, palabra5, p;
System.out.println("Introduzca una palabra");
	palabra1=teclado.next();
System.out.println("Introduzca otra palabra");
	palabra2=teclado.next();
System.out.println("Introduzca otra palabra");
	palabra3=teclado.next();
System.out.println("Introduzca otra palabra");
	palabra4=teclado.next();
System.out.println("Introduzca otra palabra");
	palabra5=teclado.next();
p=palabra1+palabra2+palabra3+palabra4+palabra5;
System.out.println("El resultado de todas las palabras juntas es:"+p);

	
	}

}
