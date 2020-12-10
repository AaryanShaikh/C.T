import java.io.*;
public class Mathsmad{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream (System.in);
int a=0,b=0,c=0,d=0;
System.out.println("Enter 2 integers");
try
{
	a=Integer.parseInt(in.readLine());
	b=Integer.parseInt(in.readLine());
 }
 catch (Exception E) {}
 System.out.println("Select an operator");
 System.out.println("Type 1 for addition");
 System.out.println("Type 2 for subtraction");
 System.out.println("Type 3 for multiplication");
 System.out.println("Type 4 for division");
 
 try
{
	d=Integer.parseInt(in.readLine());
}
 catch (Exception E) {}
 
 switch(d)
{
case 1:
	{
	c=adder(a,b);
		System.out.println("Your answer is="+c);
	break;
	}
	
case 2:
	{
	c=suber(a,b);
		System.out.println("Your answer is="+c);
	break;
	} 
 
case 3:
	{
	c=muler(a,b);
		System.out.println("Your answer is="+c);
	break;
	} 
 
case 4:
	{
	c=diver(a,b);
		System.out.println("Your answer is="+c);
	break;
	} 
default:
	{
	System.out.println("The following operator does not exist!");
	break;
	}   
 
} 
}
 public static int adder(int n1,int n2){
int add;
add=n1+n2;
return add;
}
public static int suber(int n1,int n2){
int sub;
sub=n1+n2;
return sub;
}
public static int muler(int n1,int n2){
int mul;
mul=n1+n2;
return mul;
}
public static int diver(int n1,int n2){
int div;
div=n1+n2;
return div;
}
 }