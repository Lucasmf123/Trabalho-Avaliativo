import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class FormularioCadastrarProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	
	public FormularioCadastrarProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 477);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JLabel lblCadastramento = new JLabel("Cadastro de Produtos");
		lblCadastramento.setForeground(Color.BLACK);
		lblCadastramento.setBackground(Color.WHITE);
		lblCadastramento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastramento.setBounds(31, 35, 199, 64);
		contentPane.add(lblCadastramento);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Greyce Alessandra\\Documents\\ImagensJava\\1188683-64.png"));
		label.setBounds(460, 35, 72, 64);
		contentPane.add(label);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo:");
		lblCdigoDoProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDoProduto.setForeground(Color.BLACK);
		lblCdigoDoProduto.setBackground(Color.WHITE);
		lblCdigoDoProduto.setBounds(31, 126, 120, 14);
		contentPane.add(lblCdigoDoProduto);
		
		textField_6 = new JTextField();
		textField_6.setBounds(151, 123, 307, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNomeDoProduto = new JLabel("Nome:");
		lblNomeDoProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeDoProduto.setForeground(Color.BLACK);
		lblNomeDoProduto.setBackground(Color.WHITE);
		lblNomeDoProduto.setBounds(31, 151, 120, 14);
		contentPane.add(lblNomeDoProduto);
		
		textField_7 = new JTextField();
		textField_7.setBounds(151, 148, 307, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrio.setForeground(Color.BLACK);
		lblDescrio.setBackground(Color.WHITE);
		lblDescrio.setBounds(31, 176, 120, 14);
		contentPane.add(lblDescrio);
		
		textField_8 = new JTextField();
		textField_8.setBounds(151, 173, 307, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor da Unidade:");
		lblValorUnitrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorUnitrio.setForeground(Color.BLACK);
		lblValorUnitrio.setBackground(Color.WHITE);
		lblValorUnitrio.setBounds(31, 201, 120, 14);
		contentPane.add(lblValorUnitrio);
		
		textField_10 = new JTextField();
		textField_10.setBounds(151, 198, 307, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		textField_10.setText("");
		
		//Instanciar
		Acao a = new Acao();
		
		//JTabel
		JTable table = new JTable(a.listarProdutoCadastrado());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(31, 228, 644, 196);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				// Obter os dados informados pelo usuário
				double codigoProduto = Double.parseDouble(textField_6.getText());
				String nomeProduto = textField_7.getText();
				String descricao = textField_8.getText();
				double valorUnitario = Double.parseDouble(textField_10.getText());
				
				//Criar objeto e chamar o método
				a.Cadastrar1(codigoProduto, nomeProduto, descricao, valorUnitario);
				
				//Atualizar tabela
				table.setModel(a.listarProdutoCadastrado());
				
				//Linpar campos
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_10.setText("");
				
				//Cursor no campo código produto
				textField_6.requestFocus();
			
			}
		});
		btnCadastrar.setBounds(548, 122, 127, 36);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBackground(Color.WHITE);
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				
			}
		});
		btnSair.setBounds(548, 166, 127, 35);
		contentPane.add(btnSair);
		setLocationRelativeTo(null);
		
		
		
	}
}
