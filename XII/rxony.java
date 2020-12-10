import java.io.*;
public class rxony{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,n=0;
double sumx=0.0f,sumy=0.0f,sumy2=0.0f,sumxy=0.0f,num=0.0f,den=0.0f,r=0.0f,xb=0.0f,yb=0.0f;
int x[]=new int[100];
int y[]=new int[100];
int y2[]=new int[100];
int xy[]=new int[100];
try
	{
		System.out.println("Enter the no of terms");
		n=Integer.parseInt(in.readLine());
		System.out.println("Enter the value of 'x' terms");
		for(i=1;i<=n;i++)
		{
			x[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("Enter the values of 'y' terms");
		for(i=1;i<=n;i++)
		{
			y[i]=Integer.parseInt(in.readLine());
		}
		}
		catch(Exception E){}
		for(i=1;i<=n;i++)
		{
			xy[i]=x[i]*y[i];
			sumxy=sumxy+xy[i];
			y2[i]=y[i]*y[i];
			sumy2=sumy2+y2[i];
			sumx=sumx+x[i];
			sumy=sumy+y[i];
		}
			num=(n*sumxy)-(sumx*sumy);
			den=(n*sumy2)-(sumy*sumy);
			r=num/den;
			xb=sumx/n;
			yb=sumy/n;;
		System.out.println("(x-"+xb+")="+r+"(y-"+yb+")");
	}
}


/**F:\Shaun\>java rxony
Enter the no of terms
3
Enter the value of 'x' terms
1
3
4
Enter the values of 'y' terms
2
4
6
(x-2.6666666666666665)=0.75(y-4.0)*/
