package exception;

public class NullPoint_Exception {
	
	private static String str;

	public static void main(String args[]){
		try{
			str = null;
			System.out.println (str.length());
		}catch(NullPointerException e){
			System.out.println("Exception occured " +e);;
		}
	}
}