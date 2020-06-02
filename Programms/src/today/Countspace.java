package today;

public class Countspace {

public static void main(String[] s1)
{

String str1="nilesh mali dhule ";
int count=1;
for(int i=0;i<=str1.length()-1;i++)
{
if(str1.charAt(i)==' ')
{
count++;
}
}
System.out.println(count-1);
}
}
