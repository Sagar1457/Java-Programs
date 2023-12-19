package collectionFrame;
//BVIDHYASAGAR..AF0320724
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CollectionFramework2 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("Anand" , "ID102");
		h.put("Ramesh" , "ID101");
		h.put("Kiran" , "ID100");
		System.out.println(h);
		System.out.println();
		List<Map.Entry<String, String>> a=new ArrayList<>(h.entrySet());
		Collections.sort(a,new Comparator<Map.Entry<String, String>>() 
		{
				public int compare(Map.Entry<String, String> s1, Map.Entry<String, String> s2) 
				{
					return s1.getKey().compareTo(s2.getKey());
					//return s1.getValue().compareTo(s2.getValue());
				}
		});

		for (Map.Entry<String, String> i : a) 
		{
			System.out.println(i.getKey() + ": " + i.getValue());
		}
	}
}
/*
output:-
-------
{Kiran=ID100, Ramesh=ID101, Anand=ID102}

Anand: ID102
Kiran: ID100
Ramesh: ID101
----------------------
*/

