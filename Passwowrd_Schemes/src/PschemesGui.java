import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class PschemesGui extends JFrame {

	private JPanel contentPane;
	JButton Create_Email;
	/**
	 * Launch the application.
	 */
	JButton Email_Next1;
	JButton Create_Banking;
	JButton Banking_Next1;
	JButton Create_Shopping;
	JButton Shopping_Next1;
	JButton Enter_Banking;
	JButton Banking_Next2;
	JButton Email_Next2;
	JButton Enter_Email;
	JButton Enter_Shopping;
	JButton Shopping_Next2;
	
	/**
	 * Create the frame.
	 */
	
	public PschemesGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 908);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		 Create_Email = new JButton("Create");
	
		
		
		JLabel lblEmailPassword = new JLabel("Email Password");
		lblEmailPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblEmailPassword = new GridBagConstraints();
		gbc_lblEmailPassword.anchor = GridBagConstraints.WEST;
		gbc_lblEmailPassword.gridwidth = 2;
		gbc_lblEmailPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailPassword.gridx = 0;
		gbc_lblEmailPassword.gridy = 3;
		contentPane.add(lblEmailPassword, gbc_lblEmailPassword);
		GridBagConstraints gbc_Create_Email = new GridBagConstraints();
		gbc_Create_Email.anchor = GridBagConstraints.WEST;
		gbc_Create_Email.insets = new Insets(0, 0, 5, 5);
		gbc_Create_Email.gridx = 0;
		gbc_Create_Email.gridy = 5;
		contentPane.add(Create_Email, gbc_Create_Email);
		
		 Email_Next1 = new JButton("Next");
		 Email_Next1.setEnabled(false);
		GridBagConstraints gbc_Email_Next1 = new GridBagConstraints();
		gbc_Email_Next1.insets = new Insets(0, 0, 5, 0);
		gbc_Email_Next1.gridx = 2;
		gbc_Email_Next1.gridy = 5;
		contentPane.add(Email_Next1, gbc_Email_Next1);
		
		JLabel lblBankingPassword = new JLabel("Banking Password");
		lblBankingPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblBankingPassword = new GridBagConstraints();
		gbc_lblBankingPassword.anchor = GridBagConstraints.WEST;
		gbc_lblBankingPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblBankingPassword.gridx = 0;
		gbc_lblBankingPassword.gridy = 7;
		contentPane.add(lblBankingPassword, gbc_lblBankingPassword);
		
		 Create_Banking = new JButton("Create");
		 Create_Banking.setEnabled(false);
		
		
		GridBagConstraints gbc_Create_Banking = new GridBagConstraints();
		gbc_Create_Banking.anchor = GridBagConstraints.WEST;
		gbc_Create_Banking.insets = new Insets(0, 0, 5, 5);
		gbc_Create_Banking.gridx = 0;
		gbc_Create_Banking.gridy = 9;
		contentPane.add(Create_Banking, gbc_Create_Banking);
		
		 Banking_Next1 = new JButton("Next");
		 Banking_Next1.setEnabled(false);
		GridBagConstraints gbc_Banking_Next1 = new GridBagConstraints();
		gbc_Banking_Next1.insets = new Insets(0, 0, 5, 0);
		gbc_Banking_Next1.gridx = 2;
		gbc_Banking_Next1.gridy = 9;
		contentPane.add(Banking_Next1, gbc_Banking_Next1);
		
		JLabel lblShoppingPassword = new JLabel("Shopping Password");
		lblShoppingPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblShoppingPassword = new GridBagConstraints();
		gbc_lblShoppingPassword.anchor = GridBagConstraints.WEST;
		gbc_lblShoppingPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblShoppingPassword.gridx = 0;
		gbc_lblShoppingPassword.gridy = 11;
		contentPane.add(lblShoppingPassword, gbc_lblShoppingPassword);
		
		 Create_Shopping = new JButton("Create");
		 Create_Shopping.setEnabled(false);
		
		
		GridBagConstraints gbc_Create_Shopping = new GridBagConstraints();
		gbc_Create_Shopping.anchor = GridBagConstraints.WEST;
		gbc_Create_Shopping.insets = new Insets(0, 0, 5, 5);
		gbc_Create_Shopping.gridx = 0;
		gbc_Create_Shopping.gridy = 13;
		contentPane.add(Create_Shopping, gbc_Create_Shopping);
		
		 Shopping_Next1 = new JButton("Next");
		 Shopping_Next1.setEnabled(false);
		GridBagConstraints gbc_Shopping_Next1 = new GridBagConstraints();
		gbc_Shopping_Next1.insets = new Insets(0, 0, 5, 0);
		gbc_Shopping_Next1.gridx = 2;
		gbc_Shopping_Next1.gridy = 13;
		contentPane.add(Shopping_Next1, gbc_Shopping_Next1);
		
		JLabel lblEnterPasswordFor = new JLabel("Enter Password for banking(3 attempts)");
		lblEnterPasswordFor.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblEnterPasswordFor = new GridBagConstraints();
		gbc_lblEnterPasswordFor.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterPasswordFor.gridx = 0;
		gbc_lblEnterPasswordFor.gridy = 15;
		contentPane.add(lblEnterPasswordFor, gbc_lblEnterPasswordFor);
		
		 Enter_Banking = new JButton("Enter");
		 Enter_Banking.setEnabled(false);
		
		GridBagConstraints gbc_Enter_Banking = new GridBagConstraints();
		gbc_Enter_Banking.anchor = GridBagConstraints.WEST;
		gbc_Enter_Banking.insets = new Insets(0, 0, 5, 5);
		gbc_Enter_Banking.gridx = 0;
		gbc_Enter_Banking.gridy = 17;
		contentPane.add(Enter_Banking, gbc_Enter_Banking);
		
		 Banking_Next2 = new JButton("Next");
		 Banking_Next2.setEnabled(false);
		GridBagConstraints gbc_Banking_Next2 = new GridBagConstraints();
		gbc_Banking_Next2.insets = new Insets(0, 0, 5, 0);
		gbc_Banking_Next2.gridx = 2;
		gbc_Banking_Next2.gridy = 17;
		contentPane.add(Banking_Next2, gbc_Banking_Next2);
		
		JLabel lblEnterPasswordFor_1 = new JLabel("Enter Password for Shopping(3 attempts)");
		lblEnterPasswordFor_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblEnterPasswordFor_1 = new GridBagConstraints();
		gbc_lblEnterPasswordFor_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterPasswordFor_1.gridx = 0;
		gbc_lblEnterPasswordFor_1.gridy = 19;
		contentPane.add(lblEnterPasswordFor_1, gbc_lblEnterPasswordFor_1);
		
		 Enter_Shopping = new JButton("Enter");
		 Enter_Shopping.setEnabled(false);
	
		GridBagConstraints gbc_Enter_Shopping = new GridBagConstraints();
		gbc_Enter_Shopping.anchor = GridBagConstraints.WEST;
		gbc_Enter_Shopping.insets = new Insets(0, 0, 5, 5);
		gbc_Enter_Shopping.gridx = 0;
		gbc_Enter_Shopping.gridy = 21;
		contentPane.add(Enter_Shopping, gbc_Enter_Shopping);
		
		 Shopping_Next2 = new JButton("Next");
		 Shopping_Next2.setEnabled(false);
		GridBagConstraints gbc_Shopping_Next2 = new GridBagConstraints();
		gbc_Shopping_Next2.insets = new Insets(0, 0, 5, 0);
		gbc_Shopping_Next2.gridx = 2;
		gbc_Shopping_Next2.gridy = 21;
		contentPane.add(Shopping_Next2, gbc_Shopping_Next2);
		
		JLabel lblEnterPasswordFor_2 = new JLabel("Enter Password for Email (3 attempts)");
		lblEnterPasswordFor_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblEnterPasswordFor_2 = new GridBagConstraints();
		gbc_lblEnterPasswordFor_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterPasswordFor_2.gridx = 0;
		gbc_lblEnterPasswordFor_2.gridy = 23;
		contentPane.add(lblEnterPasswordFor_2, gbc_lblEnterPasswordFor_2);
		
		 Enter_Email = new JButton("Enter");
		 Enter_Email.setEnabled(false);
	
		
		GridBagConstraints gbc_Enter_Email = new GridBagConstraints();
		gbc_Enter_Email.anchor = GridBagConstraints.WEST;
		gbc_Enter_Email.insets = new Insets(0, 0, 0, 5);
		gbc_Enter_Email.gridx = 0;
		gbc_Enter_Email.gridy = 25;
		contentPane.add(Enter_Email, gbc_Enter_Email);
		
		 Email_Next2 = new JButton("Next");
		 Email_Next2.setEnabled(false);
		GridBagConstraints gbc_Email_Next2 = new GridBagConstraints();
		gbc_Email_Next2.gridx = 2;
		gbc_Email_Next2.gridy = 25;
		contentPane.add(Email_Next2, gbc_Email_Next2);
	}
	public void addCreateEmailListener(ActionListener listen) {
		Create_Email.addActionListener(listen);
	}
	public void addCreateBankingListener(ActionListener listen) {
		Create_Banking.addActionListener(listen);
	}
	public void addCreateShoppingListener(ActionListener listen) {
		Create_Shopping.addActionListener(listen);
	}
	public void addEnterEmailListener(ActionListener listen) {
		Enter_Email.addActionListener(listen);
	}
	public void addEnterBankingListener(ActionListener listen) {
		Enter_Banking.addActionListener(listen);
	}
	public void addEnterShoppingListener(ActionListener listen) {
		Enter_Shopping.addActionListener(listen);
	}
	public void addEmailNext1Listener(ActionListener listen) {
		Email_Next1.addActionListener(listen);
	}
	public void addShoppingNext1Listener(ActionListener listen) {
		Shopping_Next1.addActionListener(listen);
	}
	public void addBanikingNext1Listener(ActionListener listen) {
		Banking_Next1.addActionListener(listen);
	}
	public void addEmailNext2Listener(ActionListener listen) {
		Email_Next2.addActionListener(listen);
	}
	public void addShoppingNext2Listener(ActionListener listen) {
		Shopping_Next2.addActionListener(listen);
	}
	public void addBanikingNext2Listener(ActionListener listen) {
		Banking_Next2.addActionListener(listen);
	}
	public void displayErrorMessage(String errorMessage) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, errorMessage);	

	}
}
