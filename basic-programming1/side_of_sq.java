import java.util.Scanner;
class Side_of_sq{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter perameter:");
		double perameter=sc.nextDouble();
		double side=perameter/4;
		System.out.println("the length of the side is "+side+"whose perameter is "+ perameter);
		
	}
}