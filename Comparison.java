package week3.day1;

public class Comparison {
	
	public static void main(String[] args) {
		
                String s1="I am Learning Java";
				String s2="I am learning java";
				
						
				if (s1==s2)
				{
					System.out.println("s1 and s2 are equal ");
				}
				else
				{
					System.out.println("s1 and s2 are not equal ");
				}
	

				
				if (s1.equals(s2))
				{
					System.out.println("s1 and s2 are equal using equals command ");
				}
				else
				{
					System.out.println("s1 and s2 are not equal using equals command ");
				}
	
			
				if (s1.equalsIgnoreCase(s2))
				{
					System.out.println("s1 and s2 are equal using equalsIgnoreCase command ");
				}
				else
				{
					System.out.println("s1 and s2 are not equal using equalsIgnoreCase command ");
				}
				
				
	}
}


