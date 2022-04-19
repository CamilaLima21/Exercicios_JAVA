
public class P2EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoDisciplina A1 = new AlunoDisciplina();
		AlunoDisciplina A2 = new AlunoDisciplina(2, 3, 7.8, 5.4);
		
		A1.setIdAluno(1);
		A1.setIdDisciplina(3);
		A1.setNotaB1(8.5);
		A1.setNotaB2(9.5);
		
		// exibindo seus atributos, idAluno, idDisciplina, notaB1, notaB2
		System.out.printf("IdAluno: %d  %n"
				+ "IdDisciplina: %d  %n"
				+ "Média Aritmética: %.2f  %n"
				+ "Média Ponderada: %.2f %n",A1.getIdAluno(), A1.getIdDisciplina(), A1.getMediaAritmetica(), A1.getMediaPonderada());
		System.out.println("=*=*=*=*=*=*=*==*=*=*=*=*=*=*=");
		System.out.printf("IdAluno: %d  %n"
				+ "IdDisciplina: %d  %n"
				+ "Média Aritmética: %.2f  %n"
				+ "Média Ponderada: %.2f %n",A2.getIdAluno(), A2.getIdDisciplina(), A2.getMediaAritmetica(), A2.getMediaPonderada());
		

	}

}
