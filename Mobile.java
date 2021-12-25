package week3.day1;

public class Mobile {

	              public void sendmsg() {
		          System.out.println("sent msg");	 
		
				}
			      public void makecall() {
			      System.out.println("call connected ");	 
					 	
			    	
			    }
			      public void savecontact() {	
			      System.out.println("contact saved");  	
			    }
			  public static void main(String[] args) {
				
				  Mobile mob= new Mobile();
				  
				  mob.savecontact();
				  mob.sendmsg();
				  mob.makecall();
	}

}
