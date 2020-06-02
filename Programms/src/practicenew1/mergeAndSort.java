package practicenew1;

import org.apache.commons.lang3.ArrayUtils;

public class mergeAndSort {
	public static void main(String[] d)
	{




	int[] a={4,2,5,1};
	int[] b={6,3,7};

	int[] c=ArrayUtils.addAll(a,b);
	int temp=0;
	for(int i=0;i<=c.length-1;i++)
	{

	for(int j=0;j<c.length-1;j++)
	{
	if(c[j+1]<c[j])
	{

	temp=c[j+1];
	c[j+1]=c[j];
	c[j]=temp;

	}

	}
	}

	for(int k=0;k<=c.length-1;k++)
	{
	System.out.println(c[k]);

	}


	}
}
