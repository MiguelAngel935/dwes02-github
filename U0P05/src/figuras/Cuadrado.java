package figuras;

public class Cuadrado extends Figura {

	private double lado;
	
	
	public Cuadrado(String titulo, String color, double lado){
		super(titulo, color);
		this.lado=lado;
		
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return super.toString() +"Cuadrado [lado=" + lado + "]";
	}
	public double perimetro() {
		return lado*4;
	}
	public double area() {
		
		return lado*lado;
	}
	
}

