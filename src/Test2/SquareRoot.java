package Test2;

public class SquareRoot {
	
	public double ans,input;
	public SquareRoot(int input){
		this.input = input;
	}
	
	public double getAns(){
		return ans;
	}
	
	public void sqrt(){
		double mean,qua,est=1;
		
		while(true){
			
			qua = input/est;
			mean = (est+qua)/2;			
			est = mean;
			//System.out.println(est);
			this.ans = mean;
			
			if(Math.abs((ans*ans-input)/input) < 0.001){
				break;
			}
		}
		
		
	}
	

}
