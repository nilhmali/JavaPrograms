package practice;

import java.util.Scanner;

public class pallidString {
	public static void main(String[] a1)
	{
	String str1="aabbaac";

	String rev="";

	for(int i=str1.length()-1;i>=0;i--)
	{
	rev=rev+str1.charAt(i);
	}

	if(str1.equals(rev))
	{

	System.out.println("This pallidrom");
	}
	else
	System.out.println("This not pallidrom");
	}
	
}