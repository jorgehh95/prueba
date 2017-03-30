package abstractas;

public class Rectangulo extends Cuadrilatero {

	
	protected Rectangulo(double lado1, double lado2) {
		super(lado1, lado2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return getBase()*getAltura();
	}

	@Override
	protected double perimetro() {
		// TODO Auto-generated method stub
		return (getBase()+getAltura())*2;
	}

}
