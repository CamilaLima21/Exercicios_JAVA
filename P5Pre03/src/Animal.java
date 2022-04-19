
public abstract class Animal {
	protected int idade;
	protected double peso;
	protected String especie;
	public Animal(int idade, double peso, String especie) {
		super();
		this.idade = idade;
		this.peso = peso;
		this.especie = especie;
	}
	public Animal() {
		super();
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public String getEspecie() {
		return especie;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	public abstract void som();
}
