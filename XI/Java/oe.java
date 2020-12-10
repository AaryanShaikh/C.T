/*To find odd ,even out of 10 integers*/
import java.io.*;
public class oe{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int n=0,i=0,even=0,odd=0; 
try
{
for(i=1;i<=10;i++)
{
System.out.println("type any 10 integer");
n=Integer.parseInt(in.readLine());
if (n%2!=0)
{
System.out.println("odd");
odd=odd+1;
}
else
{
System.out.println("even");
even=even+1;
}
}
}
catch(Exception E){}
System.out.print(+odd+"o");
System.out.print(+even+"e");
}
}
/*
E:\coos>java oe
type any 10 integer
45
odd
type any 10 integer
56
even
type any 10 integer
78
even
type any 10 integer
12
even
type any 10 integer
95
odd
type any 10 integer
45
odd
type any 10 integer
36
even
type any 10 integer
48
even
type any 10 integer
72
even
type any 10 integer
11
odd
4o6e
*/