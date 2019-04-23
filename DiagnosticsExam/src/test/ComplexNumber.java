package test;

class ComplexNumber {
	private int a;
	private int b;
	
	
	public ComplexNumber(int aIn, int bIn) {
		a = aIn;
		b = bIn;

	}
	
	//add
	public ComplexNumber addition(ComplexNumber cNum) {
		System.out.println("(" + a + "+" + b + "i"+ ")" + "+" + "(" + cNum.getA() + "+" + cNum.getB() + "i" + ")");
		int newA = a + cNum.getA();
		int newB = b + cNum.getB();
		ComplexNumber ans = new ComplexNumber (newA, newB );
		System.out.println(newA + "+" + (newB + "i"));
		return ans ;
		
	}
	//add
	public ComplexNumber multiply(ComplexNumber cNum) {
		System.out.println("(" + a + "+" + b + "i"+ ")" + "*" + "(" + cNum.getA() + "+" + cNum.getB() + "i" + ")");
		int newA = a * cNum.getA() + (-1) * b * cNum.getB();
		int newB = a * cNum.getB() + b * cNum.getA();
		ComplexNumber ans = new ComplexNumber (newA, newB );
		System.out.println(newA + "+" + (newB + "i"));
		return ans ;
	}
	//add

	//add
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	

	
	

}
