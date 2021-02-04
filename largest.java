class largest {
public static void main(String args[])
{
int s1=Integer.parseInt(args[0]);
int s2=Integer.parseInt(args[1]);
int s3=Integer.parseInt(args[2]);
if(s1>s2 && s1>s3)
System.out.println("Largest number is:"+s1);
else if(s2>s1 && s2>s3)
System.out.println("Largest number is:"+s2);
else
System.out.println("Largest number is:"+s3);
}
}