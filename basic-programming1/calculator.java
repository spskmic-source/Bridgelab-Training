import java.util.Scanner;
class calculator{
	public static void main(String arags[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		float b=sc.nextFloat();
		System.out.println("Enter number2:");
		float a=sc.nextFloat();
		System.out.println("The addition,substrataion,multiplication,and division value of 2 numbers a and b is "+(a+b)+(a-b)+(a*b)+(a/b));
		
	}
}