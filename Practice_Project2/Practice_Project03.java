package Assisted_Practice_Projects2;

class CustomExceptions extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomExceptions(String message) {
        super(message);
    }
}

public class Practice_Project03 {
    public static void main(String[] args) {
        try {
            // Call a method that throws an exception
            divide(10, 0);
        } catch (CustomExceptions e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
    
    public static void divide(int dividend, int divisor) throws CustomExceptions {
        try {
            if (divisor == 0) {
                throw new CustomExceptions("Divisor cannot be zero");
            }
            
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block inside divide method executed");
        }
    }
}
