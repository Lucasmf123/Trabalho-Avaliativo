import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
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
	public FormularioPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		passwordField = new JPasswordField();
		passwordField.setBounds(204, 410, 86, 20);
		contentPane.add(passwordField);

		textField = new JTextField();
		textField.setBounds(204, 343, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBounds(396, 450, 89, 23);
		contentPane.add(btnEntrar);

		// Ação do botão Entrar
		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int indice = 0; indice < Representante.dadosRepresentante.size(); indice++) {

					if ((textField.getText().equals(
							String.valueOf(Representante.dadosRepresentante.get(indice).getLoginRepresentante())))
							&& (passwordField.getText().equals(String
									.valueOf(Representante.dadosRepresentante.get(indice).getSenhaRepresentante())))) {

						FormularioRepresentante fr = new FormularioRepresentante();
						dispose();

					} 

				}

				for (int indice2 = 0; indice2 < Administrador.dadosAdministrador.size(); indice2++) {

					if ((textField.getText().equals(
							String.valueOf(Administrador.dadosAdministrador.get(indice2).getLoginAdministrador())))
							&& (passwordField.getText().equals(String
									.valueOf(Administrador.dadosAdministrador.get(indice2).getSenhaAdministrador())))) {

						FormularioAdministrador fa = new FormularioAdministrador();
						dispose();

					} 
				}

			}
		});

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(10, 450, 98, 23);
		contentPane.add(btnCadastrar);

		// Ação do botão Cadastro
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((textField.getText()).equals("adm") && (passwordField.getText()).equals("123")) {

					FormularioEscolhaCadastro fec = new FormularioEscolhaCadastro();
					dispose();

				} else {
					JOptionPane.showMessageDialog(null,
							"Erro!\n\n*Definição do Erro: Apenas Adm pré-definido pelo desenvolvedor tem acesso a este recurso.*",
							"Erro de Entrada", JOptionPane.ERROR_MESSAGE);

					// Limpar campos
					textField.setText("");
					passwordField.setText("");

					// Cursor no campo nome
					textField.requestFocus();
				}

			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(
				"C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_Rounded-31_2024644.png"));
		label_1.setBounds(232, 302, 32, 41);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(
				"C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if.png"));
		label_2.setBounds(232, 374, 32, 32);
		contentPane.add(label_2);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\distribuidora123.jpg"));
		label.setBounds(0, 0, 545, 484);
		contentPane.add(label);
	}
}
