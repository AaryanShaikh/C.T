import java.io.*;
public class raised{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int a=0,b=0,c=0,d=0;
	try
	{
	System.out.println("enter a number raised to");
	b=Integer.parseInt(in.readLine());
	}
	catch(Exception E){}
	d=1;
		for(c=1;c<=b;c++)
		{
		d=2*d;
		}
		System.out.println("the Solution is ="+d);
		}
		}
		


