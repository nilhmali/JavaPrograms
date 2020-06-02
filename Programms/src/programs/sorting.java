package programs;

public class sorting {

	public static void main(String[] args) {
		
		//int[] n= {3,2,1,4,7,5,6};
		//int temp=0;
		char[] n= {'b','c','v','n'};
		char temp;
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=0;j<n.length-1;j++)
			{
				if(n[j+1]<n[j])
				{
					temp=n[j+1];
					n[j+1]=n[j];
					n[j]=temp;
				}
			}
		}
		
		for(int k=0;k<=n.length-1;k++)
		{
			System.out.println(n[k]);
		}
//System.out.println("2nd High=>"+n[5]);
	}

}
