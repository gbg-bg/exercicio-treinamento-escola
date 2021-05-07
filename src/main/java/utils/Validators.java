package utils;

public class Validators {

	private Validators () {}
	
	/**
	 * Verifica se h� caracteres n�o alfab�ticos
	 * 
	 * @param verify String a ser verificada
	 * @return boolean
	 */
		
	public static boolean onlyValidChars(String verify) {
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\\\|,.<>\\/?]+.*");
		
	}
	
	
	
}
