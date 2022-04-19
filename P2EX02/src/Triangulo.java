
public class Triangulo {
	// atributos
	private double base;
	private double altura;
	
	//construtores
	public Triangulo() {}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// getters
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	//setters
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos
	public double getArea() {
		return (this.altura * this.base) / 2;
	}
	public double getPerimetro() {
		return this.base + this.altura + Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
	}	
	
	
}
