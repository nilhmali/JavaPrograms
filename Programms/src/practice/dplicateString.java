package practice;

public class dplicateString {

	public static void main(String[] str)
	{

	String s1="nilesh Mali Mali advik nilesh";
	String[] s2=s1.split(" ");
	int count=1;
	for(int i=0;i<=s2.length-1;i++)
	{
	for(int j=i+1;j<=s2.length-1;j++)
	{

	if(s2[i].contains(s2[j]))
	{
	count++;
	System.out.println(s2[i]+" "+count);
	}

	}


	}


	}
	
}
