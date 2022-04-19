
public class Turma {
	// atributos
	
	private int idTurma;
	private int qtdAlunos;
	private double notas [];
	
	// construtores
	
	public Turma() {}	
		
	public Turma(int idTurma, int qtdAlunos, double[] notas) {
		this.idTurma = idTurma;
		this.qtdAlunos = qtdAlunos;
		this.notas = notas;
	}
	
	public Turma(int idTurma, int qtdAlunos) {
		this.idTurma = idTurma;
		this.qtdAlunos = qtdAlunos;		
	}
	
	// getters e setters

	public int getIdTurma() {
		return idTurma;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	// metodos
	
	public double mediaTurma() {
		double soma = 0.0;
		for(double n : notas) {
			soma = soma + n;
		}
		return soma / notas.length;
	}	
	
}
