package aprenderemosAfondo;

public class NoFuncionaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoFuncionaException() {
		super();
	}
	public NoFuncionaException(String message) {
		super(message);
	}
	public NoFuncionaException(String message, Throwable cause) {
		super(message,cause);
	}
	public NoFuncionaException(Throwable cause) {
		super(cause);
	}
}
