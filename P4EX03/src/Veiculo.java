
public class Veiculo {
	// atributos
	private int velocidade = 0;
	private int velocidadeMax = 100;

	// construtores
	public Veiculo() {
	}

	public Veiculo(int velocidade, int velocidadeMax) {
		this.velocidade = velocidade;
		this.velocidadeMax = velocidadeMax;
	}

	// getters e setters
	public int getVelocidade() {
		return this.velocidade;
	}

	public int getVelocidadeMax() {
		return this.velocidadeMax;
	}

	// metodos
	public void acelera(int incremento) {
		if (velocidade + incremento > velocidadeMax) {

			System.out.println("Você está acima da Velocidade Limite!");

			// lançar exceção ...
		} else {
			velocidade += incremento;
		}
	}

	public void desacelara(int decremento) {
		if (velocidade - decremento < 0) {
			System.out.println("Você está abaixo da velocidade!");
			// lançar exceção ...
		} else {
			velocidade -= decremento;
		}
	}

}
