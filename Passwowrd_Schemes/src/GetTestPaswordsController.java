import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omg.CORBA.PRIVATE_MEMBER;

public class GetTestPaswordsController {
	private GetTestPasswordGUI theVeiw;
	private pschemes theModel;
	
	public GetTestPaswordsController(GetTestPasswordGUI theVeiw,pschemes theModel) {
		// TODO Auto-generated constructor stub
		this.theVeiw=theVeiw;
		this.theModel=theModel;
		this.theVeiw.addTestListener(new TestListener());
		this.theVeiw.addAcceptListener(new AcceptListener());
		this.theVeiw.addVisibleListener(new checkBoxListener());
		if (theVeiw.getPType().equals("EMAIL")) {
			this.theVeiw.setOrgPassword(theModel.EmailPword());
		}else if (theVeiw.getPType().equals("BANKING")) {
			this.theVeiw.setOrgPassword(theModel.bankingPassword());
		}else if (theVeiw.getPType().equals("SHOPPING")) {
			this.theVeiw.setOrgPassword(theModel.shoppingPassword());
		}
	}
	class TestListener implements ActionListener {
		String entree,password;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree=theVeiw.getEntree();
			password=theVeiw.getOrgPassword().getText();
			theModel.passWordChecker(entree, password);
			if (theModel.getValidate()) {
				theVeiw.displayErrorMessage("correct password!");
			}else {
				theVeiw.displayErrorMessage("Incorrect password!");
			}
			
		}
		
	}
	class checkBoxListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (theVeiw.checkPasswordVisibility()) {
				theVeiw.getOrgPassword().setVisible(true);
			}else {
				theVeiw.getOrgPassword().setVisible(false);
			}
		}
		
	}
	class AcceptListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				//theModel.setEmail("hello");
				theVeiw.dispose();
				
			
		}
		
	}
}
