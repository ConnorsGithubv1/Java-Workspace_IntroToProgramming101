package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber cNum = new ComplexNumber(10, -3);
		ComplexNumber cNum2 = new ComplexNumber(-4, 2);
		System.out.println("add:");
		cNum.addition(cNum2);
		ComplexNumber cNum3 = new ComplexNumber(3, 6);
		ComplexNumber cNum4 = new ComplexNumber(-4, 2);
		System.out.println("multiply:");
		cNum3.multiply(cNum4);
		
	}

}
