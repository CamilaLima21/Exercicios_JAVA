
public class Aluno {
	
	// atributos
	private int id;
	private String nome;
	private int codCurso;
	
	// construtor polim�rfico param�trico
	public Aluno() {}
	
	public Aluno(int id) {
		this.id = id;
	}
	
	public Aluno(int id, String nome, int codCurso) {
		this.id = id;
		this.nome = nome;
		this.codCurso = codCurso;
	}
	
	// m�todo soma com poliformismo param�trico
	// sobrecarga de m�todos (escrever o m�todo de formas diferentes)
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
