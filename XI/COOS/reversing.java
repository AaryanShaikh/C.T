import java.io.*;
public class reversing{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int a=0,i=0,c=0,g=10,sum=0,d=10;
System.out.println("Enter the number with 3 digits");
try
{
System.out.println("Enter any Integer");
a=Integer.parseInt(in.readLine());
}
catch(Exception E){}
System.out.println("reversed");
for(i=1;i<=15;i++)
{
if(a>10)
{
c=g%10;
a=a/d;
sum=sum+c;
System.out.println(+c);
}
System.out.println(+a);
sum=sum+a;
System.out.println("Sum of the digits ="+sum);
}
}
}
