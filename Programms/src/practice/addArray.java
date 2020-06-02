package practice;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class addArray {
	
	public static void main(String[] str1)
	{
	int[] a1={3,4,5};
	int[] a2={4,5};
	int[] a3;
	int temp=0;
	a3=ArrayUtils.addAll(a1,a2);
	
	//System.out.println(Arrays.toString(a3));


	for(int i=0;i<=a3.length-1;i++)
	{
	for(int j=0;j<a3.length-1;j++)
	{

	if(a3[j+1]<a3[j])
	{

	temp=a3[j+1];
	a3[j+1]=a3[j];
	a3[j]=temp;

	}

	}

	for(int k=0;k<=a3.length-1;k++)
	{
	System.out.println(a3[k]);

	}


	}



	}
}
