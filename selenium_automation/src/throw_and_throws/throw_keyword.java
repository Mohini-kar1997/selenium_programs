package throw_and_throws;

public class throw_keyword {
	
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			throw new Exception("automation testing");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println("hi");
	}

}
