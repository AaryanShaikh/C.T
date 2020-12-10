import java.io.*;
public class pnza{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int a=1,p=0,n=0,z=0;
int b[]=new int[100];
System.out.println("Enter ten numbers");
System.out.println("");
do
{
	try
	{
	System.out.println("enter the integers");
	b[a]=Integer.parseInt(in.readLine());
	}
	catch(Exception E){}
	a=a+1;
}
	while(a<=10);
	for(a=1;a<=10;a++)
	{
		if(b[a]>0)
		{
		System.out.println("number is positive="+b[a]);
		p=p+1;
		}
		if(b[a]==0)
		{
		System.out.println("number is zero="+b[a]);
		z=z+1;
		}
		if(b[a]<0)
		{
		System.out.println("number is negative="+b[a]);
		n=n+1;
		}
	}
		System.out.println("");
		System.out.println("");
		System.out.println("number of positive integers="+p);
		System.out.println("number of negative integers="+n);
		System.out.println("number of zero integers="+z);
}
}		

E:\D3MON\Coosva>java pnza
Enter ten numbers

enter the integers
1
enter the integers
2
enter the integers
3
enter the integers
4
enter the integers
-1
enter the integers
-2
enter the integers
-3
enter the integers
-4
enter the integers
0
enter the integers
0
number is positive=1
number is positive=2
number is positive=3
number is positive=4
number is negative=-1
number is negative=-2
number is negative=-3
number is negative=-4
number is zero=0
number is zero=0


number of positive integers=4
number of negative integers=4
number of zero integers=2


