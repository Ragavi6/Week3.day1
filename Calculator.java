package week3.day1;

public class Calculator {
	//add scanerio
	
	public void add (int num1,int num2) {
		
		System.out.println(num1+num2);
		
	}

   public void add (int num1,int num2,int num3) {
		
	   System.out.println(num1+num2+num3);
	   
   } 
	   
	   //multiply scanerio 
	   
	   public void mul(int num1,int num2) {
			
			System.out.println(num1*num2);
	  	   
   }	
		
	   public void mul (int num1,int num2, int num3) {
			
			System.out.println(num1*num2*num3);
	   }
	   //sub scanerio 
	   public void sub (int num1,int num2) {
			
			System.out.println(num1-num2);
	  	   
  }	
	  
	   public void sub (int num1,int num2, int num3) {
			
			System.out.println(num1-num2-num3);
			
	   }
	  
	   //divide scanerio 
	   
	   public void divi (int num1,int num2) {
			
			System.out.println(num1/num2);
	  	   
 }	
	  
	   public void divi (int num1,int num2, int num3) {
			
			System.out.println(num1/num2/num3);
			
	   }
	   
 
    
	public static void main(String[] args) {
		
		Calculator calu = new Calculator();
		calu.add(10,20);
		calu.add(10,20,30);
		calu.sub(10,20);
		calu.sub(10,12,90);
		calu.divi(10,20);
		calu.divi(10,50,30);
		calu.mul(10,50);
		calu.mul(10,20,30);
		
	}
	

	

}

