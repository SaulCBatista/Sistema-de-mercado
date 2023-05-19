package br.ufal.aracomp.PFPOO.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

import br.ufal.aracomp.PFPOO.Control.Administrador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {
	
	private Administrador adm = new Administrador("padrao@gmail.com", "padrao", "Padrão");
	private JFrame frmLogin;
	private JTextField campoLogin;
	private JPasswordField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(50, 60, 204, 20);
		frmLogin.getContentPane().add(campoLogin);
		campoLogin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(50, 40, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(50, 101, 46, 14);
		frmLogin.getContentPane().add(lblSenha);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = campoLogin.getText();
				String senha = String.valueOf(campoSenha.getPassword());
				
				if(login.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
					System.out.println("Usuario padrão");
				}
				else {
					JOptionPane.showMessageDialog(botaoEntrar, "login ou senha incorretos!");
				}
					
			}
		});
		botaoEntrar.setBounds(49, 152, 89, 23);
		frmLogin.getContentPane().add(botaoEntrar);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(148, 152, 106, 23);
		frmLogin.getContentPane().add(botaoCadastrar);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(50, 121, 204, 20);
		frmLogin.getContentPane().add(campoSenha);
	}
}
