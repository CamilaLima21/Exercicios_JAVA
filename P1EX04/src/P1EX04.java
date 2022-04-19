
public class P1EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora 	= 4;
		int min 	= 50;
		int seg 	= 20;
		
		int passou 	= hora * 3600 + min * 60 + seg;
		int faltam	= 86400 - passou;
		
		System.out.println("Já se passaram " + passou + " segundos do dia.");
		System.out.println("Faltam " + faltam + " segundos do dia.");
				
	}

}
