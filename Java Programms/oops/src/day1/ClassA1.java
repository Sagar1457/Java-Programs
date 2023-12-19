package day1;
public class ClassA1 extends ClassB
{
	 void Kill() 
	{
		ClassA an=new ClassA();//HAS-A Relation
		an.setUsername("Sagar");
		an.setPassword(879092);
		System.out.println(an.getUsername());
		System.out.println(an.getPassword());
	}
	public static void main(String[] args) 
	{
		ClassA1 sa=new ClassA1();
		sa.Anitha();
		sa.Kill();
		
	}
}
	
	
