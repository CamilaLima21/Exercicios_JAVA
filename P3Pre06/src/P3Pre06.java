
public class P3Pre06 {

	public static void main(String[] args) {
		// [5] turmas
		// [30] alunos
		// [5] matérias
		// [5] notas
		
		double notas [][][][] = new double [5][30][5][4];
		notas[2][20][1][3] = 8.5;
		
		// [10] lojas
		// [5] vendedores
		// [12] meses
		
		double comissao[][][] = new double [10][5][12];
		comissao[3][4][2] = 2000.0;
		
		/*double temperatura [][][][][] = new double [100][366][24][60][60];
		temperatura [50][100][50][38][26] = 37.5;*/
		
		int [] banana = {5,3,8,7,9};
		int [] mamao = {2,4,6,8};
		
		imprime(banana);
		imprime(mamao);
		
		
		int [] c = {2,5,6,89,323,1,3};
		for ( int dado: c) {
			System.out.println(dado);
		}

	}
	
	public static void imprime(int [] a) {
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]+ " ");
		}
		System.out.print("\n");
		
		
	}
	
	

}
