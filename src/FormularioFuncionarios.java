import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;

public class FormularioFuncionarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioFuncionarios frame = new FormularioFuncionarios();
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
	public FormularioFuncionarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		Acao a = new Acao();
		JTable tabela1 = new JTable(a.listarAdministrador());
		JTable tabela2 = new JTable(a.listarRepresentante());

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(10, 387, 192, 48);
		contentPane.add(btnVoltar);

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FormularioAdministrador fa = new FormularioAdministrador();
				dispose();

			}
		});

		JButton btnFecharApp = new JButton("Fechar App");
		btnFecharApp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFecharApp.setBackground(Color.WHITE);
		btnFecharApp.setBounds(232, 387, 192, 48);
		contentPane.add(btnFecharApp);

		btnFecharApp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});

		JScrollPane scrollPane = new JScrollPane(tabela1);
		scrollPane.setBounds(10, 21, 414, 165);
		contentPane.add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane(tabela2);
		scrollPane_1.setBounds(10, 197, 414, 165);
		contentPane.add(scrollPane_1);
	}
}
