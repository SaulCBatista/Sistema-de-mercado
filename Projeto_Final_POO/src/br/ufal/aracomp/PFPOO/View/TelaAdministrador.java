package br.ufal.aracomp.PFPOO.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class TelaAdministrador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdministrador window = new TelaAdministrador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAdministrador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoCadastrarProduto = new JButton("Cadastrar produtos");
		botaoCadastrarProduto.setBounds(121, 102, 205, 24);
		frame.getContentPane().add(botaoCadastrarProduto);
		
		JButton botaoCadastrarAdministrador = new JButton("Cadastrar administrador");
		botaoCadastrarAdministrador.setBounds(121, 132, 205, 24);
		frame.getContentPane().add(botaoCadastrarAdministrador);
	}

}
