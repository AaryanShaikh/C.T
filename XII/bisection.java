import java.lang.*;
import java.io.*;
class bisection{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
double xo=0.0f;
double x1=0.0f;
double x2=0.0f;
double yo=0.0f;
double y1=0.0f;
double y2=0.0f;
do
{
try{
	System.out.println("Enter the value of xo");
	xo=Integer.parseInt(in.readLine());
	System.out.println("Enter the value of x1");
	x1=Integer.parseInt(in.readLine());
}
catch(Exception e){}
yo=f(xo);
y1=f(x1);
}while((y1*yo)>0);
do
{
	x2=((xo*y1)-(x1*yo))/(y1-yo);
	y2=f(x2);
	if((yo*y2)>0)
	{
		xo=x2;
		yo=f(x2);
	}
	else
	{
		x1=x2;
		y1=f(x2);
	}
}
while((f(x2)>0)||Math.abs((x1-xo)/x1)<=0.001);
	System.out.println("The root of the given eqn = "+x2);
	}
public static double f(double x2)
{
	double x11=0;
	x11=(x2*x2)-25;
	return x11;
}
}

