package week3.day1;

public class Desktop extends Computer {

	
	public void desktopSize()
	{
		System.out.println("desktopSize");
	}
	
  public static void main (String[] args) {
		
		Desktop obj = new Desktop();
		
		obj.ComputerModel();
		obj.desktopSize();
  }
	
	
	
}

