import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FormularioAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioAdministrador frame = new FormularioAdministrador();
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
	public FormularioAdministrador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setForeground(Color.BLACK);
		btnCadastrarCliente.setBackground(Color.WHITE);
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarCliente.setBounds(10, 11, 182, 65);
		contentPane.add(btnCadastrarCliente);

		btnCadastrarCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioCadastrarClientes fcc = new FormularioCadastrarClientes();

			}
		});

		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.setForeground(Color.BLACK);
		btnListarClientes.setBackground(Color.WHITE);
		btnListarClientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnListarClientes.setBounds(230, 11, 182, 65);
		contentPane.add(btnListarClientes);

		btnListarClientes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioListarClientes flc = new FormularioListarClientes();

			}
		});

		JButton btnCadastrarProdutos = new JButton("Cadastrar Produtos");
		btnCadastrarProdutos.setForeground(Color.BLACK);
		btnCadastrarProdutos.setBackground(Color.WHITE);
		btnCadastrarProdutos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarProdutos.setBounds(10, 96, 182, 65);
		contentPane.add(btnCadastrarProdutos);

		btnCadastrarProdutos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioCadastrarProdutos fcp = new FormularioCadastrarProdutos();

			}
		});

		JButton btnListarProdutos = new JButton("Listar Produtos");
		btnListarProdutos.setForeground(Color.BLACK);
		btnListarProdutos.setBackground(Color.WHITE);
		btnListarProdutos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnListarProdutos.setBounds(230, 96, 182, 65);
		contentPane.add(btnListarProdutos);

		btnListarProdutos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioListarProdutos flp = new FormularioListarProdutos();

			}
		});

		JButton btnNewButton = new JButton("Listar Funcionarios");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FormularioFuncionarios ff = new FormularioFuncionarios();
				
			}
		});
		btnNewButton.setBounds(10, 185, 182, 65);
		contentPane.add(btnNewButton);

		JButton btnVoltar = new JButton("< Voltar");
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVoltar.setBounds(230, 185, 182, 65);
		contentPane.add(btnVoltar);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setIcon(new ImageIcon("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\p.png"));
		label.setBounds(-199, 0, 643, 264);
		contentPane.add(label);

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioPrincipal fp = new FormularioPrincipal();
				dispose();
				
			}
		});
	}

}
