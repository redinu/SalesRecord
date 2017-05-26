import java.util.Scanner;

public class SalesRecord {
	
	
	
	

	public static void main(String[] args) {
		int customerId;
		String name;
		double salesAmount;
		String taxCode;
		double salesTax;
		double totalAmount;
		String recordExist = "Y";
		
		System.out.println("Please enter the sales record");
	    Scanner keyboard = new Scanner(System.in);
		
		while(recordExist.equalsIgnoreCase("y")){
		System.out.println("Please enter your customer ID");	
		customerId = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Please enter your name");
		name = keyboard.nextLine();
		System.out.println("Please enter the sales amount");
		salesAmount = keyboard.nextDouble();
		System.out.println("Please enter the tax code");
		taxCode = keyboard.next();
		
		if (taxCode.equalsIgnoreCase("NRM")){
			
		  salesTax = salesAmount * 0.06;
		  totalAmount = salesAmount + salesTax;
			  
		} else if (taxCode.equalsIgnoreCase("NPF")){
			
			    salesTax = 0;
			    totalAmount = salesAmount;

		}else{
			   salesTax = salesAmount * 0.045;
			   totalAmount = salesAmount + salesTax;
		}
		
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + name);
		System.out.println("Sales Amount: " + salesAmount);
		System.out.println("Tax code: " + taxCode);
		System.out.println("Total Amount Due: " + totalAmount);
		System.out.println("Do you want to enter another record? (Y/N)");
		recordExist = keyboard.next();
	}
	}

}
