package ControlDeFlujo;
import java.util.*;
public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	String d;
	
	System.out.println("Introduzca un dia de la semana");
	d=teclado.next();
	
	switch (d) {
	
	case "lunes": System.out.println("Dia laborable");
	  break;
	case "martes": System.out.println("Dia laborable");
	  break;
	case "miercoles": System.out.println("Dia laborable");
	  break;
	case "jueves": System.out.println("Dia laborable");
	  break;
	case "viernes": System.out.println("Dia laborable");
	  break;
	case "sabado": System.out.println("Dia no laborable");
	  break;
	case "domingo": System.out.println("Dia no laborable");
		break;
	default: System.out.println("No se reconoce el dia");
	 
	}
	

	}

}
