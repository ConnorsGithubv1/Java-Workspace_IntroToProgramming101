import java.util.ArrayList;

public class CoinCollectionTools {
	private Coin[][] coinBox;
	
public CoinCollectionTools(String country, int rows, int columns) {
	coinBox = new Coin[rows][columns];
	coinBox[0][0] coin= {{"country", "0", "0"}};	
	String c = country;
	int row = rows;
	int col = columns;
	System.out.println();
	
}

public Coin[][] fillCoinBox(ArrayList<Coin> myCoins){
	ArrayList<Coin> coin = myCoins;
	System.out.println(coin);
	
	return coinBox;
	
}

public ArrayList<Coin> fillCoinTypeList(){
	return null;
	
}


}
