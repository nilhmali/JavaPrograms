package practicenew1;

import java.util.HashMap;

public class occurance1 {
	public static void main(String[] a)
	{




	String str1="aabbcccdd";
	char[] ch=str1.toCharArray();

	HashMap<Character,Integer> hp=new HashMap<>();

	for(char c1:ch)
	{

	if(hp.containsKey(c1))
	{
	hp.put(c1,hp.get(c1)+1);

	}
	else
	hp.put(c1,1);


	}
	System.out.println(hp);


	}
}
