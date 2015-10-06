package Test2;

import java.util.Scanner;

public class TestSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter number of SquareRoot : ");
			number = scanner.nextInt();
			
			SquareRoot root = new SquareRoot(number);
			root.sqrt();
			
			System.out.println("Result: "+root.getAns());
			
			System.out.println();
			Scanner scan = new Scanner(System.in);
			System.out.print("Do it again (Yes/No) : ");
			String choice = scan.nextLine();
			
			if(choice.equals("No")||choice.equals("no")||choice.equals("n")||choice.equals("N")){
				break;
			}
			
			System.out.println("===========================================");
		}
		
	}

}
