package today;
import org.apache.commons.lang3.ArrayUtils;

public class mergeArray {
	public static void main(String[] s1)
	{

	String[] str1={"nilesh","Mali"};
	String[] str2={"Advik"};

	String[] str3=ArrayUtils.addAll(str1,str2);

	for(int i=0;i<=str3.length-1;i++)
	{
	System.out.println(str3[i]);
	}

	}
}
