/**array to multiply*/
import java.io.*;
public class arraymul{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
int i=0;
int a[]=new int[5];
int b[]=new int[5];
int c[]=new int[5];
System.out.println("type in 10 integers");
System.out.println("type any integer in first array");
for(i=0;i<=4;i++)
{
	try
	{
	 a[i]=Integer.parseInt(in.readLine());
	 }
	 catch(Exception E){}
}
System.out.println("type any integer in second array");
for(i=0;i<=4;i++)
{
	try
	{
	
	 b[i]=Integer.parseInt(in.readLine());
	 }
	 catch(Exception E){}
	 	 c[i]=a[i]*b[i];
}
System.out.println("the no you enter for the first array");
for(i=0;i<=4;i++)
{
	System.out.println(+a[i]);
	System.out.println("");
}
  System.out.println("the no you enter for the second array");
for(i=0;i<=4;i++)
{
	System.out.println(+b[i]);
	System.out.println("");
}
System.out.println("the answer is");
for(i=0;i<=4;i++)
{
	System.out.println(+c[i]);
	System.out.println("");
}
}
}

F:\ct\!>java arraymul
type in 10 integers
type any integer in first array
1
2
3
4
5
type any integer in second array
1
2
3
4
5
the no you enter for the first array
1

2

3

4

5

the no you enter for the second array
1

2

3

4

5

the answer is
1

4

9

16

25