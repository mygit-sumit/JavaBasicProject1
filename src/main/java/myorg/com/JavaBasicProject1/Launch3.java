package myorg.com.JavaBasicProject1;
public class Launch3 
{

	public static void main(String[] args) 
	{
//		int num=5;  
//		//num=num + 1;
//		--num;
//		System.out.println(num);
		
		int a=5;
		
		int b;
		
//		b= a++;
		
		//b= ++a + ++a + a++ + a++ + ++a ;
		
		//b = a++ + a++ + --a + --a + a-- + a++;
		
		//b = a++ + --a + --a + a++ + a++ + a++ - a--; 
		
		b = a++ + a-- + --a + --a + a++ + a++ - a++;
		
		System.out.println("a --> "+a);//6
		System.out.println("b --> "+b);// 20, 16, 23, 
		
		
		
		
		
		
		
		
		
		

	}

}
