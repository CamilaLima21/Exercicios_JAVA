
public class Professor extends Pessoa {
	private double salario;
	private String disciplina;
	
	public Professor() {}
	
	public Professor(String nome, String cpf, String dataNasc, double salario, String disciplina) {
		super(nome, cpf, dataNasc);
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
		
}
