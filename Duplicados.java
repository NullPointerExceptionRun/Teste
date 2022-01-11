package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicados {
	public static void main(String[] args) {

        //Dado um array de strings não vazio, remova os dados duplicados em sequência.
        String[] noDuplicates = removeDuplicates(new String[]{"g", "g", "y", "c", "c", "c", "q", "c", "y", "y"});

        System.out.println(Arrays.toString(noDuplicates));

        //System.out.println(Arrays.toString(strings));
        //Exemplo saída ["g", "y", "c", "q", "c", "y"]
    }

    public static String[] removeDuplicates(String[] values) {
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            if (i + 1 < values.length && !values[i].equals(values[i + 1])) {
                lista.add(values[i]);
            }
        }
        
        lista.add(values[values.length - 1]);
        return lista.toArray(new String[]{});
    }

}


