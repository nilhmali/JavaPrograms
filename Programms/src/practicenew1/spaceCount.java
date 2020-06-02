package practicenew1;

public class spaceCount {
	public static void main(String[] s1)
	{
	String str2="nilesh Mali Advik ";
	int count=1;

	for(int i=0;i<=str2.length()-1;i++)
	{

	if(str2.charAt(i)==' ')
	{
	count++;

	}

	}

	System.out.println(count-1);

	}
}
