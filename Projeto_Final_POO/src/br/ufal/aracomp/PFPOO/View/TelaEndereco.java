package br.ufal.aracomp.PFPOO.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField campoTextoCEP1;
	private JTextField campoTextoRua;
	private JTextField campoTextoBairro;
	private JTextField campoTextoNumero;

	public TelaEndereco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCEP = new JLabel("CEP:");
		labelCEP.setBounds(35, 35, 46, 14);
		contentPane.add(labelCEP);
		
		campoTextoCEP1 = new JTextField();
		campoTextoCEP1.setBounds(45, 56, 209, 20);
		contentPane.add(campoTextoCEP1);
		campoTextoCEP1.setColumns(10);
		
		JLabel labelTextoRua = new JLabel("Rua:");
		labelTextoRua.setBounds(35, 87, 46, 14);
		contentPane.add(labelTextoRua);
		
		campoTextoRua = new JTextField();
		campoTextoRua.setColumns(10);
		campoTextoRua.setBounds(45, 108, 209, 20);
		contentPane.add(campoTextoRua);
		
		JLabel labelBairro = new JLabel("Bairro:");
		labelBairro.setBounds(35, 139, 46, 14);
		contentPane.add(labelBairro);
		
		campoTextoBairro = new JTextField();
		campoTextoBairro.setColumns(10);
		campoTextoBairro.setBounds(45, 160, 209, 20);
		contentPane.add(campoTextoBairro);
		
		JButton botaoFinalizar = new JButton("Finalizar");
		botaoFinalizar.setBounds(45, 227, 112, 23);
		contentPane.add(botaoFinalizar);
		
		campoTextoNumero = new JTextField();
		campoTextoNumero.setColumns(10);
		campoTextoNumero.setBounds(268, 160, 68, 20);
		contentPane.add(campoTextoNumero);
		
		JLabel labelNumero = new JLabel("Número:");
		labelNumero.setBounds(258, 139, 78, 14);
		contentPane.add(labelNumero);
	}
}
