package Page;

public class ExceptionHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void call() throws Exception {
		
		System.out.println("Hello World......!");
		int i = 1/0;
		System.out.println("Completed");
		
	}

}
