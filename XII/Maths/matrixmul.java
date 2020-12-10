import java.io.*;
class matrixmul{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,j=0,m=0,n=0,m2=0,n2=0,k=0,r=0,c=0,r2=0,c2=0;
int a[][] = new int[10][10];
int b[][] = new int[10][10];
int d[][] = new int[10][10];
  try{
   for(i=1;i<=10;i++)
    {
	 System.out.println("Enter the rows of first matrix");
	 r=Integer.parseInt(in.readLine());
	 
	 System.out.println("Enter the columns of first matrix");
	 c=Integer.parseInt(in.readLine());
	 
	 System.out.println("Enter the rows of second matrix");
	 r2=Integer.parseInt(in.readLine());
	 
	 System.out.println("Enter the columns of second matrix");
	 c2=Integer.parseInt(in.readLine());
	 
	 if(c!=r2)
	  {
	   System.out.println("The columns of first matrix is not equal to the rows of second matrix");
	   }
	  else
	   {
	    break;
		}
	   }
	  }
	   catch(Exception E){}
	    try{
		 System.out.println("Enter the elements of first matrix");
          for(i=1;i<=r;i++)
		   {
		    for(j=1;j<=c;j++)
			 {
			a[i][j]=Integer.parseInt(in.readLine());
             }
            }
           }
	   catch(Exception E){}
	    try{
		 System.out.println("Enter the elements of second matrix");
          for(i=1;i<=r2;i++)
		   {
		    for(j=1;j<=c2;j++)
			 {
			b[i][j]=Integer.parseInt(in.readLine());
             }
            }
           }
		catch(Exception E){}
		 d[i][j]=0;
		 System.out.println("The multiplication of two matrices = ");
		  for(i=1;i<=r;i++)
		   {
		    for(j=1;j<=c2;j++)
			 {
			  for(k=0;k<=r2;k++)
			   {
			    d[i][j]=d[i][j]+a[i][k]*b[k][j];
				}
			   }
			  }
				for(i=1;i<=r;i++)
		        {
		         for(j=1;j<=c2;j++)
			     {
				  System.out.print(+d[i][j]+"    ");
				}
			   System.out.println(   );
			  }
            }
		   }