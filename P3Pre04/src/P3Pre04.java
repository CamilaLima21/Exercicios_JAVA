
public class P3Pre04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s1, s2, s3, s4, numerador, denominador;
		s1 = s2 = s3 = s4 = 0.0;
		
		
		// primeira soma
		numerador = 1;
		denominador = 1;
		for(int i = 0; i < 50; i++) {
		s1 += numerador/denominador;	
		numerador += 2;
		denominador ++;
		System.out.println(numerador+"/"+denominador);	
		}
		System.out.println("S1 = "+s1);
		System.out.println("-----------------------------------");
		
		
		// segunda soma
		numerador = 2.0;
		denominador = 50.0;
		for(int i = 0; i < 50; i++) {
		s2 += numerador/denominador;	
		numerador *= 2;
		denominador --;
		System.out.println(numerador+"/"+denominador);	
		}
		System.out.println("S2 = "+s2);
		System.out.println("-----------------------------------");
		
		
		//terceira soma
		numerador = 37;
		denominador = 1;
		for(int i = 0; i < 37; i++) {
		s3 += numerador*(numerador + 1)/denominador;	
		numerador --;
		denominador ++;
		System.out.println(numerador+"*"+(numerador+1)+"/"+denominador);	
		}
		System.out.println("S3 = "+s3);
		System.out.println("-----------------------------------");
		
		
		//quarta soma
				numerador = 1;
				denominador = 1;
				double sinal = 1;
				for(int i = 0; i < 10; i++) {
				System.out.println(numerador + "/"+denominador);	
				s4 += sinal * numerador/denominador;	
				numerador ++;
				denominador = numerador * numerador;
				sinal = sinal * (-1);
				}
				System.out.println("S4 = "+s4);
				System.out.println("-----------------------------------");
				
		
	}

}
