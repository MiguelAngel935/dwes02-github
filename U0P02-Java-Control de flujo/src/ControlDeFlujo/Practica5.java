package ControlDeFlujo;
import java.util.*;
public class Practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int mes=0;
		String bisiesto="";
		
		while (mes<1 || mes>12) {
		System.out.println("Introduzca el numero de un mes");
		mes=teclado.nextInt();
		}
		
		while (!bisiesto.equalsIgnoreCase("si") && !bisiesto.equalsIgnoreCase("no") ) {
		System.out.println("¿El año es bisiesto? (si/no)");
		bisiesto=teclado.next();
		}
		
		switch (mes) {
		case 1: System.out.println("Tiene 31 dias");
		break;
		case 2: 
			if(bisiesto.equalsIgnoreCase("si")) {
			System.out.println("Tiene 29 dias");
			}
			else {
			System.out.println("Tiene 28 dias");
			}
		break;
		case 3: System.out.println("Tiene 31 dias");
		break;
		case 4: System.out.println("Tiene 30 dias");
		break;
		case 5: System.out.println("Tiene 31 dias");
		break;
		case 6: System.out.println("Tiene 30 dias");
		break;
		case 7: System.out.println("Tiene 31 dias");
		break;
		case 8: System.out.println("Tiene 31 dias");
		break;
		case 9: System.out.println("Tiene 30 dias");
		break;
		case 10: System.out.println("Tiene 31 dias");
		break;
		case 11: System.out.println("Tiene 30 dias");
		break;
		case 12: System.out.println("Tiene 31 dias");
		break;
		default: System.out.println("Se han cometido errores");
		}
	}

}
