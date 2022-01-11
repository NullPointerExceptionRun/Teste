package main;

import java.util.Arrays;

public class Palindromo {

public static void main(String[] args) {

		// Exemplo entrada
		boolean[] booleans = verifyPalindromes(new String[] { "arara", "jabuticaba", "asa", "caminhao" });
		System.out.println(Arrays.toString(booleans));
		// Exemplo saída [true, false, true, false]
	}

	// Teste 3
	// Dado um array de strings não vazio, retorne um array de booleans indicando se
	// a string é ou não um palíndromo.
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
