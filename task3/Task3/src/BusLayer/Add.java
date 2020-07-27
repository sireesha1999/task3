package BusLayer;
import DLayer.Data;
public class Add {
		Data aa=new Data();
	public int add(int a,int b) {
		int c=a+b;
		
		aa.dat(a, b, c, "addition");
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		aa.dat(a, b, c, "subtraction");
		return c;
	}
	public int mul(int a,int b) {
		int c=a*b;
		aa.dat(a, b, c, "multiply");
		return c;
	}
	public int div(int a,int b) {
		int c=a/b;
		aa.dat(a, b, c, "div");
		return c;
	}
	}