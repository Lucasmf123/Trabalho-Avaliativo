import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FormularioListarProdutos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioListarProdutos frame = new FormularioListarProdutos();
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
	public FormularioListarProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		Acao a = new Acao();
		JTable tabela = new JTable(a.listarProdutoCadastrado());

		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(10, 11, 414, 201);
		contentPane.add(scrollPane);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
				if (tabela.getSelectedRow() >= 0) {
					dtm.removeRow(tabela.getSelectedRow());
					tabela.setModel(dtm);
					int linha = tabela.getSelectedRow();
					a.excluir(linha);
				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um produto na tabela.");
				}

			}
		});

		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setBounds(10, 223, 208, 27);
		contentPane.add(btnExcluir);

		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(228, 223, 196, 27);
		contentPane.add(btnNewButton);
	}

}
