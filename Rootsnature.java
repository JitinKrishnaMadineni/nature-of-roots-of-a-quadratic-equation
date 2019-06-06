import java.util.*;
class Rootsnature
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double a,b,c,d,r1,r2;
		System.out.println("enter a,b,c values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=(b*b-4*a*c);
		if(d>0)
		{
		r1=(-b+Math.pow(d,0.5))/(2*a);
		r2=(-b-Math.pow(d,0.5))/(2*a);
		System.out.println("roots are real and different");
		System.out.println("roots are" + r1 + " , " + r2);
		}
		else if(d==0)
		{
		System.out.println("\n roots are real and same");
		r1=(-b)/(2*a);
		System.out.println("roots are"+r1+","+r1);
		}
		else
		{
		double realpart=((-b)/(2*a));
		double imaginarypart= Math.pow(d,0.5);
		System.out.println("\n roots are complex and different");
		System.out.println("roots are   "+realpart+"+"+imaginarypart+"i,"+realpart+"-"+imaginarypart+"i");
		}
	}
     
}