import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;

public class FormularioCadastrarClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCadastrarClientes frame = new FormularioCadastrarClientes();
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
	public FormularioCadastrarClientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 491);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 118, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Rua:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 47, 118, 25);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Complemento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 83, 118, 25);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 119, 118, 25);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Dono da Empresa:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 155, 118, 25);
		contentPane.add(lblNewLabel_4);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBounds(10, 204, 207, 33);
		contentPane.add(btnCadastrar);

		// Instanciar
		Acao a = new Acao();

		// JTabel
		JTable table = new JTable(a.listarClienteCadastrado());

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeCliente = textField.getText();
				String ruaCliente = textField_1.getText();
				int numeroCliente = Integer.parseInt(textField_2.getText());
				int telefoneCliente = Integer.parseInt(textField_3.getText());
				String nomedonoCliente = textField_4.getText();

				// Criar objeto e chamar o método
				a.Cadastrar(nomeCliente, ruaCliente, numeroCliente, telefoneCliente, nomedonoCliente);

				// Atualizar tabela
				table.setModel(a.listarClienteCadastrado());

				// Linpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");

				// Cursor no campo código produto
				textField.requestFocus();

			}
		});

		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(227, 204, 197, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});

		textField = new JTextField();
		textField.setBounds(227, 14, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(227, 50, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(227, 86, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(227, 122, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(227, 158, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 273, 414, 168);
		contentPane.add(scrollPane);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				a.excluir(linha);
				
				DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		        if (table.getSelectedRow() >= 0){
		            dtm.removeRow(table.getSelectedRow());
		            table.setModel(dtm);
		        }else{
		            JOptionPane.showMessageDialog(null, "Favor selecionar um cliente na tabela.");
		        }
				
			}
		});
		btnExcluir.setBounds(10, 248, 89, 23);
		contentPane.add(btnExcluir);
	}
}
