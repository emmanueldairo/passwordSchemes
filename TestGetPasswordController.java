import java.awt.event.ActionEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestGetPasswordController {
	private static final Logger logger = LogManager.getLogger(pschemes.class);
	
	private TestGetPasswordGui theVeiw;
	private pschemes theModel;
	private List<Integer> entree;
	public TestGetPasswordController(TestGetPasswordGui theVeiw,pschemes theModel) {
		// TODO Auto-generated constructor stub
		this.theVeiw=theVeiw;
		this.theModel=theModel;
		entree=new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			entree.add(0);
		}
		this.theVeiw.addP1Listener(new p1Listener());
		this.theVeiw.addP2Listener(new p2Listener());
		this.theVeiw.addP3Listener(new p3Listener());
		this.theVeiw.addP4Listener(new p4Listener());
		this.theVeiw.addP5Listener(new p5Listener());
		this.theVeiw.addP6Listener(new p6Listener());
		this.theVeiw.addP7Listener(new p7Listener());
		this.theVeiw.addP8Listener(new p8Listener());
		this.theVeiw.confirmListener(new confirmListener());
		this.theVeiw.addVisibleListener(new visibleListener());
		this.theVeiw.AcceptListener(new acceptListener());
		if (theVeiw.getPtype().equals("EMAIL")) {
			this.theVeiw.setPassword(theModel.generateEmailPassword());
		}else if (theVeiw.getPtype().equals("BANKING")) {
			this.theVeiw.setPassword(theModel.genetateBankingPassword());
		}else if (theVeiw.getPtype().equals("SHOPPING")) {
			this.theVeiw.setPassword(theModel.generateShoppingPassword());
		}
	}
	class acceptListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theVeiw.dispose();
			logger.info(" create | PasswordSubmitted ");
		}
		
		
	}
	
	class visibleListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			logger.info(" create | pwtest | pwtog ");
			// TODO Auto-generated method stub
			if (theVeiw.checkPasswordVisibility()) {
				for (int i = 0; i < theVeiw.getPassword().size(); i++) {
					theVeiw.getPassword().get(i).setVisible(true);;

				}
			}else {
				for (int i = 0; i < theVeiw.getPassword().size(); i++) {
					theVeiw.getPassword().get(i).setVisible(false);;

				}		
			}
		}
		
		
	}
	class p1Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(0,entree.get(0)+1);
			theVeiw.setCounters(entree);
		}
	}
	class p2Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(1,entree.get(1)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p3Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(2,entree.get(2)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p4Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(3,entree.get(3)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p5Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(4,entree.get(4)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p6Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(5,entree.get(5)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p7Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(6,entree.get(6)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p8Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(7,entree.get(7)+1);
			theVeiw.setCounters(entree);

		}
	}
	class confirmListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			List<Integer> password=theVeiw.getIntPassword();
			theModel.passWordChecker(entree, password);
			if (theModel.getValidate()) {
				for (int i = 0; i < 8; i++) {
					entree.set(i, 0);
				}
				
				theVeiw.displayErrorMessage("correct password!");
				logger.info(" create | pwtest | success ");
			}else {
				for (int i = 0; i < 8; i++) {
					entree.set(i, 0);
				}
				
				theVeiw.displayErrorMessage("Incorrect password!");
				logger.info(" create | pwtest | fail ");
			}		
		}
	}
	
}
