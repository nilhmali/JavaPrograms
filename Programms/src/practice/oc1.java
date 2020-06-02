package practice;

import java.util.HashMap;

public class oc1 {
	public static void main(String[] str1)
	{
	String s1="aabbccddd";



	char[] c1=s1.toCharArray();

	HashMap<Character,Integer> hp=new HashMap<>();

	for(char c2:c1)
	{
	if(hp.containsKey(c2))
	{
	hp.put(c2,hp.get(c2)+1);
	}
	else
	hp.put(c2,1);

	}
	System.out.println(hp);

	}
}
