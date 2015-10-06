package Test1;

public class FullAdder{

	private int a,b,cIn,s,cOut;
	public FullAdder(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.cIn = c;
	}
	
	public void gateFull(){
		int temp1,temp2;
		
		HalfAdder hd1 = new HalfAdder(cIn,b);
		hd1.GateHa();
		temp1 = hd1.getS();
		
		////////////////////////////////////////////////////
		temp2 = hd1.getC();
		
		HalfAdder hd2 = new HalfAdder(temp2,a);
		hd2.GateHa();
		temp2 = hd2.getS();
		
		this.s = hd2.getC();
		///////////////////////////////////////////////////
		if(temp1==1||temp2==1){
			this.cOut = 1;
		}
		else{
			this.cOut = 0;
		}
		
	}
	
	public int getCOut(){
		return cOut;
	}
	public int getS(){
		return s;
	}
	
}

