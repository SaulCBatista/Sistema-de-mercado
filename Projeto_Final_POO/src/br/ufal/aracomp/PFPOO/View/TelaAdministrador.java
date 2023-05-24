package br.ufal.aracomp.PFPOO.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufal.arapacomp.PFPOO.Control.Cadastros;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAdministrador extends JFrame {

	private JPanel contentPane;
	private Cadastros cadastro = new Cadastros();

	public TelaAdministrador() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoCadastrarProduto = new JButton("Cadastrar produto");
		botaoCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
				dispose();
				telaCadastroProduto.setVisible(true);
			}
		});
		botaoCadastrarProduto.setBounds(131, 71, 181, 23);
		contentPane.add(botaoCadastrarProduto);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setBounds(172, 147, 105, 16);
		contentPane.add(botaoVoltar);
		
		JButton botaoListarProdutos = new JButton("Listar produtos");
		botaoListarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.listarProdutosAdm();
			}
		});
		botaoListarProdutos.setBounds(131, 105, 181, 23);
		contentPane.add(botaoListarProdutos);
	}
}
