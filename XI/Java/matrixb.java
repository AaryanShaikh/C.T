/**3x3 matrix print by interchanging manner*/
import java.io.*;
public class matrixb{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int i=1,k=1;
int a[][]=new int[5][5];
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
System.out.println("The matrix by interchanging it is");
for(i=1;i<=3;i++)
{
	for(k=1;k<=3;k++)
	{
	  System.out.print(+a[k][i]);
	  System.out.print("	");
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
}
}
}

