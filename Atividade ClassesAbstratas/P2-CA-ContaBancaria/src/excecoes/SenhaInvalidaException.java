package excecoes;

public class SenhaInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SenhaInvalidaException(String msg) {
		System.out.println(msg);
	}
}
