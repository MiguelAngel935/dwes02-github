package figuras;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	public Triangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	public double perimetro () {
		double c = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		return base+altura+c;
	}
	public double area() {
		
		return (base*altura)/2;
	}

	
}
