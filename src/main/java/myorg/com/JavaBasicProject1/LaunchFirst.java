package myorg.com.JavaBasicProject1;
public class LaunchFirst 
{

	public static void main(String[] args) 
	{
		//1 byte
         byte num=45;   //byte --> -128 to 127
         
         //System.out.println(num);
         
         // 2 bytes
         short num2=4545; //short --> -32768 to 32767
        // System.out.println(num2);
         
         //4 bytes
         int num3= 454545; //int --> -2147483648 to 2147483647
         
         
         //8 bytes
         long num4= 365353543l; //
         
         
         byte a=4;
         byte b=8;
         
         byte c=12;
        // error  byte result=a + b; // 4+ 8 ==> 12
         
         int result = a+b;
         
         //System.out.println(result);
         
         
         int age=16;
         
         float n=2.4f;
         
         System.out.println(n);
         
         int n1=12;
         int n2=5;
         
//         float res=n1/n2;  //12/5 --> 2.4
         int res=n1/n2; 
         System.out.println(res);
       //Rounding to zero or truncation
         
         
         char alien='a';  //--> 2 bytes 
         System.out.println(alien);
         
         
         
         
         
	}

}
