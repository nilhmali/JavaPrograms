package programs;

public class countVowel {

	public static void main(String[] args) {
		
		String s1="nilesh ab";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='i' || s1.charAt(i)=='e' || s1.charAt(i)=='a' || s1.charAt(i)=='o')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
