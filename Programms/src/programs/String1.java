package programs;

import java.util.HashMap;
import java.util.Map;

public class String1 {

	public static void main(String[] args)
	{
	
	HashMap<Integer,String> hp=new HashMap<>();
	
	hp.put(1, "Nilesh");
	hp.put(2, "Advik");
	hp.put(3, "Kirti");

	for(Map.Entry<Integer, String> h1:hp.entrySet())
	{
		System.out.println(h1.getKey()+"=>"+h1.getValue());
	}
	
}

}
