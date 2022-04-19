
public class ContaCorrente {
	
	// atributos
	private int numCC;
	private double saldoCC;
	
	
	// construtor
	
	public ContaCorrente() {}

	public ContaCorrente(int numCC, double saldoCC) {
		
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}

	
	// getters
	
	public int getNumCC() {
		return numCC;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	// setters
	
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	// metodos
	
	public void	setDepositar(double valor) {
		this.saldoCC += valor;
	}
	
	public void	setSacar(double valor) {
		this.saldoCC -= valor;
	}	
	
}
