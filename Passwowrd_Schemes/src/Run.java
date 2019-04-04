
public class Run {
	public static void main(String[] args) {
		//makes and initializes the view, Pschemes, controller&model 
		PschemesGui theVeiw=new PschemesGui();
		pschemes theModel=new pschemes();
		new pschemescontroller(theVeiw,theModel);
		//makes the view visible
		theVeiw.setVisible(true);
		//hello a change
	}
}
