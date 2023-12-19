package classTreeset;
import java.util.TreeSet;
public class Treeset1 
{
	static void H() 
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(10);
		//ts.add('A');
		//ts.add(24.56);
		//ts.add("Sagar");
		ts.add(30);
		ts.add(20);
		ts.add(50);
		System.out.println(ts);
		
		/*Iterator i=hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next()+" ");
		}*/
	}
	public static void main(String[] args) 
	{
		H();
	}

}
