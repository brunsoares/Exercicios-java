
import java.util.Date;

/**
 *
 * @author bruno
 */
public class HoraSistema {
    public static void main(String [] args) {
		//Atalho para o metodo principal, main -> ctrl + space
		//Adicionando biblioteca date, pegar hora do sistema
		//Criando objeto date, onde pega valores da classe
		Date date = new Date();
		//Atalho para print, sysout -> ctrl + space
		System.out.println("Hoje é dia: "+date.toString()); //Converte o valor para string, poderia ser usado o clone()
		
	}
}
