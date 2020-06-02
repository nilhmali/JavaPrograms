package practicenew1;

public class checkVowel {
	public static void main(String[] s1)
	{



	String str1="abEiOueoE";
	char[] char1=str1.toCharArray();
	int count=0;
	for(int i=0;i<=char1.length-1;i++)
	{
		
	boolean s3=char1[i]=='a' || char1[i]=='E' || char1[i]=='i' || char1[i]=='O' || char1[i]=='u' || char1[i]=='e' || char1[i]=='o';

	if(s3)
	{
	count++;
	}
		
	}
	System.out.println(count);






	}
}
