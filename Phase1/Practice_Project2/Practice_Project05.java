package Assisted_Practice_Projects2;

class CustomException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
        super(message);
    }
}

public class Practice_Project05 {
    private static String nullString;

	public static void main(String[] args) {
        try {
            // Throw an exception
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed.");
        }

        try {
            // Throw a built-in exception
            throwException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom exception.");
    }

    public static void throwException() {
        nullString = null;
        nullString.length(); // This will throw a NullPointerException
    }
}
