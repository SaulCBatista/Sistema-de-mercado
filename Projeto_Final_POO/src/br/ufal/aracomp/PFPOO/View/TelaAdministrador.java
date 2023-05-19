package br.ufal.aracomp.PFPOO.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;

	public TelaAdministrador() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoCadastrarAdm = new JButton("Cadastrar administrador");
		botaoCadastrarAdm.setBounds(145, 81, 168, 23);
		contentPane.add(botaoCadastrarAdm);
		
		JButton botaoCadastrarProduto = new JButton("Cadastrar produto");
		botaoCadastrarProduto.setBounds(145, 115, 168, 23);
		contentPane.add(botaoCadastrarProduto);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		botaoVoltar.setBounds(180, 168, 105, 16);
		contentPane.add(botaoVoltar);
	}

}
