package practice;

import java.util.HashMap;

public class occurance {

	public static void main(String[] args)
	{
	String s1="nnmmaaa";
	char[] s2=s1.toCharArray();

	HashMap<Character,Integer> hp=new HashMap<Character,Integer>();

	for(char s3:s2)
	{

	if(hp.containsKey(s3))
	{

	hp.put(s3,hp.get(s3)+1);

	}
	else
	hp.put(s3,1);

	}
	System.out.println(hp);



	}
}
