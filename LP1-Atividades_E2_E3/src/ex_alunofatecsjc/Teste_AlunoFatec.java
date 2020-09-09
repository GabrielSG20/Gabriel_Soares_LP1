package ex_alunofatecsjc;

import javax.swing.JOptionPane;

public class Teste_AlunoFatec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		AlunoFatec[] alunos = new AlunoFatec[5];
		alunos[0] = new AlunoFatec("Gabriel Soares","Banco de Dados", "Noturno");
		alunos[1] = new AlunoFatec("Roberta Santos","ADS", "Matutino");
		alunos[2] = new AlunoFatec("Brian Teodoro","Logística", "Matutino");
		alunos[3] = new AlunoFatec("Raíssa Oliveira","Manutenção de Aeronaves", "Noturno");
		alunos[4] = new AlunoFatec("Bernardo Toledo","PEA", "Noturno");
		
		// Processamento e Saídas
		for (int i = 0; i < 5; i++) {
			System.out.println("\nAluno " + (i+1));
			System.out.println("Nome: " + alunos[i].getNome() + ".");
			System.out.println("Curso: " + alunos[i].getCurso() + ".");
			System.out.println("Período: " + alunos[i].getPeriodo() + ".");
			
			String retornoNota1 = JOptionPane.showInputDialog("Informe a nota 1 do aluno(a) " + alunos[i].getNome() + ":");
			String retornoNota2 = JOptionPane.showInputDialog("Informe a nota 2 do aluno(a) " + alunos[i].getNome() + ":");
			float floatNota1 = Float.parseFloat(retornoNota1);
			float floatNota2 = Float.parseFloat(retornoNota2);
			
			alunos[i].setNota1(floatNota1);
			alunos[i].setNota2(floatNota2);
			
			System.out.println("Nota 1: " + alunos[i].getNota1() + ".");
			System.out.println("Nota 2: " + alunos[i].getNota2() + ".");
			System.out.println("Média: " + alunos[i].obterMedia(alunos[i].getNota1(), alunos[i].getNota2()) + ".");
			
			if (alunos[i].obterMedia(alunos[i].getNota1(), alunos[i].getNota2()) >= 6){
				System.out.println("Ótimo desempenho! Continue assim!");
			} else {
				alunos[i].estudar();
				alunos[i].entregarTrabs();
			}
		}
	}

}
