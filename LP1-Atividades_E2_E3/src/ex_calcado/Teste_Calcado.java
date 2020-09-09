package ex_calcado;

import javax.swing.JOptionPane;

public class Teste_Calcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vari�veis
		String retornoTamanho;
		String retornoPreco;
		String retornoGenero;
				
		// Array
		Calcado[] calcados = new Calcado[5];
				
		// Processamento
		for (int i = 0 ; i < 5; i++) {
			retornoGenero = JOptionPane.showInputDialog("Infome se o cal�ado " + (i+1) + " � masculiano ou feminino (M/F): ");
			char charGenero = retornoGenero.charAt(0);
					
					
			calcados[i] = new Calcado(JOptionPane.showInputDialog("Informe o tipo do cal�ado " + (i+1) + ":"), charGenero);
				
			retornoTamanho = JOptionPane.showInputDialog("Informe o tamanho do cal�ado " + (i+1) + ": ");
			retornoPreco = JOptionPane.showInputDialog("Infome o pre�o do cal�ado " + (i+1) + ": ");
					
			int intTamanho = Integer.parseInt(retornoTamanho);
			float floatPreco = Float.parseFloat(retornoPreco);
				
			calcados[i].setTamanho(intTamanho);
			calcados[i].setPreco(floatPreco);
					
			// Sa�das
			System.out.println("\nCal�ado " + (i+1));
			System.out.println("Tipo: " + calcados[i].getTipo() + ".");
			System.out.println("G�nero: " + calcados[i].getGenero() + ".");
			System.out.println("Tamanho: " + calcados[i].getTamanho() + ".");
			System.out.println("Pre�o: R$" + calcados[i].getPreco() + ".");
			calcados[i].calcar();
			calcados[i].andar();
			calcados[i].lavar();
			}
		}
	}
