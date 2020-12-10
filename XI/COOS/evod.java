import java.io.*;
public class evod{
@Deprecated
public static void main(String[] args){
DataInputStream in=new DataInputStream(System.in);
int a[]=new int[100];
int i=0,n=0,b=0,even=0,odd=0;
System.out.println("The programme is for 100 number");
System.out.println();
System.out.println();
System.out.println("input the number of elements");
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
System.out.println("the total number of even integers= "+even);
System.out.println("the total number of odd integers= "+odd);
}
}

E:\D3MON\Coosva>java evod
The programme is for 100 number


input the number of elements
3

1
4
5
the total number of even integers= 1
the total number of odd integers= 2