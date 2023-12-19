package oops_programs;
public class EncapsulationClassB
{
	void S() 
	{
		EncapsulationClassA obj=new EncapsulationClassA();
		obj.setUserName("Shiva");
		obj.setUserAge(25);
		obj.setUserPhnNo(1234567890);
		System.out.println(obj.getUserName());
		System.out.println(obj.getUserAge());
		System.out.println(obj.getUserPhnNo());
	}
	public static void main(String[] args) 
	{
		EncapsulationClassB obj=new EncapsulationClassB();
		obj.S() ;
	}
}
