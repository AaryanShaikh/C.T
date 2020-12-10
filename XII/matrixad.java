import java.io.*;
public class matrixad{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,k=0,r=0,c=0,r2=0,c2=0;
int a[][]=new int[20][20];
int b[][]=new int[20][20];
int d[][]=new int[20][20];
 try{
  for(i=0;i<=10;i++)
  {
	  System.out.println("");
   System.out.println("Enter the no. of rows of first matrix");
    r=Integer.parseInt(in.readLine());
	
   System.out.println("Enter the no. of column of first matrix");
    c=Integer.parseInt(in.readLine());	
	
   System.out.println("Enter the no. of rows of second matrix");
    r2=Integer.parseInt(in.readLine());
	
   System.out.println("Enter the no. of column of second matrix");
    c2=Integer.parseInt(in.readLine());	
 	 
	if((r!=r2)||(c!=c2))
	 {
      System.out.println("Matrix cannot be added so please re-enter the elements");
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
		   for(k=1;k<=c;k++)
		    {
		     a[i][k]=Integer.parseInt(in.readLine());	  
	         }
          }
		  }
		catch(Exception E){}
		try{
        System.out.println("Enter the elements of second matrix");
         for(i=1;i<=r;i++)
		  {
		   for(k=1;k<=c;k++)
		    {
		     b[i][k]=Integer.parseInt(in.readLine());	  
	          }
            }			
    	 }
		 catch(Exception E){}
		 System.out.print("the sum matrices = ");
		 for(i=1;i<=r;i++)
		  {
		  System.out.println("  ");
		   for(k=1;k<=c;k++)
		    {
			 d[i][k]=a[i][k]+b[i][k];
			  System.out.print(+d[i][k]);
			  System.out.print("	");
			 }
			 System.out.println(  );
			 }
			}
		  }