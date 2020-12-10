import java.io.*;
public class ryonx{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,n=0;
double sumx=0.0f,sumy=0.0f,sumx2=0.0f,sumxy=0.0f,num=0.0f,den=0.0f,r=0.0f,xb=0.0f,yb=0.0f;
int x[]=new int[100];
int y[]=new int[100];
int x2[]=new int[100];
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
			x2[i]=x[i]*x[i];
			sumx2=sumx2+x2[i];
			sumx=sumx+x[i];
			sumy=sumy+y[i];
		}
			num=(n*sumxy)-(sumx*sumy);
			den=(n*sumx2)-(sumx*sumx);
			r=num/den;
			xb=sumx/n;
			yb=sumy/n;;
		System.out.println("(y-"+yb+")="+r+"(x-"+xb+")");
	}
}


/**E:\D3MON\xii\maths>java ryonx
Enter the no of terms
3
Enter the value of 'x' terms
2
8
9
Enter the values of 'y' terms
3
2
1
(y-2.0)=-0.2441860465116279(x-6.333333333333333)*/