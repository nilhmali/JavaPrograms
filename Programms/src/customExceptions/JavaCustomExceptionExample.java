package customExceptions;

public class JavaCustomExceptionExample {

	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new CustomException("This is My error Message");
		}
		catch(CustomException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}