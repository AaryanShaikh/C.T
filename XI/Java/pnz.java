import java.io.*;
public class pnz
{
	@Deprecated
	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int n1=0,n2=0,ne=0,po=0,ze=0,b=0;
		try
		{
			System.out.println("please input the  number of integers in the list");
			n1=Integer.parseInt(in.readLine());
			for(b=1;b<=n1;b++)
			{
				System.out.println("please input the integer of your choice");
				n2=Integer.parseInt(in.readLine());
				if(n2<0)
				{
					ne=ne+1;
					System.out.println("The no."+n2+" is a negative no.");
				}
				else
				{
					if(n2<0)
					{
						ne=ne+1;
						System.out.println("The no."+n2+" is a negative no.");
					}
					else
					{
						if(n2>0)
						{
							po=po+1;
							System.out.println("The no."+n2+" is a positive no.");
						}
						else
						{
							ze=ze+1;
							System.out.println("The no."+n2+"is a zero");
						}
					}
				}
			}
		}
		catch(Exception E){}
	    System.out.println("Total positive numbers="+po);
		System.out.println("Total negative numbers="+ne);
		System.out.println("Total no. of zeros="+ze);
	}
}

F:\ct\Java>java pnz
please input the  number of integers in the list
5
please input the integer of your choice
1
The no.1 is a positive no.
please input the integer of your choice
2
The no.2 is a positive no.
please input the integer of your choice
-2
The no.-2 is a negative no.
please input the integer of your choice
0
The no.0is a zero
please input the integer of your choice
2
The no.2 is a positive no.
Total positive numbers=3
Total negative numbers=1
Total no. of zeros=1