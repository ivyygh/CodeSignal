package PruebaMaven2.CodeSignal;

public class Code2 {

	public static int centuryFromYear(int year) {
	    int siglo = year/100;
	    if (year % 100 > 0){
	        siglo++;
	    }
	    return siglo;
	}

}
