import java.io.*;
public class ncr{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int n=0,r=0,ncr=0,a=1,f=1,b=1,d=0,e=0,g=0,k=0;
try
{
System.out.println("Enter the no of items");
n=Integer.parseInt(in.readLine());
System.out.println("Enter the no of combination");
r=Integer.parseInt(in.readLine());
}
catch(Exception E){}
d=n*a;
for(a=2;a<=n;a++)
{
d=d*a;
}
System.out.println("The value of n!="+d);
e=r*b;
for(b=2;b<=r;b++)
{
e=e*b;
}
System.out.println("The value of n!="+e);
k=n*b;
g=k*f;
for(f=2;f<=k;f++)
{
g=g*f;
System.out.println("The value of(n-r)!"+g);
ncr=d/(e*g);
System.out.println("The value of ncr="+ncr);
}
}
}