package ex_profissional;

import javax.swing.JOptionPane;

public class Teste_Profissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		Profissional[] profissionais = new Profissional[5];
	
		// Processamento e Sa�das
		for (int i = 0; i < 5; i++) {
			profissionais[i] = new Profissional(JOptionPane.showInputDialog("Informe o nome do profissional " + (i+1) + ":"));
			profissionais[i].setProfissao(JOptionPane.showInputDialog("Informe a profiss�o do profissional " + profissionais[i].getNome() + ":"));
			profissionais[i].setCargo(JOptionPane.showInputDialog("Informe o cargo do profissional " + profissionais[i].getNome() + ":"));
			
			String retornoSalario = JOptionPane.showInputDialog("Informe o sal�rio do profissional " + profissionais[i].getNome() + ":");
			float floatSalario = Float.parseFloat(retornoSalario);
			profissionais[i].setSalario(floatSalario);
			
			System.out.println("\nProfissonal " + (i+1));
			System.out.println("Nome: " + profissionais[i].getNome() + ".");
			System.out.println("Profiss�o: " + profissionais[i].getProfissao() + ".");
			System.out.println("Cargo: " + profissionais[i].getCargo() + ".");
			System.out.println("Sal�rio: " + profissionais[i].getSalario() + ".");
			profissionais[i].trabalhar();
		}
		String retornoAumento = JOptionPane.showInputDialog("Escolha um profissional para receber um aumento (n�mero): ");
		int intAumento = Integer.parseInt(retornoAumento);
		profissionais[intAumento-1].receberAumento();
		
		String retornoPromocao = JOptionPane.showInputDialog("Escolha um profissional para receber uma promo��o (n�mero): ");
		int intPromocao = Integer.parseInt(retornoPromocao);
		profissionais[intPromocao-1].receberPromocao();
	}

}
