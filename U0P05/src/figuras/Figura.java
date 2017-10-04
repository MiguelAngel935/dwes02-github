package figuras;

public abstract class Figura {
	private String titulo;
	private String color;
	
	
public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
public abstract double area();
public abstract double perimetro();
}

