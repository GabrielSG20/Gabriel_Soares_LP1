package ex_pessoa;
import javax.swing.JOptionPane;

public class Teste_Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		String retornoAltura;
		String retornoMassa;
		String retornoSexo;
		
		// Array
		Pessoa[] pessoas = new Pessoa[5];
		
		// Processamento
		for (int i = 0 ; i < 5; i++) {
			pessoas[i] = new Pessoa(JOptionPane.showInputDialog("Informe o nome da pessoa " + (i+1) + ":"));
			
			retornoSexo = JOptionPane.showInputDialog("Infome o sexo do/da " + pessoas[i].getNome() + " (M/F): ");
			retornoAltura = JOptionPane.showInputDialog("Informe a altura do/da " + pessoas[i].getNome() + " (em metros): ");
			retornoMassa = JOptionPane.showInputDialog("Infome a massa do/da " + pessoas[i].getNome() + " (em quilogramas): ");
			
			float floatAltura = Float.parseFloat(retornoAltura);
			float floatMassa = Float.parseFloat(retornoMassa);
			char charSexo = retornoSexo.charAt(0);
		
			pessoas[i].setSexo(charSexo);
			pessoas[i].setAltura(floatAltura);
			pessoas[i].setMassa(floatMassa);
			
			float imc = floatMassa / (floatAltura*floatAltura);
			
			// Saídas
			System.out.println("\nPessoa " + (i+1));
			System.out.println("Nome: " + pessoas[i].getNome() + ".");
			System.out.println("Sexo: " + pessoas[i].getSexo() + ".");
			System.out.println("Altura: " + pessoas[i].getAltura() + " m.");
			System.out.println("Massa: " + pessoas[i].getMassa() + " Kg.");
			if (imc < 18.5) {
				System.out.println("Abaixo do peso.");
				pessoas[i].comer();
				pessoas[i].fazerExercicios();
			}else if (imc > 18.6 && imc < 24.9) {
				System.out.println("Saudável.");
				pessoas[i].sorrir();
			}else if(imc > 25.0) {
				System.out.println("Peso em Excesso.");
				pessoas[i].fazerExercicios();
			}
		}
	}

}
