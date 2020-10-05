package graphical_user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Planeta;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class Form_Planeta extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textDistanciaSol;
	private JLabel lblNewLabel_2;
	private JTextField textSatelites;
	private JLabel lblNewLabel_3;
	private JTextField textTemperatura;
	private JLabel lblNewLabel_4;
	private JTextField textDiametro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Planeta frame = new Form_Planeta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form_Planeta() {
		
		setTitle("Busca de Planetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dist\u00E2ncia do Sol:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 46, 172, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(60, 10, 228, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 11, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		textDistanciaSol = new JTextField();
		textDistanciaSol.setBounds(140, 45, 228, 20);
		contentPane.add(textDistanciaSol);
		textDistanciaSol.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Sat\u00E9lites naturais:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 80, 125, 14);
		contentPane.add(lblNewLabel_2);
		
		textSatelites = new JTextField();
		textSatelites.setBounds(140, 79, 228, 20);
		contentPane.add(textSatelites);
		textSatelites.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Temperatura M\u00E9dia:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 116, 178, 19);
		contentPane.add(lblNewLabel_3);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(153, 117, 215, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Di\u00E2metro:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 150, 125, 14);
		contentPane.add(lblNewLabel_4);
		
		textDiametro = new JTextField();
		textDiametro.setBounds(82, 149, 286, 20);
		contentPane.add(textDiametro);
		textDiametro.setColumns(10);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(153, 197, 125, 36);
		contentPane.add(btnLimparCampos);
		// Listener Limpar Campos
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				}
		});
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(309, 7, 97, 27);
		contentPane.add(btnProcurar);
		// Listener Procurar
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurarPlaneta();
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(335, 230, 89, 20);
		contentPane.add(btnFechar);
		// Listener Fechar
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	// Métodos
	
	public void limparCampos() {
		textNome.setText("");
		textDistanciaSol.setText("");
		textSatelites.setText("");
		textTemperatura.setText("");
		textDiametro.setText("");
	}
	
	public void procurarPlaneta() {
		// Array
		Planeta[] planetas = new Planeta[8];
		
		planetas[0] = new Planeta("Mercúrio", "57.910.000 Km", 0, "550°C", "4.879,4 Km");
		planetas[1] = new Planeta("Vênus", "108.200.000 Km", 0, "460°C", "12.104 Km");
		planetas[2] = new Planeta("Terra", "149.600.000 Km", 1, "14°C", "12.742 Km");
		planetas[3] = new Planeta("Marte", "227.940.000 Km", 2, "-10°C", "6.779 Km");
		planetas[4] = new Planeta("Júpiter", "778.330.000 Km", 16, "-100°C", "139.820 Km");
		planetas[5] = new Planeta("Saturno", "1.429.400.000 Km", 18, "-140°C", "116.460 Km");
		planetas[6] = new Planeta("Urano", "2.880.990.000 Km", 27, "-200°C", "50.724 Km");
		planetas[7] = new Planeta("Netuno", "4.504.300.000 Km", 13, "-218°C", "49.244 Km");
		
		// Varredura
		for (int i = 0; i < 9; i++) {
			if (textNome.getText().equals(planetas[i].getNome())) {
				textDistanciaSol.setText(planetas[i].getDistanciaSol());
				textSatelites.setText(Integer.toString(planetas[i].getSatelitesNaturais()));
				textTemperatura.setText(planetas[i].getTemperatura());
				textDiametro.setText(planetas[i].getDiametro());
				break;
			}
		}
	}
}
