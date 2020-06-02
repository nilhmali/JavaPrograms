package Singleton;

public class CallSington {

	public static void main(String[] args) {
		
		DPSington x=DPSington.getInstance();
		DPSington y=DPSington.getInstance();
		DPSington z=DPSington.getInstance();
		
		System.out.println(x.s1.toLowerCase());
		System.out.println(y.s1.toUpperCase());
	}

}
