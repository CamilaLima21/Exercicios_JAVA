
public class Circulo {
	//atributos
	private double raio;

	//construtor
	public Circulo() {}

	public Circulo(double raio) {
		this.raio = raio;
	}
	// getters

	public double getRaio() {
		return raio;
	}

	// setters
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//metodos
	
	public double getArea() {
		return Math.pow(raio, 2) * Math.PI;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}	
	
}
