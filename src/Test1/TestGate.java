package Test1;

import java.util.Scanner;

public class TestGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
				
		while(true){
			System.out.print("Choice Gate Half Adder(HA) or Full Adder(FA) : ");
			String gate = scanner.nextLine();
			
			if (gate.equals("HA")||gate.equals("ha")||gate.equals("Ha")){
				int a,b;
				while(true){
					System.out.print("Enter number a (1 or 0) : ");
					 a = scanner.nextInt();
					
					if(a==1||a==0){
						break;
					}
				}
				
				while(true){
					System.out.print("Enter number b (1 or 0) : ");
					 b = scanner.nextInt();
					
					if(b==1||b==0){
						break;
					}
				}
				
				
				System.out.println();
				HalfAdder gateHd = new HalfAdder(a,b);
				gateHd.GateHa();
				System.out.println("S : "+gateHd.getS());
				System.out.println("C : "+gateHd.getC());
				
				break;
			}
			else if(gate.equals("FA")||gate.equals("fa")||gate.equals("Fa")){
				int Cin,B,A;
				while(true){
					System.out.print("Enter number Cin (1 or 0) : ");
					Cin = scanner.nextInt();
					
					if(Cin==1||Cin==0){
						break;
					}
				}
				
				while(true){
					System.out.print("Enter number B (1 or 0) : ");
					B = scanner.nextInt();
					
					if(B==1||B==0){
						break;
					}
				}
				
				while(true){
					System.out.print("Enter number A (1 or 0) : ");
					 A = scanner.nextInt();
					 
					 if(A==1||A==0){
							break;
						}
				}
				
				
				
				
				FullAdder full = new FullAdder(Cin,B,A);
				full.gateFull();
				
				System.out.println();
				System.out.println("cOut : "+full.getCOut());
				System.out.println("S : "+full.getS());
				
				break;
			}
			else{
				System.out.println("****Please Enter HA or FA******");
			}
			
			/*System.out.print("Do it again (Yes/No) : ");
			String again = scanner.nextLine();
			if(again.equals("No")||again.equals("no")||again.equals("n")||again.equals("N")){
				break;
			}
			*/
			System.out.println("==========================================");
		}
				
		
	}

}

