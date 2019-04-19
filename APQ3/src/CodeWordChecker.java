
public class CodeWordChecker implements StringChecker{
 private int minLength;
 private int maxLength;
 private String notAllowed;
 
 public CodeWordChecker(String symbol)
 {
	 minLength = 6;
	 maxLength = 20;
	 notAllowed = symbol;
 }
 
 public CodeWordChecker(int minLen, int maxLen, String symbol)
 {
 minLength = minLen;
 maxLength = maxLen;
 notAllowed = symbol;
 }
 
 
 public boolean isValid(String str)
 {
	 if (str.length() < minLength || str.length() > maxLength || str.indexOf(notAllowed) == -1) 
	 {
	 return false;
	 }
	 else 
	 {
		 return true;
		 
	 }
 }
 
public static void main(String args[]) {
	StringChecker sc1 = new CodeWordChecker(5, 8, "$");
	System.out.println(sc1.isValid("happy"));

	 
 }
 
}