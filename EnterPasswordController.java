import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnterPasswordController {
	private static final Logger logger = LogManager.getLogger(pschemes.class);
	private EnterPasswordGUI theVeiw;
	private pschemes theModel;
	private List< Integer>entree;
	public EnterPasswordController(EnterPasswordGUI theVeiw,pschemes theModel) {
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
		theVeiw.addDoneListener(new DoneListener());
	}
	class p1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(0,entree.get(0)+1);
			theVeiw.setCounters(entree);

			
		}
	}
	class p2Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(1,entree.get(1)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p3Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(2,entree.get(2)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p4Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(3,entree.get(3)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p5Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(4,entree.get(4)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p6Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(5,entree.get(5)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p7Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(6,entree.get(6)+1);
			theVeiw.setCounters(entree);

		}
	}
	class p8Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			entree.set(7,entree.get(7)+1);
			theVeiw.setCounters(entree);

		}
	}
	class DoneListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch (theVeiw.getPtype()) {
			case "EMAIL":
				if (theModel.geteTries()<3&&!theModel.passWordChecker(entree, "EMAIL")) {
					logger.error(" login | failure ");
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.seteTries(theModel.geteTries()+1);
					theVeiw.dispose();
				}else if (theModel.geteTries()<3&&theModel.passWordChecker(entree, "EMAIL")) {
					logger.info(" login | success ");
					theVeiw.displayErrorMessage("Login Success!");
					theModel.seteTries(theModel.geteTries()+1);
					theVeiw.dispose();
				}
				
				break;
			case "BANKING":
				if (theModel.getbTries()<3&&!theModel.passWordChecker(entree, "BANKING")) {
					logger.error(" login | failure ");
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.setbTries(theModel.getbTries()+1);
					theVeiw.dispose();
				}else if (theModel.getbTries()<3&&theModel.passWordChecker(entree, "BANKING")) {
					logger.info(" login | success ");
					theVeiw.displayErrorMessage("Login Success!");
					theModel.setbTries(theModel.getbTries()+1);
					theVeiw.dispose();
				}
				break;
			case "SHOPPING":
				if (theModel.getsTries()<3&&!theModel.passWordChecker(entree, "SHOPPING")) {
					logger.error(" login | failure ");
					theVeiw.displayErrorMessage("Login Failed!");
					theModel.setsTries(theModel.getsTries()+1);
					theVeiw.dispose();
				}else if (theModel.getsTries()<3&&theModel.passWordChecker(entree, "SHOPPING")) {
					logger.info(" login | success ");
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
