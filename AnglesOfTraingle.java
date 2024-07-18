package anudip;
import java.util.*;
public class AnglesOfTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enetr the first agle of traingle");
int a=sc.nextInt();
System.out.println("enetr the 2nd agle of traingle");
int b=sc.nextInt();
System.out.println("enetr the 3rd agle of traingle");
int c=sc.nextInt();
int total=(a+b+c);
if(total==180)
{
	System.out.println("yes these are andles of traingle");
}
else
{
	System.out.println("total is not 180 then these are not angles of traingle");
}
	}

}
