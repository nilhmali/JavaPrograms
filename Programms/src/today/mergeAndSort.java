package today;

import org.apache.commons.lang3.ArrayUtils;

public class mergeAndSort {
	public static void main(String[] a1)
	{
	int[] c3={1,5,3,2};
	int[] c2={8,4};
	int temp=0;
	int[] c1=ArrayUtils.addAll(c3,c2);

	for(int i=0;i<=c1.length-1;i++)
	{
	for(int j=0;j<c1.length-1;j++)
	{
	if(c1[j+1]<c1[j])
	{

	temp=c1[j+1];
	c1[j+1]=c1[j];
	c1[j]=temp;

	}

	}


	}

	for(int k=0;k<=c1.length-1;k++)
	{
	System.out.println(c1[k]);
	}
	
	System.out.println("2nd hightst number=>"+c1[4]);
	}

}
