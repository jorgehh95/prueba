package abstractas;

public class TrapecioRectangulo extends Cuadrilatero {
	private  double baseMenor;
	private  double baseMayor;
	
	protected TrapecioRectangulo( double baseMenor, double baseMayor, double altura) {
		super(baseMenor, altura);
		this.baseMayor=baseMayor;
	}

	@Override
	protected double area() {
		Rectangulo r1=getRectangulo();
		Rectangulo r2=new Rectangulo(baseMayor-getBase(),getAltura());
		return r1.area()+r2.area()/2;
	}

	@Override
	protected double perimetro() {
		double cateto1=baseMayor-getBase();
		double cateto2=getAltura();
		double hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
		return baseMayor+getBaseMenor()+getAltura()+hipotenusa;
	}

	public double getBaseMenor() {
		return getBase();
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public Rectangulo getRectangulo(){
		Rectangulo r1=new Rectangulo(getBase(),getAltura());
		return r1;
	}

	@Override
	public String toString() {
		return "TrapecioRectangulo [baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + "]";
	}
	
}
