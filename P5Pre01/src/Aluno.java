
public class Aluno {
	
	// atributos
	private int id;
	private String nome;
	private int codCurso;
	
	// construtor polimórfico paramétrico
	public Aluno() {}
	
	public Aluno(int id) {
		this.id = id;
	}
	
	public Aluno(int id, String nome, int codCurso) {
		this.id = id;
		this.nome = nome;
		this.codCurso = codCurso;
	}
	
	// método soma com poliformismo paramétrico
	// sobrecarga de métodos (escrever o método de formas diferentes)
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int soma(int a, int b, int c, int d, int e) {
		return a + b + d + e;
	}
	
	public float soma(float a, float b) {
		return a + b;
	}
	
	public double soma(double a, double b) {
		return a + b;
	}
	
	
	
}
