import java.util.Scanner;
class Total_prize{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter unitprize");
		int unitprize=sc.nextInt();
		System.out.print("enter quantity");
		int quantity=sc.nextInt();
		int total_prize=unitprize*quantity;
		System.out.print("the total_prize is INR: "+total_prize+"if the quantity: "+quantity+"and unit price is: "+unit prize);
		
		
	}
}