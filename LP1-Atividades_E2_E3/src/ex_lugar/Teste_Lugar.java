package ex_lugar;
import javax.swing.JOptionPane;

public class Teste_Lugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vari�veis
		String respostaTrab;
		String respostaMorar;
		
		// Array
		Lugar[] lugares = new Lugar[5];
		
		lugares[0] = new Lugar("Rio de Janeiro", 6320000, 30);
		lugares[0].setLingua_nativa("Portugu�s-BR");
		lugares[0].setLugar_turistico(true);
		
		lugares[1] = new Lugar("Londres", 8900000, 20);
		lugares[1].setLingua_nativa("Ingl�s");
		lugares[1].setLugar_turistico(true);
		
		lugares[2] = new Lugar("Estados Unidos", 328000000, 28);
		lugares[2].setLingua_nativa("Ingl�s");
		lugares[2].setLugar_turistico(true);
		
		lugares[3] = new Lugar("Bielorr�ssia", 9400000, 17);
		lugares[3].setLingua_nativa("Bielorrusso");
		lugares[3].setLugar_turistico(false);
		
		lugares[4] = new Lugar("But�o", 750000, 20);
		lugares[4].setLingua_nativa("Butan�s");
		lugares[4].setLugar_turistico(false);
		
		// Sa�das
		for (int i = 0; i < 5; i++) {
			
			System.out.println("\nLugar " + (i+1));
			System.out.println("Nome do Lugar: " + lugares[i].getNome());
			System.out.println("N�mero de Habitantes: " + lugares[i].getHabitantes());
			System.out.println("Temperatura: " + lugares[i].getTemperatura() + " Graus");
			System.out.println("L�ngua Nativa: " + lugares[i].getLingua_nativa());
			
			if (lugares[i].isLugar_turistico() == true) {
				lugares[i].viajarFerias();
			}
			
		}
		
		respostaTrab = JOptionPane.showInputDialog("Trabalharia em algum desses lugares? Se sim, digite o n�mero do lugar. Se n�o, deixe em branco.");
		respostaMorar = JOptionPane.showInputDialog("Moraria em algum desses lugares? Se sim, digite o n�mero do lugar. Se n�o, deixe em branco.");
		
		if (respostaTrab.equals("")) {
			
		} else {
			int intTrab = Integer.parseInt(respostaTrab);
			lugares[intTrab - 1].viajarTrabalho();
		}
		
		if (respostaMorar.equals("")) {
			
		} else {
			int intMorar = Integer.parseInt(respostaMorar);
			lugares[intMorar - 1].realizarMudanca();
		}
	}

}
