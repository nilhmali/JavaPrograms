package today;

public class vowel {

public static void main(String[] s1)
{
String str1="abcdefoiau";

int count=0;

for(int i=0;i<=str1.length()-1;i++)
{
if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='o' || str1.charAt(i)=='i' || str1.charAt(i)=='u')
{
count++;

}

}
System.out.println(count);
}
}
