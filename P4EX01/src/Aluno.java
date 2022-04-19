
public class Aluno extends Pessoa {
	// atributos
	private String matricula;

	public Aluno(String nome, String cpf, String dataNasc, String matricula) {
		super(nome, cpf, dataNasc);
		this.matricula = matricula;
	}

	public Aluno(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	
	public void tirarCopias(int qtd) {
		double totPgto = qtd * 0.07;
		System.out.printf("O valor total a pagar é R$ %.2f %n",totPgto);
		
	}	
	
	
}
