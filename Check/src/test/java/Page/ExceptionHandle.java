package Page;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Hello World......!");
			int i = 1/0;
			System.out.println("Completed");
			
		}
		
		catch(Exception exp){
			
			System.out.println("catch");
			System.out.println("Message : " +exp.getMessage());
			System.out.println("Cause : " +exp.getCause());
			
		}
		
		finally {
			
			System.out.println("Finally over");
		}

	}

}
