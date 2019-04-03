	import java.util.ArrayList;
	import java.util.List;

	
public class pschemes {

	private boolean validate;
	private List<String> alist=new ArrayList<String>();
	private int eTries,sTries,bTries;
	private String Email=null,Shopping=null,Banking=null;
		public pschemes() {
			// TODO Auto-generated constructor stub
			this.setValidate(false);
			setbTries(0);
			seteTries(0);
			setsTries(0);
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

			public int geteTries() {
				return eTries;
			}

			public void seteTries(int eTries) {
				this.eTries = eTries;
			}

			public int getsTries() {
				return sTries;
			}

			public void setsTries(int sTries) {
				this.sTries = sTries;
			}

			public int getbTries() {
				return bTries;
			}

			public void setbTries(int bTries) {
				this.bTries = bTries;
			}

		
			
}
