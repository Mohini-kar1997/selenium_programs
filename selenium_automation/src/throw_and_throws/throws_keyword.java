package throw_and_throws;

public class throws_keyword {

	public static void main(String[] args) {
		// used to declare an exception
		throws_keyword  tk=new throws_keyword ();
		tk.sum();
		System.out.println("hello");
		
		

	}
	
	public void sum() {
		try {
		div();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

	
	public void div() throws ArithmeticException, NullPointerException, IndexOutOfBoundsException {
		int i=10/0;
		int j=100/0;
	}
}
