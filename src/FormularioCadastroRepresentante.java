import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Toolkit;

public class FormularioCadastroRepresentante extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCadastroRepresentante frame = new FormularioCadastroRepresentante();
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
	public FormularioCadastroRepresentante() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JLabel lblCadastramentoDeRepresentante = new JLabel("Cadastramento de Representante");
		lblCadastramentoDeRepresentante.setForeground(Color.WHITE);
		lblCadastramentoDeRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastramentoDeRepresentante.setBackground(Color.WHITE);
		lblCadastramentoDeRepresentante.setBounds(10, 30, 321, 50);
		contentPane.add(lblCadastramentoDeRepresentante);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(
				"C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_icon-person-add_211872.png"));
		button.setBackground(Color.WHITE);
		button.setBounds(304, 72, 120, 114);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 207, 207, 14);
		contentPane.add(label);

		// ButtonGroup
		ButtonGroup usuarios = new ButtonGroup();

		// Instanciar ArrayList
		Acao b = new Acao();

		JTable tabela2 = new JTable(b.listarRepresentante());

		// Ação ao botão
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (passwordField.getText().equals(passwordField_1.getText())) {

					// Obter dados informados pelo usuário
					String loginRepresentante = textField.getText();
					String senhaRepresentante = passwordField.getText();

					// Criar objeto e chamar o método
					b.cadastrarRepresentante(loginRepresentante, senhaRepresentante);

					// Atualizar tabela
					tabela2.setModel(b.listarRepresentante());

					// Manter ou limpar JLabel de senhas incorretas
					label.setText("");

					// Limpar campos
					textField.setText("");
					passwordField.setText("");
					passwordField_1.setText("");

				} else {

					label.setText("As senhas não coincidem!!");

					// Limpar campos
					passwordField.setText("");
					passwordField_1.setText("");

				}

			}

		});

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(10, 91, 46, 14);
		contentPane.add(lblNome);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setBounds(10, 133, 46, 14);
		contentPane.add(lblSenha);

		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfirmarSenha.setForeground(Color.WHITE);
		lblConfirmarSenha.setBackground(Color.WHITE);
		lblConfirmarSenha.setBounds(10, 178, 113, 14);
		contentPane.add(lblConfirmarSenha);

		textField = new JTextField();
		textField.setBounds(66, 88, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(119, 175, 86, 20);
		contentPane.add(passwordField_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(66, 130, 86, 20);
		contentPane.add(passwordField);

		JScrollPane scrollPane = new JScrollPane(tabela2);
		scrollPane.setBounds(10, 232, 414, 200);
		contentPane.add(scrollPane);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setBounds(335, 198, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnVoltar = new JButton("< Voltar");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(0, 0, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\p.png"));
		label_1.setBounds(-195, 0, 710, 443);
		contentPane.add(label_1);

		btnExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int linha = tabela2.getSelectedRow();
				b.excluirRepresentante(linha);

				DefaultTableModel dtm = (DefaultTableModel) tabela2.getModel();
				if (tabela2.getSelectedRow() >= 0) {
					dtm.removeRow(tabela2.getSelectedRow());
					tabela2.setModel(dtm);
				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um usuario na tabela.");
				}

			}
		});

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioEscolhaCadastro fec = new FormularioEscolhaCadastro();
				dispose();

			}
		});

	}

}
