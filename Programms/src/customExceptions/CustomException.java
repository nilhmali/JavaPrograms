package customExceptions;

public class CustomException extends Exception {
	
	String str1;
	   /* Constructor of custom exception class
	    * here I am copying the message that we are passing while
	    * throwing the exception to a string and then displaying 
	    * that string along with the message.
	    */
	CustomException(String str2) {
		str1=str2;
	   }
}
