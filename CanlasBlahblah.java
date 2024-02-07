import java.util.Scanner;

public class CanlasBlahblah{
	public static void main(String[] args){

	int Ssj;

	Scanner sc=new Scanner(System.in);

	System.out.println("--------------------");
	System.out.println("EMPLOYEE INFORMATION");
	System.out.println("--------------------");

	System.out.println("Input Your Name: ");
	String name = sc.nextLine();

	System.out.println("Input the Month: ");
	String date = sc.nextLine();
	
	System.out.println("Input ID Number: ");
	int IdNum = sc.nextInt();

	System.out.println("Input Your Basic Salary: ");
	int basicsalary = sc.nextInt();

	final int sss=894, pagIbig=200,philHealth=583;
	double tax = 0.10;
	double lessTax =(double)basicsalary*tax;
	double totalDeduction = sss+pagIbig+philHealth+(double)lessTax;
	double netPay = basicsalary-totalDeduction;

	System.out.println("--------------------");
	System.out.println("ID Number: "+ IdNum);
	System.out.println("For The Month of: "+date + "2023");
	System.out.println("Basic Salary: "+basicsalary);
	System.out.println("Total Deduction: "+totalDeduction);
	System.out.println("Total Net pay: "+netPay);
	}
}



