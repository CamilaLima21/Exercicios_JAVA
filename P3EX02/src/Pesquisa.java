
public class Pesquisa {
	private static int sequencia;
	private int numPesquisa;
	private char sexo;
	private char resposta;

	public Pesquisa() {
		sequencia++;
		numPesquisa = sequencia;
	}
	
	public Pesquisa(char sexo, char resposta) {
		sequencia++;
		numPesquisa = sequencia;
		this.sexo = sexo;
		this.resposta = resposta;
	}

	public char getSexo() {
		return sexo;
	}

	public char getResposta() {
		return resposta;
	}
	
	public int getNumPesquisa() {
		return numPesquisa;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
			
}
