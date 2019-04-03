
public class main {
	public static void main(String[] args) {
		PschemesGui theVeiw=new PschemesGui();
		pschemes theModel=new pschemes();
		//PwGuiController theController=new PwGuiController(theVeiw, theModel);
		pschemescontroller thePschemescontroller=new pschemescontroller(theVeiw,theModel);
		theVeiw.setVisible(true);
	}
}
