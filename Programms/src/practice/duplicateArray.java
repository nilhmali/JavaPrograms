package practice;

public class duplicateArray {

	public static void main(String s1[])
	{
	int[] a1={4,3,4,9,3};


	for(int i=0;i<=a1.length-1;i++)
	{
	for(int j=i+1;j<=a1.length-1;j++)
	{

	if(a1[i]==a1[j])
	{
	System.out.println(a1[i]);

	}


	}


	}



	}
	
	
	
}
