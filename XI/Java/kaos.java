import java.io.*;
public class kaos{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int a=0,b=0,c=0;
try
 {
	System.out.println("enter your first number");
	a=Integer.parseInt(in.readLine());
	System.out.println("enter your second number");
	b=Integer.parseInt(in.readLine());
}
catch(Exception E){}

System.out.println("type 1 if you want to add");
System.out.println("");
System.out.println("type 2 if you want to add");
System.out.println("");
System.out.println("type 3 if you want to add");
System.out.println("");
System.out.println("type 4 if you want to add");
try
{
c=Integer.parseInt(in.readLine());
}
catch(Exception E){}

switch(n)
      {
	   case 1:
	          System.out.println("Monday");
	   case 2:
	          System.out.println("Tuesday");
	   case 3:
			  System.out.println("Wednesday");
	   case 4:
			  System.out.println("Thursday");
	   case 5:
			  System.out.println("Friday");
	   case 6:
			  System.out.println("Saturday");
	   case 7:
			  System.out.println("Sunday");
	   default:
			  System.out.println("no day");
			}