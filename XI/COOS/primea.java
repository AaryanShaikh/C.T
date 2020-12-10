/** programme to print prime numbers in a given order*/

import java.io.*;
public class primea{
@Deprecated
public static void main(String[] args){
DataInputStream in=new DataInputStream(System.in);
int i=0,j=0,a=0,b=0,r=0,flag=0;
	try
	{
		System.out.println("enter first no.");
		a=Integer.parseInt(in.readLine());
		System.out.println("enter last no.");
		b=Integer.parseInt(in.readLine());
	}
	catch(Exception E){}
System.out.println("the prime nos. are");
	for(i=a;i<=b;i++)
	{
		flag=0;
		for(j=2;j<i;j++)
		{
		r=i%j;
			if(r==0)
			{
				flag=1;
			}
		}
			if(flag==0)
			{
				System.out.println(+i);
			}
		}
	}
}





E:\D3MON\Coosva>java primea
enter first no.
1
enter last no.
10
the prime nos. are
1
2
3
5
7