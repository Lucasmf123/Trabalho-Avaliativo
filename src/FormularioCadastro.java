import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class FormularioCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCadastro frame = new FormularioCadastro();
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
	public FormularioCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastramentoDeNovo = new JLabel("Cadastramento de Administrador");
		lblCadastramentoDeNovo.setForeground(Color.WHITE);
		lblCadastramentoDeNovo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastramentoDeNovo.setBounds(10, 11, 292, 69);
		contentPane.add(lblCadastramentoDeNovo);

		JButton button = new JButton("");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(
				"C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_icon-person-add_211872.png"));
		button.setBounds(304, 91, 120, 114);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 217, 207, 14);
		contentPane.add(label);

		// ButtonGroup
		ButtonGroup usuarios = new ButtonGroup();
		
		//Instanciar ArrayList
		Acao a = new Acao();

		JTable tabela = new JTable(a.listarAdministrador());

		// Ação ao botão
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(passwordField.getText().equals(passwordField_1.getText())) {
					
				// Obter dados informados pelo usuário
				String loginAdministrador = textField.getText();
				String senhaAdministrador = passwordField.getText();

				// Criar objeto e chamar o método
				a.cadastrarAdministrador(loginAdministrador, senhaAdministrador);

				// Atualizar tabela
				tabela.setModel(a.listarAdministrador());

				//Manter ou limpar JLabel de senhas incorretas
				label.setText("");
				
				// Limpar campos
				textField.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
				
				}else {
					
					label.setText("As senhas não coincidem!!");
					
					// Limpar campos
					passwordField.setText("");
					passwordField_1.setText("");
					
				}
				
			}

		});

		textField = new JTextField();
		textField.setBounds(65, 91, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(65, 136, 86, 20);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(116, 185, 86, 20);
		contentPane.add(passwordField_1);

		JLabel lblTipo = new JLabel("Nome:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBackground(Color.WHITE);
		lblTipo.setBounds(10, 94, 100, 14);
		contentPane.add(lblTipo);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setBounds(10, 139, 100, 14);
		contentPane.add(lblSenha);

		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfirmarSenha.setForeground(Color.WHITE);
		lblConfirmarSenha.setBackground(Color.WHITE);
		lblConfirmarSenha.setBounds(10, 188, 112, 14);
		contentPane.add(lblConfirmarSenha);
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(10, 242, 414, 190);
		contentPane.add(scrollPane);
		setVisible(true);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.BLACK);
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setBounds(335, 209, 89, 23);
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
				
				int linha = tabela.getSelectedRow();
				a.excluirAdministrador(linha);
				
				DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
		        if (tabela.getSelectedRow() >= 0){
		            dtm.removeRow(tabela.getSelectedRow());
		            tabela.setModel(dtm);
		        }else{
		            JOptionPane.showMessageDialog(null, "Favor selecionar um usuário na tabela.");
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
