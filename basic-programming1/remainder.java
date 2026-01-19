import java.util.Scanner;
class remainder{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number1:");
		int number1=sc.nextInt();
		System.out.println("enter number2:");
		int number2=sc.nextInt();
		int quotient=number1/number2;
		float remainder=number1%number2;
		System.out.println("the quotient is"+quotient+"and reminder is "+remainder);
	}
}