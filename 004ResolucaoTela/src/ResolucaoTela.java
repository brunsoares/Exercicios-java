
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author bruno
 */
public class ResolucaoTela {
    public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();	//Usa o default, que será usado para pegar a dimensão
		Dimension rt = tk.getScreenSize();		//Novo objeto rt, com valores da tela
		//Mostrando a resolução na tela
		System.out.println("Sua resolução nesse momento é de = "+rt.width+" X "+rt.height);
		
	}
}
