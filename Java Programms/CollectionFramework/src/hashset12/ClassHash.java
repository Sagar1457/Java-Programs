package hashset12;
import java.util.HashSet;
import java.util.Iterator;
public class ClassHash
{
	
		static void H() 
		{
			HashSet<Object> hs=new HashSet<Object>();
			hs.add(10);
			hs.add('A');
			hs.add(24.56);
			hs.add("Sagar");
			System.out.println(hs);
			
			Iterator i=hs.iterator();
			while(i.hasNext()) 
			{
				System.out.println(i.next()+" ");
			}
		}
		public static void main(String[] args) 
		{
			H();
		}
	

}
