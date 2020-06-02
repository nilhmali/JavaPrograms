package practice;

public class removespecialcharacter {
	public static void main(String[] st1)
	{
	String s1="nileshmali@$@$$$";

	for(int i=0;i<=s1.length()-1;i++)
	{
	if(Character.isAlphabetic(s1.charAt(i)))
	{
	System.out.print(s1.charAt(i));

	}


	}


	}
}
