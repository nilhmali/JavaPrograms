package programs;

public class SpaceCount {

	public static void main(String[] args) {
		
		String str1="nilesh mali dhule";
		int count=1;
		
		for(int i=0;i<=str1.length()-1;i++)
		{
		
		if(str1.charAt(i)==' ')
		{
			count++;
			
		}
		
		}
		
		System.out.println(count);
		System.out.println(count-1);
	}

}
