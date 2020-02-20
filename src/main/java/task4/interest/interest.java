package task4.interest;
import java.util.*;
public class interest {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount");
	double amount=sc.nextDouble();
	System.out.println("Enter the number of years");
	double numofyears=sc.nextDouble();
	System.out.println("Enter the Rate of interest");
	double rate=sc.nextDouble();
	System.out.println("Enter the type of interest to calculate\n1.Simple Interest\n2.Compound Interest");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		simple_interest SI=new simple_interest(amount,numofyears,rate);
		System.out.println("Simple interest :"+SI.calculate());
		break;
	case 2:
		compound_interest CI=new compound_interest(amount,numofyears,rate);
		System.out.println("Compound Interest :"+CI.cal_compound_interest());
		break;
	default:
		System.out.println("Invalid choice");
		break;
	}
}
}
