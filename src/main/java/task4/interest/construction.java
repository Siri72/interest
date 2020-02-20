package task4.interest;

import java.util.*;

public class construction {


	public static void main(String [] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total Area");
	double area=sc.nextDouble();
	System.out.println("Enter type of standard \n 1.standard material \n2.high material \n3.material n4.fully automated");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		standard_material SM=new standard_material(area);
		System.out.println("Simple Interest :"+SM.calculate());
		break;
	case 2:
		high_material HM=new high_material(area);
		System.out.println("Total Cost :"+HM.calculate());
		break;
	case 3:
		material M=new material(area);
		System.out.println("Total Cost :"+M.calculate());
		break;
	case 4:
		fully_automated HASM=new fully_automated(area);
		System.out.println("Total Cost :"+HASM.calculate());
		break;
	default:
		System.out.println("Invalid choice");
		break;
	}
	
	}



}
