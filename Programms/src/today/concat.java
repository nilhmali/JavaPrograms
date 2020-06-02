package today;

public class concat {

public static void main(String[] s1)
{
String str="nikesh";
String str2="mali";

String str3=str+str2;
System.out.println("using operator=>"+str3);

String str4=str.concat(str2);

System.out.println("using concat method=>"+str4);
}
}
