package Test1;

public class HalfAdder {
	private int a,b,s,c;
	 
	public HalfAdder(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public int getS(){
		return s;
	}
	
	public int getC(){
		return c;
	}
	
	public void GateHa(){
		int temp1,temp2;
		if (a==1||b==1){
			temp1 = 1;
		}
		else{
			temp1=0;
		}
		/////////////////////////////////////////////
		if (a==1&&b==1){
			temp2=1;
		}
		else{
			temp2=0;
		}
		
		this.c = temp2;
		/////////////////////////////////////////////
		if (temp2 == 1){
			temp2 = 0;
		}else{
			temp2=1;
		}
		//////////////////////////////////////////////
		if(temp1==1&&temp2==1){
			this.s = 1;
		}else{
			this.s=0;
		}
		////////////////////////////////////////////////
		
	}
}
