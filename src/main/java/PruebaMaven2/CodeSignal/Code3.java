package PruebaMaven2.CodeSignal;

public class Code3 {

	public static boolean checkPalindrome(String inputString) {
	    boolean palindrome = false;
	    String invertida = new StringBuilder(inputString).reverse().toString();
	    if (invertida.equals(inputString)){
	        palindrome = true;
	    } else {
	        palindrome = false;
	    }
	    return palindrome;
	}

}
