//this is a program using functions to print the minimum and the maximum value seprately
public class Aaryan{
public static void main(String[]args){
int a=11,b=6,c=0;
c=minimum(a,b);
System.out.println("the minimum value of "+a+"	"+b+"="+c);
c=maximum(a,b);
System.out.println("the maximum value of "+a+"	"+b+"="+c);
}
public static int minimum(int x,int y){
int min;
	if(x>y)
		min=y;
	else
		min=x;
	return min;
}
public static int maximum(int x,int y){
int max;
	if(x>y)
		max=x;
	else
		max=y;
	return max;
}
}

F:\ct\!>java Aaryan
the minimum value of 11 6=6
the maximum value of 11 6=11
