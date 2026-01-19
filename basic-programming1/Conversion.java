import java.util.Scanner;
class Conversion{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter temp:");
	int temp=sc.nextInt();
	double Fahrenheit = ((temp * 9.0/5) + 32);
	System.out.print("temp in Fahrenheit is : "+ Fahrenheit);
	}
}