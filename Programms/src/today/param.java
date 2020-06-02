package today;

import java.util.Arrays;

public class param {
	public static void main(String [] s1)
	{
	String str="nilesh";
	String str1="shnilea";

	char[] c1=str.toCharArray();
	char[] c2=str1.toCharArray();

	Arrays.sort(c1);
	Arrays.sort(c2);

	if(Arrays.equals(c1,c2))
	{
	System.out.println("this param");

	}
	else
	System.out.println("not param");


	}

}
