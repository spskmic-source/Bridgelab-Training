import java.util.Scanner;
class Cylinder{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter height:");
	int height=sc.nextInt();
	System.out.print("enter radius:");
	int radius=sc.nextInt();
	int Volume=22/7*radius*radius*height;
	System.out.println("Volume is:"+Volume);
	
	}
}