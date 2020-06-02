package practice;

public class duplicate {

	
	public static void main(String s1[])
	{
	 String s3="nilesh mali nilesh";
	 String [] s2=s3.split(" ");
	 
	 for(int i=0;i<=s2.length-1;i++)
	 {
	 for(int j=i+1;j<=s2.length-1;j++)
	 {
	 if(s2[i].contains(s2[j]))
	 {
	 System.out.println(s2[j]);
	 
	 }
	 
	 }
	 
	 }
	 
	 }

	}

