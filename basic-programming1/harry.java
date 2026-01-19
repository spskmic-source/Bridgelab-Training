import java.util.Scanner;
class harry{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age :- ");
		int birth_year = sc.nextInt();
		System.out.print("your age: ");
		System.out.print(2026 - birth_year);
	}
}