import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class FormularioRepresentante extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioRepresentante frame = new FormularioRepresentante();
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
	public FormularioRepresentante() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 297);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCadastrarCliente.setBackground(Color.WHITE);
		btnCadastrarCliente.setBounds(10, 11, 169, 71);
		contentPane.add(btnCadastrarCliente);

		btnCadastrarCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioCadastrarClientes fcc = new FormularioCadastrarClientes();
				

			}
		});

		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnListarClientes.setBackground(Color.WHITE);
		btnListarClientes.setBounds(10, 93, 169, 71);
		contentPane.add(btnListarClientes);

		btnListarClientes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioListarClientes flc = new FormularioListarClientes();
				

			}
		});

		JButton btnListarProdutos = new JButton("Listar Produtos");
		btnListarProdutos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnListarProdutos.setBackground(Color.WHITE);
		btnListarProdutos.setBounds(10, 175, 169, 71);
		contentPane.add(btnListarProdutos);

		btnListarProdutos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioListarProdutos flp = new FormularioListarProdutos();
				

			}
		});

		JButton btnNewButton = new JButton("< Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(223, 51, 169, 71);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormularioPrincipal fp = new FormularioPrincipal();
				dispose();
				
			}
		});

		JButton btnNewButton_2 = new JButton("Fechar App");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(223, 135, 169, 71);
		contentPane.add(btnNewButton_2);
	}
}
