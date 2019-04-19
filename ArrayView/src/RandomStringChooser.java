

public class RandomStringChooser {
	private static String[] wordArray = {"wheels","on","the","bus"};

	public RandomStringChooser(String[] wordArray) {
		// TODO Auto-generated constructor stub
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int k = 0; k < 6; k++) {
			System.out.print(sChooser.getNext() + " ");
		}
	}

	private String getNext() {
		System.out.println(wordArray);
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
