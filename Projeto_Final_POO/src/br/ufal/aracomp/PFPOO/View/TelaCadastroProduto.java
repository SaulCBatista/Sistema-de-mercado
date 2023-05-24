package br.ufal.aracomp.PFPOO.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufal.arapacomp.PFPOO.Control.Cadastros;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoPrecoCompra;
	private JTextField campoPrecoVenda;
	private Cadastros produto = new Cadastros();

	public TelaCadastroProduto() {
		setTitle("Cadastro de produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setBounds(48, 66, 301, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel LabelNome = new JLabel("Nome:");
		LabelNome.setBounds(20, 47, 46, 14);
		contentPane.add(LabelNome);
		
		campoPrecoCompra = new JTextField();
		campoPrecoCompra.setColumns(10);
		campoPrecoCompra.setBounds(48, 113, 301, 20);
		contentPane.add(campoPrecoCompra);
		
		JLabel labelPrecoCompra = new JLabel("Preço de Compra:");
		labelPrecoCompra.setBounds(20, 97, 90, 14);
		contentPane.add(labelPrecoCompra);
		
		campoPrecoVenda = new JTextField();
		campoPrecoVenda.setColumns(10);
		campoPrecoVenda.setBounds(48, 159, 301, 20);
		contentPane.add(campoPrecoVenda);
		
		JLabel labelPrecoVenda = new JLabel("Preço de venda:");
		labelPrecoVenda.setBounds(20, 144, 90, 14);
		contentPane.add(labelPrecoVenda);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campoNome.getText();
				double precoCompra = Double.valueOf(campoPrecoCompra.getText()).doubleValue();
				double precoVenda = Double.valueOf(campoPrecoVenda.getText()).doubleValue();
				
				produto.cadastrarProduto(nome, precoCompra, precoVenda);
			}
		});
		botaoCadastrar.setBounds(93, 206, 89, 23);
		contentPane.add(botaoCadastrar);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdministrador telaAdm = new TelaAdministrador();
				telaAdm.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setBounds(211, 206, 89, 23);
		contentPane.add(botaoVoltar);
	}
}
