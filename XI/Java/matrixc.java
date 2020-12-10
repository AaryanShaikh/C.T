/**3-dimensional array subtract second matrix from first*/
import java.io.*;
public class matrixc{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int i=1,k=1;
int a[][]=new int[4][4];
int b[][]=new int[4][4];
int c[][]=new int[4][4];
System.out.println("type in 2 dimensional array");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
	{
		try
		{
			
			a[i][k]=Integer.parseInt(in.readLine());
		}
		catch(Exception E){}
	}
}
System.out.println("type in second 2 dimensional array");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
	{
		try
		{
			
			b[i][k]=Integer.parseInt(in.readLine());
		}
		catch(Exception E){}
		c[i][k]=a[i][k]-b[i][k];
	}
}
System.out.println("The first 2 dimensional array is");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
	{
	  System.out.print(+a[i][k]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
System.out.println("The second 2 dimensional array is");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
	{
	  System.out.print(+b[i][k]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
System.out.println("The Answer after subtracting is");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
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

F:\ct\!>java matrixc
type in 2 dimensional array
1
2
3
4
5
6
7
8
9
type in second 2 dimensional array
1
2
3
4
5
6
7
8
9
The first 2 dimensional array is
1       2       3


4       5       6


7       8       9


The second 2 dimensional array is
1       2       3


4       5       6


7       8       9


The Answer after subtracting is
0       0       0


0       0       0


0       0       0

