import java.util.Scanner;

public class TestaLampada {

  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    Lampada Lampada1 = new Lampada(200,true);
    Lampada Lampada2 = new Lampada(350,false);

    System.out.print(Lampada1.toString());
    System.out.print(Lampada2.toString());
  }

}