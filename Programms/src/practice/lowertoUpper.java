package practice;

public class lowertoUpper {

	public static void main(String[] str)
	{

	String st1="Nilesh Mali";
	StringBuffer strbuf=new StringBuffer(st1);


	for(int i=0;i<=st1.length()-1;i++)
	{
	if(Character.isLowerCase(st1.charAt(i)))
	{

	strbuf.setCharAt(i,Character.toUpperCase(st1.charAt(i)));
	}
	else
	if(Character.isUpperCase(st1.charAt(i)))
	{

	strbuf.setCharAt(i,Character.toLowerCase(st1.charAt(i)));
	}
	}
	System.out.println(strbuf);


	}

}
