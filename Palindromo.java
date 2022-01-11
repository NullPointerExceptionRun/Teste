package main;

import java.util.Arrays;

public class Palindromo {

public static void main(String[] args) {

		// Exemplo entrada
		boolean[] booleans = verifyPalindromes(new String[] { "arara", "jabuticaba", "asa", "caminhao" });
		System.out.println(Arrays.toString(booleans));
		// Exemplo sa�da [true, false, true, false]
	}

	// Teste 3
	// Dado um array de strings n�o vazio, retorne um array de booleans indicando se
	// a string � ou n�o um pal�ndromo.
	public static boolean[] verifyPalindromes(String[] values) {
		boolean[] arr = {};
		if (values != null && values.length > 0) {
			arr = new boolean[values.length];

			for (int i = 0; i < values.length; i++) {
				boolean isPalindrome = values[i].equalsIgnoreCase(new StringBuilder(values[i]).reverse().toString());
				arr[i] = isPalindrome;
			}
		}
		return arr;
	}

}
