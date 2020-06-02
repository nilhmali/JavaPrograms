package Singleton;

public class DPSington {

	private static DPSington refvarible = null;

	public  String s1;

	//Constructor
	private DPSington() {
		
		s1="HELLO nilesh mali";

	}
	
	//Return sington object
	public static DPSington getInstance()
	{
		if(refvarible==null)
		
			refvarible=new DPSington();
		
		
		return refvarible;
		
	}

}
