import java.util.Scanner;
class Converter{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter km : ");
double miles;
double km = sc.nextInt();
System.out.print("in miles:-");
miles= km*1.6;
System.out.println(miles);
}
}