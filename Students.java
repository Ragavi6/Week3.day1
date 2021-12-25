package week3.day1;

public class Students {
	
public void getStudentInfo()
	
	{
		System.out.println("getStudentInfo");
	}
	
	
public void getStudentInfo(int ID)
	
	{
		System.out.println("getStudentInfo using ID ");
	}
	
	
public void getStudentInfo(int ID, String Name )

{
	System.out.println("getStudentInfo using ID and Name  ");
}


public void getStudentInfo(String Email, String PhoneNumber )

{
	System.out.println("getStudentInfo using ID and PhoneNumber  ");
}

	public static void main(String[] args) {
		
			Students Stu = new Students();
			
			Stu.getStudentInfo();
			Stu.getStudentInfo(6);
			Stu.getStudentInfo(6,"Ragavi");
			Stu.getStudentInfo("Ragavinatarajan6@gmail.com", "9834353738");
			

	}

}
