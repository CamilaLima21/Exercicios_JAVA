
public class P2EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando as contas correntes
		ContaCorrente C1 = new ContaCorrente();
		ContaCorrente C2 = new ContaCorrente(2, 1000.0);
		
		C1.setNumCC(1);
		C1.setSaldoCC(2000.0);
		
		// exibindo seus atributos, numCC e saldoCC
		   System.out.println("Conta Corrente 1 – número CC = " + C1.getNumCC()  +
		                                 		" saldo CC = " + C1.getSaldoCC());
		   
		   System.out.println("Conta Corrente 2 – número CC = " + C2.getNumCC()  +
         									" saldo CC = " + C2.getSaldoCC());
		
		C1.setDepositar(500.0);
		C1.setSacar(700.50);
		
		C2.setDepositar(100.0);
		C2.setSacar(30.0);		
		
		
		// exibindo seus atributos, numCC e saldoCC
		
		   System.out.println("----------------------------------------------------");	
		   System.out.println("Conta Corrente 1 – número CC = " + C1.getNumCC()  +
		                                 		" saldo CC = " + C1.getSaldoCC());
		   
		   System.out.println("Conta Corrente 2 – número CC = " + C2.getNumCC()  +
            									" saldo CC = " + C2.getSaldoCC());

	}

}
