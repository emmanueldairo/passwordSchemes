import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterPasswordController {
	private EnterPasswordGUI theVeiw;
	private pschemes theModel;
	
	public EnterPasswordController(EnterPasswordGUI theVeiw,pschemes theModel) {
		// TODO Auto-generated constructor stub
		this.theVeiw=theVeiw;
		this.theModel=theModel;
		
		theVeiw.addDoneListener(new DoneListener());
	}
	
	class DoneListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch (theVeiw.getPtype()) {
			case "EMAIL":
				if (theModel.geteTries()<3&&!theVeiw.getEntree().equals(theModel.getEmail())) {
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.seteTries(theModel.geteTries()+1);
					
					theVeiw.dispose();
				}else if (theModel.geteTries()<3&&theVeiw.getEntree().equals(theModel.getEmail())) {
					theVeiw.displayErrorMessage("Login Success!");
					theModel.seteTries(theModel.geteTries()+1);
					theVeiw.dispose();
				}
				
				break;
			case "BANKING":
				if (theModel.getbTries()<3&&!theVeiw.getEntree().equals(theModel.getBanking())) {
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.setbTries(theModel.getbTries()+1);
					theVeiw.dispose();
				}else if (theModel.getbTries()<3&&theVeiw.getEntree().equals(theModel.getBanking())) {
					theVeiw.displayErrorMessage("Login Success!");
					theModel.setbTries(theModel.getbTries()+1);
					theVeiw.dispose();
				}
				break;
			case "SHOPPING":
				if (theModel.getsTries()<3&&!theVeiw.getEntree().equals(theModel.getShopping())) {
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.setsTries(theModel.getsTries()+1);
					theVeiw.dispose();
				}else if (theModel.getsTries()<3&&theVeiw.getEntree().equals(theModel.getShopping())) {
					theVeiw.displayErrorMessage("Login Success!");
					theModel.setsTries(theModel.getsTries()+1);
					theVeiw.dispose();
				}
				break;
			default:
				break;
			}
			
		}
		
	}
}
