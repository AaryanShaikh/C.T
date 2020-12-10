import java.io.*;
public class matrixa{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=1,k=1;
int a[][]=new int[4][4];
int b[][]=new int[4][4];
int c[][]=new int[4][4];
 System.out.println("Enter the first matrix");
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
 System.out.println("Enter the second matrix");
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
       System.out.println("		");
       System.out.println("		");
       System.out.println("		");
  }
System.out.println("The second matrix is");
     for(i=1;i<=2;i++)
  {
    for(k=1;k<=2;k++)
     {
	 
      System.out.print(+b[i][k]);
      System.out.print("	");
     }
       System.out.println("		");
       System.out.println("		");
       System.out.println("		");
  }

  System.out.println("The sum of the 2 matrix is");
       for(i=1;i<=2;i++)
  {
    for(k=1;k<=2;k++)
     {
	 
      System.out.print(+c[i][k]);
      System.out.print("	");
     }
       System.out.println("		");
       System.out.println("		");
       System.out.println("		");
  }
}
}





/*F:\ct\Java>java matrixa
type in 2d array
2
type in 2d array
4
type in 2d array
7
type in 2d array
8
type in second 2d array
6
type in second 2d array
7
type in second 2d array
8
type in second 2d array
7
2       4


7       8


6       7


8       7


8       11


15      15
*/

