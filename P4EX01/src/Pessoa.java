
public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String dataNasc;
	
	public Pessoa() {}

	public Pessoa(String nome, String cpf, String dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void tirarCopias(int qtd) {
		double totPgto = qtd * 0.10;
		System.out.printf("O valor total a pagar é R$ %.2f %n",totPgto);
		
	}
	
	
}
