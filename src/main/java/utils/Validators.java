package utils;

public class Validators {

	private Validators () {}
	
	/**
	 * Verifica se há caracteres não alfabéticos
	 * 
	 * @param verify String a ser verificada
	 * @return boolean
	 */
		
	public static boolean onlyValidChars(String verify) {
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\\\|,.<>\\/?]+.*");
		
	}
	
	
	
}
