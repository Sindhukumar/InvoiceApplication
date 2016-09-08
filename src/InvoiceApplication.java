import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceApplication {

	public static void main(String[] args) {
		// declare the array of a set size
		double taxRate, sTotal=0, myPrices[] = new double[100];
		// add prices to array.
		// Use a counter to keep track of how many items are in your array.
		int counter = 0;
		// print the array
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Tax Rate ? :");
		taxRate = sc.nextDouble();
		while(true){
			System.out.println("Price #"+(counter+1)+" : ");
			myPrices[counter] = sc.nextDouble();
			if(myPrices[counter]==0.0)
				break;
			sTotal+=myPrices[counter];
			counter++;
			
		}
		System.out.println("----------------------------");
		System.out.println("Receipt");
		for (int i = 0; i < counter; i++) {
			System.out.printf("%.02f\n", myPrices[i]);
		}
		System.out.println("\n"+sTotal+"   subtotal");
		System.out.println(sTotal*taxRate+"    tax");
		System.out.println(sTotal*(1+taxRate) + "   grand Total");
		}
		catch (InputMismatchException e) {
			System.out.println("Enter a valid tax rate or price. Eg: 2.3 ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
