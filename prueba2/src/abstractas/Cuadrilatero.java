package abstractas;

public abstract class Cuadrilatero {
	//ATRIBUTOS
	private double base;
	private double altura;
	//CONSTRUCTORES
	protected Cuadrilatero(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
	//METODOS ABSTRACTOS
	protected abstract double area();
	protected abstract double perimetro();
	//METODOS NO ABSTRACTOS
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	@Override
	public String toString() {
		return "Cuadrilatero [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
