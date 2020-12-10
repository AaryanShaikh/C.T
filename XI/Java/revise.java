import java.io.*;
public class revise
{
	public static void main(String[] args)
	{
		int x, y = 10, z = 5;
		System.out.println("y= "+y+" z= "+z);
		x = y + z;
		System.out.println("+ operator resulted in " + x);
		x = y - z;
		System.out.println("- operator resulted in " + x);
		x = y * z;
		System.out.println("* operator resulted in " + x);
		x = y / z;
		System.out.println("/ operator resulted in " + x);
		x = y % z;
		System.out.println("% operator resulted in " + x);
		x = y++;
		System.out.println("Postfix ++ operator resulted in " + x);
		x = ++z;
		System.out.println("Prefix ++ operator resulted in " + x);
		x = -y;
		System.out.println("Unary operator resulted in " + x);
	}
}
