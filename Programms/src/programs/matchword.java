package programs;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class matchword {

	public static void main(String[] args) {
		
		String s1="nilesh";
		String s2="lenisha";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("param");
		}
		else
			System.out.println("not param");
		
		

	}

}
