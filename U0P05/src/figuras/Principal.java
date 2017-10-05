package figuras;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1= new Cuadrado("Cuadrado", "Rojo", 4.2);
		Triangulo t1= new Triangulo("Triangulo", "Verde", 8, 15);
		Circunferencia cin1= new Circunferencia("Circulo1", "Azul", 4.8);
		Circunferencia cin2= new Circunferencia ("Circulo2", "Amarillo", 1.5);
		System.out.println("Las figuras usadas en el problema anterior son:");
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(cin1);
		System.out.println(cin2);
		
		
	}

}
