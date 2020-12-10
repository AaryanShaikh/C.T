/**add 2-dimensional array*/
import java.io.*;
public class matrixadd{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int i=1,k=1;
int a[][]=new int[4][4];
int b[][]=new int[4][4];
int c[][]=new int[4][4];
System.out.println("type in 2 dimensional array");
for(i=1;i<=2;i++)
{
	for(k=1;k<=2;k++)
	{
		try
		{
			
			a[i][k]=Integer.parseInt(in.readLine());
		}
		catch(Exception E){}
	}
}
System.out.println("type in second 2 dimensional array");
for(i=1;i<=2;i++)
{
	for(k=1;k<=2;k++)
	{
		try
		{
			
			b[i][k]=Integer.parseInt(in.readLine());
		}
		catch(Exception E){}
		c[i][k]=a[i][k]+b[i][k];
	}
}
System.out.println("The first matrix is");
for(i=1;i<=2;i++)
{
	for(k=1;k<=2;k++)
	{
	  System.out.print(+a[i][k]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
System.out.println("The second matrix is");
for(i=1;i<=2;i++)
{
	for(k=1;k<=2;k++)
	{
	  System.out.print(+b[i][k]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
System.out.println("The sum of the two  matrix is");
for(i=1;i<=2;i++)
{
	for(k=1;k<=2;k++)
	{
	  System.out.print(+c[i][k]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
}
}

F:\ct\!>java matrixadd
type in 2 dimensional array
1
2
3
4
type in second 2 dimensional array
1
2
3
4
The first matrix is
1       2


3       4


The second matrix is
1       2


3       4


The sum of the two  matrix is
2       4


6       8




