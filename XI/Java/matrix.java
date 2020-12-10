/**single 2-dimensional array*/
import java.io.*;
public class matrix{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int i=1,k=1;
int a[][]=new int[3][3];
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
System.out.println("The matrix is");
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
}
}

F:\ct\!>java matrix
type in 2 dimensional array
1
2
3
4
The matrix is
1       2


3       4



