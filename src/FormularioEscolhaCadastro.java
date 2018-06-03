import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class FormularioEscolhaCadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioEscolhaCadastro frame = new FormularioEscolhaCadastro();
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
	public FormularioEscolhaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas Francisco\\Desktop\\Java - Fundamentos\\01 - Conceitos OO\\TrabalhoAvaliativo\\src\\Imagens\\if_crazy-weather_1291752.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 214);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrador");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(73, 78, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Representante");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(260, 78, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		// ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(rdbtnNewRadioButton);
		turnos.add(rdbtnNewRadioButton_1);

		JLabel lblQueTipoDe = new JLabel("Que tipo de cadastro deseja realizar?");
		lblQueTipoDe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblQueTipoDe.setBounds(73, 11, 296, 50);
		contentPane.add(lblQueTipoDe);

		JButton btnAvanar = new JButton("Avan\u00E7ar >");
		btnAvanar.setBackground(Color.WHITE);
		btnAvanar.setBounds(249, 119, 102, 23);
		contentPane.add(btnAvanar);
		
		JButton button = new JButton("< Voltar");
		button.setBackground(Color.WHITE);
		button.setBounds(73, 119, 102, 23);
		contentPane.add(button);

		//ação
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormularioPrincipal fp = new FormularioPrincipal();
				dispose();
				
			}
		});
		
		// Ação do botão
		btnAvanar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (rdbtnNewRadioButton.isSelected()) {
					
					FormularioCadastro fc = new FormularioCadastro();
					dispose();
					
				}else if(rdbtnNewRadioButton_1.isSelected()){
					
					FormularioCadastroRepresentante fcr = new FormularioCadastroRepresentante();
					dispose();
				}

			}
		});
	}

}
