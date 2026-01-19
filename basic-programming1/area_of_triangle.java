import java.util.Scanner;
class area_of_triangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height:");
		float height=sc.nextFloat();
		System.out.println("Enter base:");
		float base=sc.nextFloat();
		float inch=2.54f;
		float ART = 0.5f*base*height;
		System.out.println(ART);
		
	}
}