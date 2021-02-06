package checking;

public class Student {





	private void rollno() 
	{
		
         //Method1
		System.out.println("Roll No-21062");
		
	}
	
	private void name() {

		//Method2
		System.out.println("Name-Rameshkannan E");
		
	}

	private void dob() {

		//Method3
		System.out.println("Date of Birth-06/10/1994");
		
	}
	
	private void address() {
		//Method4
		System.out.println("1/32,\nPoolampatti-(po),\nPalani");

	}
	
	public static void main(String[] args) {
		
		//classname objectname= new classname();
		
		Student stu=new Student();
		
		//object.methodname();
		
		stu.rollno();
		stu.name();
		stu.dob();
		stu.address();
		
	}
	
	
			
	
}

