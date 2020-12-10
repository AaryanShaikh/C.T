import java.io.*;
public class prime{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,c=0,d=0,e=0;
try
{
System.out.println("type any integer");
e=Integer.parseInt(in.readLine());
}
catch(Exception E){}
for(i=2;i<e;i++)
{
d=e%i;
if(d==0)
{
c=1;
}
}
if(c==0)
{
System.out.print(+e);
}
}
}