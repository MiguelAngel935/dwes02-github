package figuras;
public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,a, pc, pt, pcin1,pcin2, ac, at, acin1, acin2;
		
		Cuadrado c1= new Cuadrado(4.2);
		Triangulo t1= new Triangulo(8, 15);
		Circunferencia cin1= new Circunferencia(4.8);
		Circunferencia cin2= new Circunferencia (1.5);
		
		System.out.println("Vamos a calcular el area y el perimetro de la figura propuesta");
		System.out.println("Perietro:");
		pc=c1.perimetro()-c1.getLado();
		pt=t1.perimetro()-((cin1.getRadio()*2)+cin2.getRadio()*2);
		pcin1=cin1.perimetro()/2;
		pcin2=cin2.perimetro()*(3/4);
		p=pc+pt+pcin1+pcin2;
		System.out.println(p);
		
		System.out.println("Area:");
		ac=c1.area();
		at=t1.area();
		acin1=cin1.area()/2;
		acin2=cin2.area()*(3/4);
		a=ac+at+acin1+acin2;
		System.out.println(a);

}
}
