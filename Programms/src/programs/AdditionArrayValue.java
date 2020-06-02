package programs;

public class AdditionArrayValue {
	
	public static void main(String[] s1) 
	{
		
		AdditionArrayValue a=new AdditionArrayValue();
		a.add();
	}


	public void add()
	{
		int[] a= {4,5,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		}
	}
