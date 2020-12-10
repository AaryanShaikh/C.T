//Aaryan
//Lagranges interpolation formula
import java.io.*;
public class lagranges{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,j=0,n=0;
int x[]=new int[10];
int y[]=new int[10];
double prod=1.0f,sum=0.0f,x1=0.0f;
try
{
System.out.println("Enter the value of x at which f(x) is to be calculated");
x1=Float.valueOf(in.readLine()).floatValue();
}
catch(Exception E){}
try
{
System.out.println("Enter the number of terms");
n=Integer.parseInt(in.readLine());
}
catch(Exception E){}
try
{
System.out.println("Enter the values of x terms");
for(i=1;i<=n;i++)
{
x[i]=Integer.parseInt(in.readLine());
}
System.out.println("Enter the values of y terms");
for(i=1;i<=n;i++)
{
y[i]=Integer.parseInt(in.readLine());
}
}
catch(Exception E){}
for(i=1;i<=n;i++)
{
prod=1.0f;
for(j=1;j<=n;j++)
{
if(i!=j)
{
prod=prod*(x1-x[j])/(x[i]-x[j]);
}
}
prod=prod*y[i];
sum=sum+prod;
}
System.out.println("The value of y at a given point x="+sum);
}
}

/**E:\D3MON\xii\COOS\maths>java lagranges
Enter the value of x at which f(x) is to be calculated
2.5
Enter the number of terms
5
Enter the values of x terms
0
1
2
3
4
Enter the values of y terms
3
2
7
24
59
The value of y at a given point x=13.625
*/