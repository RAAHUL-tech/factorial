package factorial;

import java.util.Scanner;

public class factorial {

	static int n,n1;
	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		else
		{
			n1=n*fact(n-1);
			return n1;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:");
		int a=s.nextInt();
		fact(a);
		System.out.println("Factorial of "+a+" is "+n1);
	}

}
