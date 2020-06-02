package today;

public class uppertoLower {

public static void main(String s1[])
{

String str1="Nilesh Mali";

StringBuffer strbuf=new StringBuffer(str1);


for(int i=0;i<=str1.length()-1;i++)
{
if(Character.isLowerCase(str1.charAt(i)))
{
strbuf.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
}
else
if(Character.isUpperCase(str1.charAt(i)))
{
strbuf.setCharAt(i,Character.toLowerCase(str1.charAt(i)));

}

}
System.out.println(strbuf);



}
}
