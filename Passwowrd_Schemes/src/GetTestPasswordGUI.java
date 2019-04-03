import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GetTestPasswordGUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel orgPassword_label;
	private JButton TestBUTTON;
	private JButton AcceptButton;
	private JCheckBox Pword_Visibility;
	pschemes pschemes;
	private String PType; //what type of password i.e email password.
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GetTestPasswordGUI(String s) {
		setPType(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Your Password is:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridheight = 3;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		orgPassword_label = new JLabel();
		orgPassword_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_orgPassword_label = new GridBagConstraints();
		gbc_orgPassword_label.gridheight = 2;
		gbc_orgPassword_label.insets = new Insets(0, 0, 5, 0);
		gbc_orgPassword_label.gridx = 3;
		gbc_orgPassword_label.gridy = 1;
		contentPane.add(orgPassword_label, gbc_orgPassword_label);
		
		JLabel lblNewLabel_1 = new JLabel("Check the box to make your real password hidden or shown.\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Pword_Visibility = new JCheckBox("");
		Pword_Visibility.setSelected(true);
		GridBagConstraints gbc_Pword_Visibility = new GridBagConstraints();
		gbc_Pword_Visibility.insets = new Insets(0, 0, 5, 0);
		gbc_Pword_Visibility.gridx = 3;
		gbc_Pword_Visibility.gridy = 3;
		contentPane.add(Pword_Visibility, gbc_Pword_Visibility);
		
		JLabel lblPleasePracticeYour = new JLabel("Please practice your password now:\r\n");
		lblPleasePracticeYour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPleasePracticeYour = new GridBagConstraints();
		gbc_lblPleasePracticeYour.gridwidth = 2;
		gbc_lblPleasePracticeYour.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleasePracticeYour.gridx = 0;
		gbc_lblPleasePracticeYour.gridy = 5;
		contentPane.add(lblPleasePracticeYour, gbc_lblPleasePracticeYour);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 5;
		contentPane.add(passwordField, gbc_passwordField);
		
		TestBUTTON = new JButton("Test\r\n");
		
		GridBagConstraints gbc_TestBUTTON = new GridBagConstraints();
		gbc_TestBUTTON.anchor = GridBagConstraints.NORTH;
		gbc_TestBUTTON.insets = new Insets(0, 0, 5, 0);
		gbc_TestBUTTON.gridx = 3;
		gbc_TestBUTTON.gridy = 6;
		contentPane.add(TestBUTTON, gbc_TestBUTTON);
		
		JLabel lblWhenYoureFinished = new JLabel("When you're finished practicing, click accept. \r\n");
		lblWhenYoureFinished.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWhenYoureFinished = new GridBagConstraints();
		gbc_lblWhenYoureFinished.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhenYoureFinished.gridx = 1;
		gbc_lblWhenYoureFinished.gridy = 7;
		contentPane.add(lblWhenYoureFinished, gbc_lblWhenYoureFinished);
		
		AcceptButton = new JButton("Accept Password");
		GridBagConstraints gbc_AcceptButton = new GridBagConstraints();
		gbc_AcceptButton.insets = new Insets(0, 0, 0, 5);
		gbc_AcceptButton.gridx = 1;
		gbc_AcceptButton.gridy = 9;
		contentPane.add(AcceptButton, gbc_AcceptButton);
	}
	public String getEntree() {
		String answer=String.valueOf(passwordField.getPassword());
		
		return answer;
	}
	public boolean checkPasswordVisibility() {
		return Pword_Visibility.isSelected();
	}
	public void setOrgPassword(String s) {
		this.orgPassword_label.setText(s);
	}
	public JLabel getOrgPassword() {
		return orgPassword_label;
	}
	public void addTestListener(ActionListener listen) {
		TestBUTTON.addActionListener(listen);
	}
	public void addAcceptListener(ActionListener listen) {
		AcceptButton.addActionListener(listen);
	}
	public void addVisibleListener(ActionListener listen) {
		Pword_Visibility.addActionListener(listen);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);	
	}
	public String getPType() {
		return PType;
	}
	public void setPType(String pType) {
		PType = pType;
	}

}
