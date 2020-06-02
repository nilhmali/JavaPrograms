package programs;

import java.util.Arrays;

import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.ArrayUtils;

public class DeletevalueinArray {

	public static void main(String[] args) {
		
		int[] n= {3,4,5,2};
		
		System.out.println(n.length);
		
		n=ArrayUtils.addFirst(n, 7);//removing element at index 2
		
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.println("After =>"+n[i]);
		}
		System.out.println("After count=>"+n.length);
		
		
	}

}
