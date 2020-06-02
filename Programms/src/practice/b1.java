package practice;

public class b1 {
	public static void main(String[] str){
		String s1="nilesh Mali Advik mali ";
		int count=1;
		for(int i=0;i<=s1.length()-1;i++)
		{
		if(s1.charAt(i)==' ')
		{
		count++;

		}
		 
		}
		System.out.println("number of words=>"+count);
		System.out.println(count-1);

		}
}
