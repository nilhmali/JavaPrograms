package today;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] a)
	{

	List<String> list1=new ArrayList<>();

	list1.add("nilesh@gmail.com");
	list1.add("nimali#gmail.com");
	list1.add("nilesh#@gmail.com");

	String regrx="^(.+)@(.+)$";

	Pattern p1=Pattern.compile(regrx);

	for(String s1:list1)
	{
	Matcher m1=p1.matcher(s1);
	System.out.println(m1.matches());
	}



	}
}
