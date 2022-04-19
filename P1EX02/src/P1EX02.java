public class P1EX02 {
	public static void main(String[] args) {
		int q1 = 10;
		int q2 = 5;
		int q3 = 15;
		int q4 = 13;
		int q5 = 2;
		int q6 = 8;
		double d = 5.11;
		double R = (q1 * 1.0  + 
				    q2 * 0.5  +
				    q3 * 0.25 +
				    q4 * 0.10 +
				    q5 * 0.05 +
				    q6 * 0.01 ) * d;
     System.out.println("No cofrinho haviam " + R + " Reais!");
	}
}