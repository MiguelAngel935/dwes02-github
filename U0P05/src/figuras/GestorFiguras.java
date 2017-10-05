package figuras;
import java.util.ArrayList;

public class GestorFiguras {
	private ArrayList<Figura> lista;
	
public GestorFiguras(){
	lista = new ArrayList<Figura>();
}
public void añadirFigura(Figura f) {
	lista.add(f);
}
public void eliminarFigura(Figura f) {
	lista.remove(f);
}
public void mostrarFigura() {
	for(int i=0; i<lista.size(); i++) {
		lista.get(i).toString();
	}
}
public double calcularSumatorioAreas() {
	double suma=0;
	for(int i=0; i<lista.size(); i++) {
		suma=suma+(lista.get(i).area());
	}
	return suma;
}
}

