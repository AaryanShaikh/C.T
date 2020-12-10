import java.io.*;
public class matadd{
@Deprecated
public static void main(String[] args){
DataInputStream in=new DataInputStream(System.in);
int i,j,r=0,r2=0,k,c=0,c2=0,sum=0;
int first[][]=new int[4][4];
int second[][]=new int[4][4];
int add[][]=new int[4][4];
int sub[][]=new int[4][4];
int mul[][]=new int[4][4];

System.out.println("Enter the rows of the first matrix");
try
{
	r=Integer.parseInt(in.readLine());
}
catch(Exception E){}

System.out.println("Enter the columns of the first matrix");
try
{
	c=Integer.parseInt(in.readLine());
}
catch(Exception E){}

System.out.println("Enter the rows of the Second matrix");
try
{
	r2=Integer.parseInt(in.readLine());
}
catch(Exception E){}

System.out.println("Enter the columns of the Second matrix");
try
{
	c2=Integer.parseInt(in.readLine());
}
catch(Exception E){}
if(c!=r2)
{
	System.out.println("The Columns of the first matrix is not equal to the rows of the second matrix");
}
else
{
	System.out.println("Enter the first matrix");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			try
			{
				first[i][j]=Integer.parseInt(in.readLine());
			}
			catch(Exception E){}
		}
	}

	System.out.println("Enter the second matrix");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
			try
			{
				second[i][j]=Integer.parseInt(in.readLine());
			}
			catch(Exception E){}
			add[i][j]=first[i][j]+second[i][j];
			sub[i][j]=first[i][j]-second[i][j];
		}
	}

	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			for(k=0;k<r2;k++)
			{
				sum=sum+first[i][k]*second[k][j];
			}
			mul[i][j]=sum;
			sum=0;
		}
	}

	System.out.println(" The first matrix is:");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(first[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
			System.out.println("");
	}

	System.out.println(" The second matrix is:");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(second[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
			System.out.println("");
	}

	System.out.println(" The Sum of the 2 matrices is:");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(add[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
			System.out.println("");
	}
	
	System.out.println(" The Difference of the 2 matrices is:");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(sub[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
			System.out.println("");
	}
	
	System.out.println(" The multiplication of the 2 matrices is:");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r2;j++)
		{
			System.out.print(mul[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
			System.out.println("");
	}
}
}}


