package throw_and_throws;

public class throw_keyword2 {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
		throw new Exception("automation testing");
	//	throw new Exception("automation testing");
		//we can throw only single exception
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
