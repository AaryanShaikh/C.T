import java.io.*;
public class trapezoidalrule{
public static void main(String[]args){
@Deprecated 
DataInputStream in=new DataInputStream(System.in);
double x[]=new double[50];
double y[]=new double[50];
int n=0,xo=0;
double xn=0.0f;
double h=0.0f;
double yo=0.0f;
double yn=0.0f;
double p=0.0f;
double sumfx=0.0f;
int i=0;
double sumy=0.0f;
try
{
 System.out.println("Enter the number of interval");
 n=Integer.parseInt(in.readLine());
 System.out.println("Enter the first values");
 xo=Integer.parseInt(in.readLine());
 System.out.println("Enter the last value");
 xn=Integer.parseInt(in.readLine());
 }
 catch(Exception e){}
 yo=f(xo);
 yn=f(xn);
 h=(xn-xo)/n;
 for(i=1;i<=n;i++)
  {
  x[i]=xo+i;
  y[i]=f(x[i]);
  }
System.out.println("The value of x and y are");
 System.out.println("x  y");
  System.out.println(xo+"  "+yo);
   for(i=1;i<=n-1;i++)
   {
     System.out.println(x[i]+"  "+y[i]);
   }
	   System.out.println(xn+"  "+yn);
	   sumfx=sumfx+yo+yn;
	    for(i=1;i<=n-1;i++)
		{
		sumy=sumy+y[i];
		}
		p=(sumfx+2*sumy)*h/2;
		  System.out.println("The integral value of the given funtion is="+p);
		  }
		  public static double f(double x1)
		  {
		  double x11;
		  x11=2*x1+5;
		  return x11;
		  }
		 } 
		 
