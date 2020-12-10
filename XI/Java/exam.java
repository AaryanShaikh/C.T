import java.io.*;
public class exam{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int n=0,i;
for (i=1;i<=10;i++)
{
try
{
System.out.println("enter any integer");
n=Integer.parseInt(in.readLine());
}
catch (Exception E){}
if(n/2==0)
System.out.println("even number");
else
System.out.println("odd number");
}
}
}
