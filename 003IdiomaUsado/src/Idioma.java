
import java.util.Locale;

/**
 *
 * @author bruno
 */
public class Idioma {
    public static void main(String[] args) {
		Locale local = Locale.getDefault();	//Biblioteca para pegar dados do S.O, usa o default do S.O
		//Pegando o idioma usado e mostrando
		System.out.println("O idioma usado em seu dispositivo é "+local.getDisplayLanguage()+" com a sigla "+local.toString());
		
	}
}
