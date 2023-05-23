package br.ufal.aracomp.PFPOO.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufal.aracomp.PFPOO.Model.Cadastros;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoLogin;
	private JPasswordField campoSenha;

	public TelaCadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setBounds(130, 70, 199, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(130, 46, 46, 14);
		contentPane.add(labelNome);
		
		campoLogin = new JTextField();
		campoLogin.setColumns(10);
		campoLogin.setBounds(130, 125, 199, 20);
		contentPane.add(campoLogin);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setBounds(130, 101, 46, 14);
		contentPane.add(labelLogin);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(130, 156, 46, 14);
		contentPane.add(labelSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(130, 181, 199, 20);
		contentPane.add(campoSenha);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campoNome.getText();
				String login = campoLogin.getText();
				String senha = String.valueOf(campoSenha.getPassword());
				
				Cadastros.criarCadastroCliente(login, senha, nome);
			}
		});
		botaoCadastrar.setBounds(130, 212, 100, 23);
		contentPane.add(botaoCadastrar);
		
		JButton botaoVoltar = new JButton("voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		botaoVoltar.setBounds(240, 212, 89, 23);
		contentPane.add(botaoVoltar);
	}

}
