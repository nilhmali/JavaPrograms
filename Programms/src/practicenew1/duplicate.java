package practicenew1;

public class duplicate {
	public static void main(String[] a)
	{




	String str1="nilesh Mali nilesh Advik";
	String[] str2=str1.split(" ");


	for(int i=0;i<=str2.length-1;i++)
	{

	for(int j=i+1;j<=str2.length-1;j++)
	{
	if(str2[i].contains(str2[j]))
	{
	System.out.println(str2[i]);

	}

	}



	}





	}
}
