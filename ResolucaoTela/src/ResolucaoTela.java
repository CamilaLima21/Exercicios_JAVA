import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dimensao = tk.getScreenSize();
		System.out.println("A largura da tela é: "+dimensao.width);
		System.out.println("A altura da tela é: "+dimensao.height);

	}

}
