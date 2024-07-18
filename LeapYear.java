package anudip;
import java.util.*; 
public class LeapYear {

	public static void main(String[] args) {
		
		  int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	   /*   if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");*/
if(year%4==0) {
	if((year%100!=0)&&(year%400==0)) {
		System.out.println(year+"is a leap");}
		else
		{
			System.out.println(year+"is not a leap year");
		}
	} 
	else {System.out.println("is not aleap year");
	}}

}