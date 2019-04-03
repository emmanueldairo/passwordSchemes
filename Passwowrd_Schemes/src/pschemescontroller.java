import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pschemescontroller {
	private PschemesGui theVeiw;
	private pschemes theModel;
	public pschemescontroller(PschemesGui theVeiw,pschemes theModel) {
		// TODO Auto-generated constructor stub
		this.theVeiw=theVeiw;
		this.theModel=theModel;
		this.theVeiw.addCreateEmailListener(new CEmail());
		this.theVeiw.addEmailNext1Listener(new NEmail1());
		this.theVeiw.addCreateBankingListener(new CBanking());
		this.theVeiw.addBanikingNext1Listener(new NBanking1());
		this.theVeiw.addCreateShoppingListener(new CShopping());
		this.theVeiw.addShoppingNext1Listener(new NShopping1());


	}
	class CEmail implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			GetTestPasswordGUI pwGUI=new GetTestPasswordGUI("EMAIL");
			GetTestPaswordsController pwGuiController=new GetTestPaswordsController(pwGUI, theModel);
			pwGUI.setVisible(true);
			if (theModel.getEmail()!=null) {
				theVeiw.Email_Next1.setEnabled(true);
			}
		}
		
	}
	class NEmail1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.Create_Banking.setEnabled(true);
		}
		
	}
	class CBanking implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			GetTestPasswordGUI pwGUI=new GetTestPasswordGUI("BANKING");
			GetTestPaswordsController pwGuiController=new GetTestPaswordsController(pwGUI, theModel);
			pwGUI.setVisible(true);
			if (theModel.getEmail()!=null) {
				theVeiw.Banking_Next1.setEnabled(true);
			}
		}
		
		
		
	}
	class NBanking1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.Create_Shopping.setEnabled(true);
		}
		
	}
	class CShopping implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			GetTestPasswordGUI pwGUI=new GetTestPasswordGUI("SHOPPING");
			GetTestPaswordsController pwGuiController=new GetTestPaswordsController(pwGUI, theModel);
			pwGUI.setVisible(true);
			if (theModel.getShopping()!=null) {
				theVeiw.Shopping_Next1.setEnabled(true);
			}
		}
		
		
		
	}
	class NShopping1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.Enter_Banking.setEnabled(true);
		}
		
	}
}
