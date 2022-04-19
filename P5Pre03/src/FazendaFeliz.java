
public class FazendaFeliz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro rex = new Cachorro();
		rex.setIdade(5);
		rex.setPeso(12.0);
		rex.setEspecie("Canino");
		
		Gato felix = new Gato();
		felix.setIdade(10);
		felix.setPeso(3);
		felix.setEspecie("Felina");
		
		Vaca mimosa = new Vaca();
		mimosa.setIdade(8);
		mimosa.setPeso(250);
		mimosa.setEspecie("Bovina");
		
		Galinha marilu = new Galinha();
		marilu.setIdade(3);
		marilu.setPeso(2);
		marilu.setEspecie("Galináceo");
		
		
		SonsDaFazenda s = new SonsDaFazenda();
		
		s.sonsDaFazenda(rex);
		s.sonsDaFazenda(felix);
		s.sonsDaFazenda(mimosa);
		s.sonsDaFazenda(marilu);
	}

}
