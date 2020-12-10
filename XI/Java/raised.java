import java.io.*;
public class raised{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int a=0,b=0,c=0,d=0;
	try
	{
	System.out.println("enter a number");
	a=Integer.parseInt(in.readLine());
	System.out.println("enter a number raised to");
	b=Integer.parseInt(in.readLine());
	}
	catch(Exception E){}
	d=a;
		for(c=1;c<b;c++)
		{
		a=a*d;
		}
		System.out.println("the Solution is ="+a);
		}
		}
		
		
		
		F:\ct\Java>java raised
enter a number
5
enter a number raised to
4
the Solution is =625
	
