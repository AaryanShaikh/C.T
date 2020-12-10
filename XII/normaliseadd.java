import java.io.*;
public class normaliseadd{
@Deprecated
public static void main(String args[]){
double m1=0.0f;
double m2=0.0f;
double m3=0.0f;
int i=0,e1=0,e2=0,e3=0,p1=0,p2=0;
DataInputStream in=new DataInputStream(System.in);
do{
 try{
  System.out.println("Enter the value of 1st mentisa");
  m1=Float.valueOf(in.readLine()).floatValue();
  }
  catch(Exception E){}
  }
  while(m1<0.1 || m1>0.9999);
do{
 try{
  System.out.println("Enter the value of 1st exponent");
  e1=Integer.parseInt(in.readLine());
  }
  catch(Exception E){}
  }
    while(e1<-99 || e1>99);
  
do{
 try{
  System.out.println("Enter the value of 2nd mentisa");
  m2=Float.valueOf(in.readLine()).floatValue();
  }
  catch(Exception E){}
  }
   while(m2<0.1 || m2>0.9999);
do{
 try{
  System.out.println("Enter the value of 2nd exponent");
  e2=Integer.parseInt(in.readLine());
  }
  catch(Exception E){}
  }
   while(e2<-99 || e2>99);
   if(e1>e2)
    {
	 e3=e1;
	 p1=e1-e2;
	   m3=m2/10;
	   }
	  if(e2>e1)
	   {
	    e3=e2;
		p2=e2-e1;
	      m3=m1/10;
	    }
		if(e1==e2)
		 {
		  e3=e1;
		  }
		  m3=m1+m2;
		  if(m3>0.9999)
		   {
		    m3=m3/10;
			e3=e3+1;
			}
			if(e3>99)
			 {
			  System.out.println("Overflows");
			  return;
			  }
			  System.out.println("The resultant of mentisa = "+m3);
			  System.out.println("The resultant of exponent = "+e3);
			 }
			}


