import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class pschemescontroller {
	
	private static final Logger logger = LogManager.getLogger(pschemes.class);
	//declare view&&model
	private PschemesGui theVeiw;
	private pschemes theModel;
	public pschemescontroller(PschemesGui theVeiw,pschemes theModel) {
		// Initializes view&model
		this.theVeiw=theVeiw;
		this.theModel=theModel;
		//responding to button clicks by calling the related action listener class
		this.theVeiw.addCreateEmailListener(new CEmail());
		this.theVeiw.addEmailNext1Listener(new NEmail1());
		this.theVeiw.addCreateBankingListener(new CBanking());
		this.theVeiw.addBanikingNext1Listener(new NBanking1());
		this.theVeiw.addCreateShoppingListener(new CShopping());
		this.theVeiw.addShoppingNext1Listener(new NShopping1());
		this.theVeiw.addEnterEmailListener(new EEmail());
		this.theVeiw.addEmailNext2Listener(new NEmail2());
		this.theVeiw.addEnterBankingListener(new EBanking());
		this.theVeiw.addBanikingNext2Listener(new NBanking2());
		this.theVeiw.addEnterShoppingListener(new EShopping());
		this.theVeiw.addShoppingNext2Listener(new NShopping2());
	}
	class CEmail implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | start");
			//acts on the button clicks for create email
			TestGetPasswordGui testGetPasswordGui=new TestGetPasswordGui("EMAIL");
			new TestGetPasswordController(testGetPasswordGui, theModel);
			testGetPasswordGui.setVisible(true);
			if (theModel.getEmail()!=null) {
				theVeiw.Email_Next1.setEnabled(true);
			}
		}
		
	}
	class NEmail1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | passwordSubmitted");
			// TODO Auto-generated method stub
			theVeiw.Create_Banking.setEnabled(true);
		}
		
	}
	class CBanking implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | start");
			// TODO Auto-generated method stub
			TestGetPasswordGui testGetPasswordGui=new TestGetPasswordGui("BANKING");
			new TestGetPasswordController(testGetPasswordGui, theModel);
			testGetPasswordGui.setVisible(true);
			if (theModel.getBanking()!=null) {
				theVeiw.Banking_Next1.setEnabled(true);
			}
		}
		
		
		
	}
	class NBanking1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | PasswordSubmitted");
			// TODO Auto-generated method stub
			theVeiw.Create_Shopping.setEnabled(true);
		}
		
	}
	class CShopping implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | start");
			// TODO Auto-generated method stub
			TestGetPasswordGui testGetPasswordGui=new TestGetPasswordGui("SHOPPING");
			new TestGetPasswordController(testGetPasswordGui, theModel);
			testGetPasswordGui.setVisible(true);
			if (theModel.getShopping()!=null) {
				theVeiw.Shopping_Next1.setEnabled(true);
			}
		}
		
		
		
	}
	class NShopping1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | PasswordSubmitted");
			// TODO Auto-generated method stub
			theVeiw.Enter_Banking.setEnabled(true);
		}
		
	}
	
	class EBanking implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" login | start");
			// TODO Auto-generated method stub
			EnterPasswordGUI enterPasswordGUI=new EnterPasswordGUI("BANKING");
			new EnterPasswordController(enterPasswordGUI, theModel);
			if(theModel.getbTries()>=3) {
				theVeiw.displayErrorMessage("Sorry, no more than 3 attempts allowed.");
			}else {
				enterPasswordGUI.setVisible(true);
			}
			theVeiw.Banking_Next2.setEnabled(true);

		}
		
	}
	class NBanking2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.Enter_Shopping.setEnabled(true);
		}
		
	}
	class EShopping implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" login | start");
			// TODO Auto-generated method stub
			EnterPasswordGUI enterPasswordGUI=new EnterPasswordGUI("SHOPPING");
			new EnterPasswordController(enterPasswordGUI, theModel);
			if(theModel.getsTries()>=3) {
				theVeiw.displayErrorMessage("Sorry, no more than 3 attempts allowed.");
			}else {
				enterPasswordGUI.setVisible(true);
			}
			theVeiw.Shopping_Next2.setEnabled(true);

		}
		
	}
	class NShopping2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.Enter_Email.setEnabled(true);
		}
		
	}
	class EEmail implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			logger.info(" login | start");
			// TODO Auto-generated method stub
			EnterPasswordGUI enterPasswordGUI=new EnterPasswordGUI("EMAIL");
			new EnterPasswordController(enterPasswordGUI, theModel);
			if(theModel.geteTries()>=3) {
				theVeiw.displayErrorMessage("Sorry, no more than 3 attempts allowed.");
			}else {
				enterPasswordGUI.setVisible(true);
			}
			theVeiw.Email_Next2.setEnabled(true);

		}
		
	}
	class NEmail2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" user done ");
			// TODO Auto-generated method stub
			theVeiw.displayErrorMessage("All done: Thanks! See Log Data.");
		}
		
	}
}
