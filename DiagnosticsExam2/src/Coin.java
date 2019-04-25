
public class Coin {
	String country;
	int year;
	int coinType;
	
	public Coin(String cCountry, int cYear, int cType) {
		country = cCountry;
		year = cYear;
		coinType = cType;
	}
	
	public String getCountry() {
		return country;
	}
	public int getYear() {
		return year;
	}
	public int getCointype() {
		return coinType;
	}

}
