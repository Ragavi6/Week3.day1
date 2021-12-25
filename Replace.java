package week3.day1;

public class Replace {
	public static void main(String[] args) {
		
		//String sentence = "I am working with Java8"
		
		String s1 = "I am working with Java8";
		//replace 8 to 11 
	
		
		String s2 = s1.replace("8", "11");
		System.out.println(s2);
		//Print the characters from 5 to 14
		s1=s2;
		
		System.out.println(s1);
		
		int s3 = s1.length();
		System.out.println("length of total string" +s3);
		
		int s4 = s3-10;
		
		System.out.println("print required from 5 to " + s4);
		
		for (int i=5; i<=s4; i++)

{
			char e1 = s1.charAt(i);
			
			System.out.println(e1);
}
		
		
		
		
	}

}


