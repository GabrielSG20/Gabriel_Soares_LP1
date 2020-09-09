package ex_profissional;

import javax.swing.JOptionPane;

public class Teste_Profissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		Profissional[] profissionais = new Profissional[5];
	
		// Processamento e Saídas
		for (int i = 0; i < 5; i++) {
			profissionais[i] = new Profissional(JOptionPane.showInputDialog("Informe o nome do profissional " + (i+1) + ":"));
			profissionais[i].setProfissao(JOptionPane.showInputDialog("Informe a profissão do profissional " + profissionais[i].getNome() + ":"));
			profissionais[i].setCargo(JOptionPane.showInputDialog("Informe o cargo do profissional " + profissionais[i].getNome() + ":"));
			
			String retornoSalario = JOptionPane.showInputDialog("Informe o salário do profissional " + profissionais[i].getNome() + ":");
			float floatSalario = Float.parseFloat(retornoSalario);
			profissionais[i].setSalario(floatSalario);
			
			System.out.println("\nProfissonal " + (i+1));
			System.out.println("Nome: " + profissionais[i].getNome() + ".");
			System.out.println("Profissão: " + profissionais[i].getProfissao() + ".");
			System.out.println("Cargo: " + profissionais[i].getCargo() + ".");
			System.out.println("Salário: " + profissionais[i].getSalario() + ".");
			profissionais[i].trabalhar();
		}
		String retornoAumento = JOptionPane.showInputDialog("Escolha um profissional para receber um aumento (número): ");
		int intAumento = Integer.parseInt(retornoAumento);
		profissionais[intAumento-1].receberAumento();
		
		String retornoPromocao = JOptionPane.showInputDialog("Escolha um profissional para receber uma promoção (número): ");
		int intPromocao = Integer.parseInt(retornoPromocao);
		profissionais[intPromocao-1].receberPromocao();
	}

}
