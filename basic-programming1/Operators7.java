import java.util.Scanner;
class Operators7{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Enter c:");
		c=sc.nextInt();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println("the result of intn operations are"+a +b +c);
	}
}