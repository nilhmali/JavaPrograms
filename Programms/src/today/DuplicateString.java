package today;

public class DuplicateString {
	public static void main(String[] a1)
	{

	String s1="nilesh mali nilesh Advik mali";
	String[] s2=s1.split(" ");

	for(int i=0;i<=s2.length-1;i++)
	{
	for(int j=i+1;j<=s2.length-1;j++)
	{
	if(s2[i].contains(s2[j]))
	{
	System.out.println(s2[i]);

	}

	}
	}


	}
}
