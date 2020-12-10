import java.io.*;
public class eoa
{
@Deprecated
public static void main(String[] args)
{
DataInputStream in=new DataInputStream(System.in);
int a[]=new int[100];
int i=0,n=0,b=0,even=0,odd=0;
System.out.println("The programme is for 100 number");
System.out.println();
System.out.println();
System.out.println("Please input the number of elements");
try
{
n=Integer.parseInt(in.readLine());
System.out.println();
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(in.readLine());
}
}
catch(Exception E){}
for(i=0;i<n;i++)
{
b=a[i]%2;
if(b==0)
{
even=even+1;
}
else
{
odd=odd+1;
}
}
System.out.println("THE TOTAL NUMBER OF EVEN INTEGERS= "+even);
System.out.println("THE TOTAL NUMBER OF ODD INTEGERS= "+odd);
}
}



/*F:\ct\Java>java eoa
The programme is for 100 number


Please input the number of elements
3

1
2
3
THE TOTAL NUMBER OF EVEN INTEGERS= 1
THE TOTAL NUMBER OF ODD INTEGERS= 2*/
