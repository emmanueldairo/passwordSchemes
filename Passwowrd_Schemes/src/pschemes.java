	import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	
public class pschemes {
	private static final Logger logger = LogManager.getLogger(pschemes.class);

	private boolean validate;
	private List<String> alist=new ArrayList<String>();
	private int numTries;
	private String Email=null,Shopping=null,Banking=null;
		public pschemes() {
			// TODO Auto-generated constructor stub
			this.setValidate(false);
			this.setNumTries(0);
			this.generatePasword();
			
		}
	   
	     public void generatePasword() {
	    	 	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	     
			                     + "0123456789"
			                     + "!";
				for (int j = 0; j < 2097152; j++){
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < 6; i++) {
				                   // 0 to AlphaNumericString variable length
				int index = (int)(AlphaNumericString.length()
				                             * Math.random());
				                                                // add Character one by one in end of sb
				sb.append(AlphaNumericString.charAt(index));
				                     }
				String choice = sb.toString();
				//System.out.println(choice);
				this.alist.add(choice);
	
				}
	     }
	        
	        public  String EmailPword() {
	        	  int pwindex = (int)(alist.size() * Math.random());
	        	    System.out.println("Your email password is " + alist.get(pwindex));
	        	    this.Email=alist.get(pwindex);
	        	    return alist.get(pwindex);
				
			}
	        
	        public  String bankingPassword() {
	        	int pwindex2 = (int)(alist.size() * Math.random());
	            System.out.println("Your banking password is " + alist.get(pwindex2));
	            this.Banking=alist.get(pwindex2);
	            return alist.get(pwindex2);
			
			}
	        
	        public  String shoppingPassword() {
	        	 int pwindex3 = (int)(alist.size() * Math.random());
	        	    System.out.println("Your shopping password is " + alist.get(pwindex3));
	        	    Shopping=alist.get(pwindex3);
	        	    return alist.get(pwindex3);
			}
	
	        public void passWordChecker(String entree, String pass) {
	        	if (entree.equals(pass)) {
					setValidate(true);
				}	else {
					setValidate(false);
				}	
			}
	        public boolean getValidate() {
				return this.validate;
			}
	        public void setNumTries(int a) {
				this.numTries=a;
			}
	        public int getNumTries() {
				return this.numTries;
			}
	        public void setValidate(boolean b) {
				// TODO Auto-generated method stub
				this.validate=b;
			}

			public String getShopping() {
				return Shopping;
			}

			public void setShopping(String shopping) {
				Shopping = shopping;
			}

			public String getBanking() {
				return Banking;
			}

			public void setBanking(String banking) {
				Banking = banking;
			}

			public String getEmail() {
				return Email;
			}

			public void setEmail(String email) {
				Email = email;
			}
			
}
