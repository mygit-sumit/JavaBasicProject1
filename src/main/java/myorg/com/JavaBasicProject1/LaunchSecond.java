package myorg.com.JavaBasicProject1;
public class LaunchSecond 
{

	public static void main(String[] args) 
	{
		byte a=45; // --> 1
		
		int b; // 4   implicit type casting // numeric type promotion
		
		b=a;
		System.out.println(b);
		
		int n1=4; // 4 bytes
		
		double n2;  // 8 bytes
		n2=n1;
		System.out.println(n2);
		
		
		double num=45.5;
		
		int num2;
		
		num2=(int) num; // explicit type casting 
		System.out.println(num2);//possible loss of precision
		
		int number1=45;
		
		byte number2;
		
	   number2=(byte) number1;
	   System.out.println(number2);
		
		int $ageOfMyBrother=55;
		

	}

}
