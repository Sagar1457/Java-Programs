/*
1.Write a Java Program to implement Encapsulation using setters and getters
classname: EncapsulationClassA
           EncapsulationClassB
declare three private variables in EncapsulationClassA:
          userName
          userAge
          userPhnNo
*/
package oops_programs;
//BVIDHYASAGAR..AF0320724
public class EncapsulationClassA 
{
	private  String userName;
	private	 int userAge;
	private  long userPhnNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public long getUserPhnNo() {
		return userPhnNo;
	}
	public void setUserPhnNo(long userPhnNo) {
		this.userPhnNo = userPhnNo;
	}
}
