package abstractas;

public class ProbarAbstracto {

	public static void main(String[] args) {
		Rectangulo c= new Rectangulo(10.0, 5.0);
		System.out.println(c.area()+"------"+c.perimetro());
		
		TrapecioRectangulo tr1= new TrapecioRectangulo(6, 10, 4);
		System.out.println(tr1.area());

	}

}
