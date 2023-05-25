package br.ufal.aracomp.PFPOO.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

import br.ufal.aracomp.PFPOO.Model.AdministradorModel;
import br.ufal.aracomp.PFPOO.Model.CadastrosModel;
import br.ufal.arapacomp.PFPOO.Control.Cadastros;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame{
	
	private JFrame frmLogin;
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private Cadastros cadastro = new Cadastros();
	private Scanner scanner = new Scanner(System.in);

	public void iniciar() {
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

	public TelaLogin() {
		initialize();
	}

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
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setBounds(50, 40, 46, 14);
		frmLogin.getContentPane().add(labelLogin);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(50, 101, 46, 14);
		frmLogin.getContentPane().add(labelSenha);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = campoLogin.getText();
				String senha = String.valueOf(campoSenha.getPassword());
				
				if(cadastro.verificarCliente(login, senha)) {
					setVisible(false);
					String opcao = "";
					double total = 0;
					while(true) {
						System.out.println("Digite [C] para comprar ou Digite [V] para cancelar e voltar");
						opcao = scanner.next();
						while(opcao.equalsIgnoreCase("C")) {
							System.out.println("| Digite o nome ou o ID para selecionar os seus Produtos ou digite [F] para finalizar| \n");
							cadastro.listaProdutosCliente();
							String escolha = scanner.next();
							total = total + cadastro.venderProduto(escolha, escolha);
							if(escolha.equalsIgnoreCase("F")) {
								opcao = "f";
								System.out.println("O total do seu pedido: " + total);
								TelaEndereco telaEndereco = new TelaEndereco();
								telaEndereco.setVisible(true);
								dispose();
							}
							else {
							System.out.println("Total: " + total + "\n");
							}
						}
						if(opcao.equalsIgnoreCase("V")) {
							System.out.println("Volte sempre!");
							break;
						}
						else if(opcao.equalsIgnoreCase("F")) {
							break;
						}
						else {
							System.out.println("Opção invalida!");
						}
					}
				}
				else if(cadastro.verificarAdmPadrao(login, senha)) {
					TelaAdministrador telaAdm = new TelaAdministrador();
					telaAdm.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(botaoEntrar, "login ou senha incorretos!");
				}	
			}
		});
		botaoEntrar.setBounds(49, 152, 89, 23);
		frmLogin.getContentPane().add(botaoEntrar);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
				telaCadastroCliente.setVisible(true);
				dispose();
			}
		});
		botaoCadastrar.setBounds(148, 152, 106, 23);
		frmLogin.getContentPane().add(botaoCadastrar);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(50, 121, 204, 20);
		frmLogin.getContentPane().add(campoSenha);
	}
}
