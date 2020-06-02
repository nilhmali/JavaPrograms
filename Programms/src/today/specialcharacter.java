package today;

public class specialcharacter {
	public static void main(String[] s1)
	{

	String str="nilesshMali@@$@$@";

	for(int i=0;i<=str.length()-1;i++)
	{

	if(Character.isAlphabetic(str.charAt(i)))
	{
	System.out.println(str.charAt(i));

	}

	}



	}
}
