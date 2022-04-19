public class P2EX05 {
	public static void main(String[] args) {
		Relogio r1 = new Relogio();
		Relogio r2 = new Relogio(11,53,10);
		
		r1.setHora(12);
		r1.setMinuto(30);
		r1.setSegundo(30);
		
		r1.exibeHorario();
		r2.exibeHorario();
		
		String clock = r1.getHora()   + ":" +
		               r1.getMinuto() + ":" +
				       r1.getSegundo();
		
		System.out.println(">>"+clock+"<<");
		System.out.println("--------adiantar----------");
		r1.exibeHorario();
		r1.adiantar(86400);
		r1.exibeHorario();
		System.out.println("--------atrasar-----------");
		r1.exibeHorario();
		r1.atrasar(5*86400+2*60+20);
		r1.exibeHorario();
		
	}
}