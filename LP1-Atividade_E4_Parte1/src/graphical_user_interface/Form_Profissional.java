package graphical_user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Profissional;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Form_Profissional extends JFrame {

	private JPanel contentPane;
	private JTextField textPID;
	private JTextField textNome;
	private JLabel lblNewLabel_2;
	private JTextField textProfissao;
	private JLabel lblNewLabel_3;
	private JTextField textCargo;
	private JLabel lblNewLabel_4;
	private JTextField textSalario;
	private ArrayList<Profissional> profissionais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Profissional frame = new Form_Profissional();
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
	public Form_Profissional() {
		// ArrayList
		profissionais = new ArrayList<Profissional>();
		
		// Itens da interface
		setTitle("Cadastro de Profissional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textPID = new JTextField();
		textPID.setBounds(47, 10, 241, 20);
		contentPane.add(textPID);
		textPID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 46, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(60, 41, 308, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Profiss\u00E3o:\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 80, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		textProfissao = new JTextField();
		textProfissao.setBounds(84, 79, 284, 20);
		contentPane.add(textProfissao);
		textProfissao.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Cargo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 116, 56, 19);
		contentPane.add(lblNewLabel_3);
		
		textCargo = new JTextField();
		textCargo.setBounds(60, 115, 308, 20);
		contentPane.add(textCargo);
		textCargo.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 150, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		textSalario = new JTextField();
		textSalario.setBounds(70, 149, 138, 20);
		contentPane.add(textSalario);
		textSalario.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(153, 197, 113, 36);
		contentPane.add(btnSalvar);
		// Listener Salvar
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProfissional();
			}
		});
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(309, 7, 97, 27);
		contentPane.add(btnProcurar);
		// Listener Procurar
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurarProfissional();
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
		textPID.setText("");
		textNome.setText("");
		textProfissao.setText("");
		textCargo.setText("");
		textSalario.setText("");
	}
	
	public void addProfissional() {
		
		// Adição no ArrayList
		Profissional p = new Profissional(Integer.valueOf(textPID.getText()), textNome.getText());
		p.setProfissao(textProfissao.getText());
		p.setCargo(textCargo.getText());
		p.setSalario(Float.valueOf(textSalario.getText()));
		
		Profissional t = new Profissional();
		if (profissionais.size() > 0) {
			for (int i = 0; i < profissionais.size(); i++) {
				
				t = (Profissional)profissionais.get(i);
				
				if (t.getPid() == p.getPid()) {
					profissionais.add(i,p);
					break;
				} else {
					profissionais.add(p);
				}
				}
			} else {
			profissionais.add(p);
		}

		limparCampos();
	}
	
	public void procurarProfissional() {
		// Varredura na ArrayList
		Profissional p = new Profissional();
		
		for (int i = 0; i < profissionais.size(); i++) {
			p = (Profissional)profissionais.get(i);
			
			if (p.getPid() == Integer.valueOf(textPID.getText())) {
				textPID.setText(String.valueOf(p.getPid()));
				textNome.setText(p.getNome());
				textProfissao.setText(p.getProfissao());
				textCargo.setText(p.getCargo());
				textSalario.setText(String.valueOf(p.getSalario()));
				break;
			}
		}
	}
}
