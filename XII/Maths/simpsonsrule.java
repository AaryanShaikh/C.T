import java.io.*;
public class simpsonsrule{
public static void main(String[]args){
@Deprecated
DataInputStream in=new DataInputStream(System.in);
	double x[]=new double [50];
	double y[]=new double [50];
	int n=0,i=0;
	double xo=0,xn=0,h=0.0f;
	double yo=0.0f;
	double yn=0.0f;
	double fx=0.0f;
	double sumfx1=0.0f;
	double sumfx2=0.0f;	
	try
	{
		System.out.println("Enter the no of interval");
		n=Integer.parseInt(in.readLine());
		System.out.println("Enter the first value");
		xo=Integer.parseInt(in.readLine());
		System.out.println("Enter the last value");
		xn=Integer.parseInt(in.readLine());
	}
	catch(Exception E){}
	yo=f(xo);
	yn=f(xn);
	h=(xn-xo)/n;
	System.out.println("h="+h);
	for(i=1;i<=n-1;i++)
	{
		x[i]=xo+i;
		y[i]=f(x[i]);
	}
	System.out.println("the value of x and y are");
	System.out.println("x    y");
	System.out.println(xo+"    "+yo);
	for(i=1;i<=n-1;i++)
	{
		System.out.println(x[i]+"    "+y[i]); 
	}
	System.out.println(xn+"    "+yn);
	for(i=1;i<n;i=i+2)
	{
		sumfx1=sumfx1+y[i];
	}
	sumfx1=sumfx1*4;
	for(i=2;i<=n-2;i=i+2)
	{
		sumfx2=sumfx2+y[i];
	}
	sumfx2=sumfx2*2;
	fx=(yo+yn+sumfx1+sumfx2)*h/3;
	System.out.println("the integral value of the given function is="+fx);
}
public static double f(double x1){
	double x2=0;
	x2=x1*x1+2;
	return x2;
}
}
