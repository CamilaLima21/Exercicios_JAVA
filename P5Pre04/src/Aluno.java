public class Aluno implements Impressora {
	private int idAluno;
	private String nomeAluno;
	
	public Aluno(int idAluno, String nomeAluno) {
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public void felizNatal() {
		System.out.println("Feliz natal querido aluno.");
	}
	public void dadosPessoais() {
		System.out.println("Dados do Aluno");
		System.out.println("id......:"+idAluno);
		System.out.println("nome....:"+nomeAluno);
	}
	public void parabens() {
		System.out.println("Querido Aluno "+nomeAluno+", parabéns pelo seu aniversário");
	}
}