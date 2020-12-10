//Khamrunnisa
//program to add two matrices
//roll no 14
import java.io.*;
public class matrix{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,k=0,r=0,r2=0,c=0,c2=0;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int d[][]=new int[10][10];
try
{
for(i=0;i<=10;i++)
{
System.out.println("Enter the no of rows of the first matrix");
r=Integer.parseInt(in.readLine());
System.out.println("Enter the no of columns of the first matrix");
c=Integer.parseInt(in.readLine());
System.out.println("Enter the no of rows of the second matrix");
r2=Integer.parseInt(in.readLine());
System.out.println("Enter the no of columns of the second matrix");
c2=Integer.parseInt(in.readLine());
if((r!=r2)||(c!=c2))
{
System.out.println("Matrix cannot be added,re enter the elements");
}
else
{
break;
}
}
}
catch (Exception E){}
try
{
System.out.println("Enter the elements of first matrix");
for(i=1;i<=r;i++)
{
for(k=1;k<=c;k++)
{
a[i][k]=Integer.parseInt(in.readLine());
}
}
}
catch (Exception E){}
try
{
System.out.println("Enter the elements of second matrix");
for(i=1;i<=r;i++)
{
for(k=1;k<=c;k++)
{
b[i][k]=Integer.parseInt(in.readLine());
}
}
}
catch (Exception E){}
System.out.println("The sum of the 2 matrices is=");
for(i=1;i<=r;i++)
{
System.out.println("");
for(k=1;k<=c;k++)
{
d[i][k]=a[i][k]+b[i][k];
System.out.print(+d[i][k]);
System.out.print("	");
}
System.out.println("");
}
}
}

//*E:\Kh\xii\COOS\maths>java matrix
Enter the no of rows of the first matrix
2
Enter the no of columns of the first matrix
2
Enter the no of rows of the second matrix
2
Enter the no of columns of the second matrix
2
Enter the elements of first matrix
1
2
3
4
Enter the elements of second matrix
5
6
7
8
The sum of the 2 matrices is=

6       8

10      12