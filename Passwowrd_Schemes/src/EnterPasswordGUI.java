import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class EnterPasswordGUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JButton Done_Button;
	private String ptype;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EnterPasswordGUI(String Ptype) {
		this.setPtype(Ptype);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 3;
		contentPane.add(passwordField, gbc_passwordField);
		
		Done_Button = new JButton("Done");
		GridBagConstraints gbc_Done_Button = new GridBagConstraints();
		gbc_Done_Button.gridx = 0;
		gbc_Done_Button.gridy = 5;
		contentPane.add(Done_Button, gbc_Done_Button);
	}
	public String getEntree() {
		String answer=String.valueOf(passwordField.getPassword());
		
		return answer;
	}
	public void addDoneListener(ActionListener listen) {
		Done_Button.addActionListener(listen);
	}
	

	public void displayErrorMessage(String errorMessage) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, errorMessage);	

	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
}
