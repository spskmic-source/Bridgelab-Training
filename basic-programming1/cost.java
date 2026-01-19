import java.util.Scanner;
class cost{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter cost : ");
	int cost = sc.nextInt();
	System.out.println("enter selling_prize : ");
	int selling_prize = sc.nextInt();
	System.out.println("profit is :");
	System.out.println(" selling_prize-cost : ");
	System.out.println("profit percentage:");
	System.out.println(( selling_prize-cost)/ cost*100);
	
	}
}