/*Aaryan Shaikh*/
import java.lang.*;
import java.io.*;
public class cor{
@Deprecated
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in);
int i=0,n=0;
double r=0.0f,den=0.0f,num=0.0f,den1=0.0f,den2=0.0f,sumx=0.0f,sumy=0.0f,sumx2=0.0f,sumy2=0.0f,sumxy=0.0f;
int x[]=new int[10];
int y[]=new int[10];
int xy[]=new int[10];
int x2[]=new int[10];
int y2[]=new int[10];
try
 {
	System.out.println("Enter the number of terms");
	n=Integer.parseInt(in.readLine());
	System.out.println("Enter the value of x terms");
	for(i=1;i<=n;i++)
	{
		x[i]=Integer.parseInt(in.readLine());
	}
	System.out.println("Enter the value of y terms");
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
		y2[i]=y[i]*y[i];
		sumy2=sumy2+y2[i];
		sumx=sumx+x[i];
		sumy=sumy+y[i];
	}
	
		num=(n*sumxy)-(sumx*sumy);
		den=(n*sumx2)-(sumx*sumx);
		den1=(n*sumy2)-(sumy*sumy);
		den2=Math.sqrt(den*den1);
		r=num/den2;
		System.out.println("the coefficient of corelation="+r);
	}
}

/**E:\D3MON\xii\maths>java cor
Enter the number of terms
5
Enter the value of x terms
8
5
3
4
7
Enter the value of y terms
2
1
5
3
6
the coefficient of corelation=-0.10465116279069768*/

