import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;

public class meu_recibo extends JFrame {

	private JPanel contentPane;
	private JTextField NomeEmissor;
	private JTextField Endereco;
	private JComboBox textField_2;
	private JTextField NomeCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					meu_recibo frame = new meu_recibo();
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
	public meu_recibo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Pictures\\Kpersoft\\kpersoft.png"));
		setTitle("Meu Recibo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 591);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(465, 292, 300, 250);
		
		NomeEmissor = new JTextField();
		NomeEmissor.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		NomeEmissor.setForeground(SystemColor.textHighlight);
		NomeEmissor.setBounds(15, 51, 440, 28);
		NomeEmissor.setColumns(10);
		
		Endereco = new JTextField();
		Endereco.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Endereco.setForeground(SystemColor.textHighlight);
		Endereco.setBounds(15, 101, 440, 28);
		Endereco.setColumns(10);
		
		JLabel lblNomeEmissor = new JLabel("Nome Emissor");
		lblNomeEmissor.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNomeEmissor.setBounds(15, 31, 103, 14);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEndereo.setBounds(15, 81, 76, 14);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCidade.setBounds(82, 136, 76, 14);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEstado.setBounds(14, 136, 58, 14);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCep.setBounds(352, 136, 63, 14);
		
		JComboBox Estado = new JComboBox();
		Estado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Estado.setBackground(Color.WHITE);
		Estado.setForeground(SystemColor.textHighlight);
		Estado.setBounds(15, 156, 57, 28);
		Estado.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO"}));
		
		textField_2 = new JComboBox();
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_2.setBackground(Color.WHITE);
		textField_2.setForeground(SystemColor.textHighlight);
		textField_2.setBounds(82, 156, 260, 28);
		contentPane.setLayout(null);
		contentPane.add(NomeEmissor);
		contentPane.add(lblNomeEmissor);
		contentPane.add(lblEndereo);
		contentPane.add(Endereco);
		contentPane.add(textField_2);
		contentPane.add(lblCidade);
		contentPane.add(Estado);
		contentPane.add(lblEstado);
		contentPane.add(lblCep);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setLayout(new CardLayout(0, 0));
		try
		{ 
		JFormattedTextField CEP = new JFormattedTextField(new MaskFormatter("##.###-###"));
		CEP.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		CEP.setForeground(SystemColor.textHighlight);
		CEP.setBounds(352, 156, 103, 28);
		contentPane.add(CEP);
		}
		catch(Exception erro)
		{
		    JOptionPane.showMessageDialog(null, "Não foi possivel criar máscara de CEP");
		}
		try
		{ 
		JFormattedTextField data = new JFormattedTextField(new MaskFormatter("##/##/####"));
		data.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		data.setForeground(SystemColor.textHighlight);
		data.setBounds(15, 364, 180, 28);
		contentPane.add(data);
		}
		catch(Exception erro)
		{
		    JOptionPane.showMessageDialog(null, "Não foi possivel criar máscara de Data");
		}		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(15, 348, 46, 14);
		contentPane.add(lblNewLabel);
		
		JFormattedTextField Telefone = new JFormattedTextField();
		Telefone.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Telefone.setForeground(SystemColor.textHighlight);
		Telefone.setBounds(15, 208, 180, 28);
		contentPane.add(Telefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblTelefone.setBounds(15, 191, 76, 14);
		contentPane.add(lblTelefone);
		
		JFormattedTextField CpfCnpjEmissor = new JFormattedTextField();
		CpfCnpjEmissor.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		CpfCnpjEmissor.setForeground(SystemColor.textHighlight);
		CpfCnpjEmissor.setBounds(208, 208, 247, 28);
		contentPane.add(CpfCnpjEmissor);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ Emissor");
		lblCpfcnpj.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCpfcnpj.setBounds(209, 191, 133, 14);
		contentPane.add(lblCpfcnpj);
		

		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNomeCliente.setBounds(15, 292, 103, 14);
		contentPane.add(lblNomeCliente);
		
		NomeCliente = new JTextField();
		NomeCliente.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		NomeCliente.setForeground(SystemColor.textHighlight);
		NomeCliente.setColumns(10);
		NomeCliente.setBounds(15, 312, 440, 28);
		contentPane.add(NomeCliente);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		formattedTextField_2.setForeground(SystemColor.textHighlight);
		formattedTextField_2.setBounds(208, 364, 247, 28);
		contentPane.add(formattedTextField_2);
		
		JLabel lblCpfcnpjCliente = new JLabel("CPF/CNPJ Cliente");
		lblCpfcnpjCliente.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCpfcnpjCliente.setBounds(209, 348, 133, 14);
		contentPane.add(lblCpfcnpjCliente);
		
		JTextField ReferenteA = new JTextField();
		ReferenteA.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		ReferenteA.setForeground(SystemColor.textHighlight);
		ReferenteA.setBounds(15, 473, 440, 28);
		contentPane.add(ReferenteA);
		
		JLabel lblReferenteA = new JLabel("Referente a");
		lblReferenteA.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblReferenteA.setBounds(15, 456, 103, 14);
		contentPane.add(lblReferenteA);
		
		JFormattedTextField numero = new JFormattedTextField();
		numero.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		numero.setForeground(SystemColor.textHighlight);
		numero.setBounds(15, 419, 180, 28);
		contentPane.add(numero);
		
		JLabel lblNumeroDoRecibo = new JLabel("Numero do Recibo");
		lblNumeroDoRecibo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNumeroDoRecibo.setBounds(15, 403, 154, 14);
		contentPane.add(lblNumeroDoRecibo);
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		formattedTextField_5.setForeground(SystemColor.textHighlight);
		formattedTextField_5.setBounds(208, 419, 247, 28);
		contentPane.add(formattedTextField_5);
		
		JLabel lblValorR = new JLabel("Valor R$");
		lblValorR.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblValorR.setBounds(208, 403, 77, 14);
		contentPane.add(lblValorR);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(SystemColor.textHighlight);
		btnLimpar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnLimpar.setBounds(210, 514, 89, 28);
		getContentPane().add(btnLimpar);
		contentPane.add(btnLimpar);
		
		//EVENTO DO BOTÃO 
		btnLimpar .addActionListener(new ActionListener() 
		{ 
		public void actionPerformed(ActionEvent e) 
		{ 
		NomeEmissor.setText("");
		Endereco.setText("");
		NomeCliente.setText("");
		}
		}); 
		
		JButton btnCriarRecibo = new JButton("Criar Recibo");
		btnCriarRecibo.setForeground(Color.WHITE);
		btnCriarRecibo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnCriarRecibo.setBackground(SystemColor.textHighlight);
		btnCriarRecibo.setBounds(309, 514, 146, 28);
		contentPane.add(btnCriarRecibo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(465, 31, 300, 250);
		contentPane.add(panel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(15, 0, 425, 28);
		contentPane.add(menuBar);
		
		JMenuItem mntmCadastroEmissor = new JMenuItem("Cadastro Emissor");
		mntmCadastroEmissor.setForeground(Color.BLACK);
		mntmCadastroEmissor.setBackground(Color.WHITE);
		menuBar.add(mntmCadastroEmissor);
		
		JMenuItem mntmCadastroCliente = new JMenuItem("Cadastro Cliente");
		mntmCadastroCliente.setForeground(Color.BLACK);
		mntmCadastroCliente.setBackground(Color.WHITE);
		menuBar.add(mntmCadastroCliente);	
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}	
}