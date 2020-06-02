package programs;

public class stringprogrmms {

	public static void main(String[] args) {
		
		String str="kirti Mali";
		String[] str1=str.split(" ");
		String mainstring=" ";
		for(int i=0;i<=str1.length-1;i++)
		{
			String word=" ";
			for(int j=str1[i].length()-1;j>=0;j--)
			{
				word=word+str1[i].charAt(j);
			}
			
			mainstring=mainstring+word;
		}
		System.out.println(mainstring);
	}

}
