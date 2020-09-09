package ex_instrumento_musical;

import javax.swing.JOptionPane;

public class Teste_InstrumentoMusical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variáveis
		String retornoPreco;
		String retornoEscolha;
		
		// Array
		InstrumentoMusical[] instrumentos = new InstrumentoMusical[5];
						
		// Processamento
		for (int i = 0 ; i < 5; i++) {
							
			instrumentos[i] = new InstrumentoMusical(JOptionPane.showInputDialog("Informe o nome do Instrumento Musical " + (i+1) + ":"), JOptionPane.showInputDialog("Informe o tipo do Instrumento Musical " + (i+1) + ":"));
			
			retornoPreco = JOptionPane.showInputDialog("Informe o preço do Instrumento Musical " + (i+1) + ":");
			float floatPreco = Float.parseFloat(retornoPreco);
										
			instrumentos[i].setMarca(JOptionPane.showInputDialog("Informe a marca do Instrumento Musical " + (i+1) + ":"));
			instrumentos[i].setPreco(floatPreco);
			
			// Saídas
			System.out.println("Instrumento Musical " + (i+1));
			System.out.println("Nome: " + instrumentos[i].getNome() + ".");
			System.out.println("Tipo: " + instrumentos[i].getTipo() + ".");
			System.out.println("Marca: " + instrumentos[i].getMarca() + ".");
			System.out.println("Preço: R$" + instrumentos[i].getPreco() + ".\n");
							
			}
		retornoEscolha = JOptionPane.showInputDialog("Escolha o número de um Instrumento Musical que você gostaria de ter e tocar (número): ");
		int intEscolha = Integer.parseInt(retornoEscolha);

		instrumentos[intEscolha - 1].tocar();
		instrumentos[intEscolha - 1].afinar();
		instrumentos[intEscolha - 1].guardar();
	}

}
