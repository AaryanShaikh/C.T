import java.io.*;
class regularfalsi{
@ Deprecated
public static void main (String args [])
{
   double x0=0.0f;
   double x1=0.0f;
   double x2=0.0f;
   double y0=0.0f;
   double y1=0.0f;
   double y2=0.0f; 
   DataInputStream in = new DataInputStream (System.in);
do
  {
   try
     {
	  System.out.println("Enter the value of x0");
	  x0=Float.valueOf(in.readLine()).floatValue();
	  System.out.println("Enter the value of x1");
	  x1=Float.valueOf(in.readLine()).floatValue();
	  }
	catch (Exception e){}
	y0=f(x0);
	System.out.println(+y0);
	y1=f(x1);
	System.out.println(+y1);
	}
    while (y0*y1>0);
	int i=1;
	System.out.print("         ");
	System.out.println("          ");
	do
	{
	 x2=((x0*y1)-(x1*y0))/(y1-y0);
	 y2=f(x2);

     if(y0*y2>0)
     {
      x0=x2;
      y0=y2;
     }
     else
     {
      x1=x2;
      y1=y2;
     }
      i=i+1;
     }
      while ((y2!=0)|| Math.abs((x1-x0)/x1)<=0.001);
      System.out.println("The root of the given eqn = "+x2);
	 }
	  public static double f(double x)
	  {
	   double x11=0;
	   x11= (x*x)-25;
	   return x11;
	   }
	  }
